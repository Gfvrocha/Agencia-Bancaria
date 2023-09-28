package br.senai.sp.jandira.model;

public class Conta {

    private String agencia = "1234-x";
    private String agencia2 = "4321-z";
    private int numeroConta = 98745;
    private int numeroConta2 = 36985 ;
    private double saldo = 6943.80;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia2() {
        return agencia2;
    }

    public void setAgencia2(String agencia2) {
        this.agencia2 = agencia2;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta2() {
        return numeroConta2;
    }

    public void setNumeroConta2(int numeroConta2) {
        this.numeroConta2 = numeroConta2;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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






}
