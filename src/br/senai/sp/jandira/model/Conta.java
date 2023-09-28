package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {

    Scanner scanner = new Scanner(System.in);

    private String agencia = "1258-X";
    private int numeroConta;
    private double saldo = 0;

    private Cliente cliente;

    List<Conta> listConta = new ArrayList<>();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta pesquisarConta(long cpf){
        for (Conta conta: listConta) {
            long cpfConta = conta.cliente.getCpf();

            if (cpfConta == cpf) {
                return conta;
            }
        }
        return null;
    }

    public void adicionarConta(Conta conta){
        listConta.add(conta);

    }

    public void gerarConta(Cliente cliente) {
        this.cliente = cliente;
        numeroConta = (int)(Math.random()*10000);
    }



    public void realizarDeposito(double valor){
        this.saldo += valor;
        System.out.println("O saldo disponivel na conta é: " + this.saldo);


    }

    public void realizarSaque(double valor){

        boolean validaSaque = avaliarSaque(valor);

        if (validaSaque) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }


        System.out.println("O saldo disponivel na conta é: " + this.saldo);

    }

    public void consultarSaldo(){
        System.out.println("O saldo disponivel na conta é: " + this.saldo);

    }

    public boolean avaliarSaque(double valor){
        if (this.saldo >= valor){
            return true;
        } else {
            return false;
        }

    }

    public void realizarTransferencia(Conta contaUser, Conta contaDestinatario) {

        System.out.println("Informe o valor para transferencia: ");
        double valorTransferencia = scanner.nextDouble();
        scanner.nextLine();

        double saldoDisponivel = contaUser.getSaldo();

        if (saldoDisponivel >= valorTransferencia){
            saldoDisponivel -= valorTransferencia;

            contaUser.setSaldo(saldoDisponivel);

            double saldoDestinatario = contaDestinatario.getSaldo();

            saldoDestinatario += valorTransferencia;
            contaDestinatario.setSaldo(saldoDestinatario);

            System.out.println("Transferencia realizada com sucesso");
        } else {
            System.out.println("Saldo não disponivel...");
        }




    }







}
