package com.banco;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente c344412 = new Cliente();
        c344412.setNome("João Paulo");
        Cliente c376699 = new Cliente();
        c376699.setNome("Jacqueline");

        Conta cc = new ContaCorrente(c344412);
        Conta poupanca = new ContaPoupanca(c376699);
        banco.contas.add(cc);
        banco.contas.add(poupanca);

        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();




    }

}