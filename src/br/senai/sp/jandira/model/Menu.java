package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Cliente referenciaCliente = new Cliente();
    Conta referenciaConta = new Conta();

    Scanner scanner = new Scanner(System.in);



    public void executarMenu() {
        boolean exit = false;

    while (!exit) {
            System.out.println("=0=0= MENU =0=0=");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Gerar Conta");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Realizar Deposito");
            System.out.println("5 - Realizar Saque");
            System.out.println("6 - Realizar Transferência");
            System.out.println("7 - Sair");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    Cliente cliente = new Cliente();
                    cliente.cadastrarCliente();
                    referenciaCliente.adicionarCliente(cliente);
                    break;

                case 2:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfTitular = scanner.nextLong();
                    scanner.nextLine();

                    Cliente clienteConta = referenciaCliente.pesquisarCliente(cpfTitular);

                    if (clienteConta != null){
                        Conta conta = new Conta();
                        conta.gerarConta(clienteConta);
                        referenciaConta.adicionarConta(conta);
                        System.out.println("Conta criada com sucesso...");

                    }else {
                        System.out.println("O cliente não tem cadastro...");
                    }

                    break;

                case 3:

                    System.out.println("Informe o CPF do Titular: ");
                    long cpfSaldo = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaSaldo = referenciaConta.pesquisarConta(cpfSaldo);

                    if (contaSaldo != null) {
                        contaSaldo.consultarSaldo();
                    }else {
                        System.out.println("O cliente não tem conta cadastrada...");
                    }


                    break;

                case 4:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfDeposito = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaDeposito = referenciaConta.pesquisarConta(cpfDeposito);

                    if (contaDeposito != null) {
                        System.out.println("Informe o valor para deposito: ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();

                        contaDeposito.realizarDeposito(valorDeposito);
                    }else {
                        System.out.println("O cliente não tem conta cadastrada...");
                    }


                    break;

                case 5:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfSaque = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaSaque = referenciaConta.pesquisarConta(cpfSaque);

                    if (contaSaque != null) {
                        System.out.println("Informe o valor para sacar: ");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine();

                        contaSaque.realizarSaque(cpfSaque);
                    }else {
                        System.out.println("O cliente não tem conta cadastrada...");
                    }

                    break;

                case 6:

                    System.out.println("Feature in Development");

                    break;

                case 7:
                    exit = true;
                    break;

            }

        }





    }

}
