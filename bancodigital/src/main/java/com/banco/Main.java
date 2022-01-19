package com.banco;

public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João Versuri");
        Cliente jacque = new Cliente();
        jacque.setNome("Jacqueline Bordim");

        Conta cc = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(jacque);

        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
