package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    private String nome;
    private long cpf, rg, telefone;

    Scanner scanner = new Scanner(System.in);



    public void cadastrarCliente(){

        System.out.println("=0=0= Cadastrar Cliente =0=0=");
        System.out.println("Informe seu NOME: ");
        nome = scanner.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf = scanner.nextLong();
        System.out.println("Informe seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe seu TELEFONE: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");


    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public long getCpf(){
        return cpf;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}


