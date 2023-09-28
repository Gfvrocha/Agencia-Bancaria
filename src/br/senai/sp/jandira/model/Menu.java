package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Cliente cliente = new Cliente();
    Conta conta = new Conta();

    Scanner scanner = new Scanner(System.in);



    public void executarMenu() {
        boolean exit = false;

    while (!exit) {
            System.out.println("=0=0= MENU =0=0=");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Realizar Deposito");
            System.out.println("5 - Realizar Saque");
            System.out.println("6 - Realizar Transferencia");
            System.out.println("7 - Sair");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    cliente.cadastrarCliente();
                    break;

                case 2:
                    System.out.println("Feature in Development");
                    break;

                case 3:
                    conta.consultarSaldo();
                    break;

                case 4:
                    System.out.println("Informe o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();

                    conta.realizarDeposito(valorDeposito);

                    break;

                case 5:
                    System.out.println("Informe o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();
                    conta.realizarSaque(valorSaque);

                    break;

                case 6:
                    System.out.println("Informe a sua Agencia: " + conta.getAgencia());
                    System.out.println("Informe a sua Conta: " + conta.getNumeroConta());
                    System.out.println("Seu saldo atual em conta é de R$ " + conta.getSaldo());


                    System.out.println("=0=0= ---- Dados do Destinatario ---- =0=0= ");

                    System.out.println("Informe a Agencia do destinatario: " + conta.getAgencia2());
                    System.out.println("Informe a Conta do destinatario: " + conta.getNumeroConta2());
                    System.out.println("Informe o valor para Transferencia: ");
                    double valorTransferencia = scanner.nextDouble();


                    if (conta.getSaldo() >= valorTransferencia) {
                        System.out.println("Tranferencia no valor de R$" + valorTransferencia + " finalizado com sucesso!");
                        double saldoAtualizado = conta.getSaldo() - valorTransferencia;
                        System.out.println("Seu saldo atual é de R$ " + saldoAtualizado);

                    } else {
                        System.out.println("Por gentileza, atualize o valor.");
                        System.out.println("Seu saldo atual em conta é de R$ " + conta.getSaldo());
                    }
                    break;

                case 7:
                    exit = true;
                    break;

            }

        }





    }

}
