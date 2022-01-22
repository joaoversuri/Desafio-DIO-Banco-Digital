package com.banco;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco = new Banco();

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfoConta() {
        System.out.println("===== Conta =====");
        System.out.printf("Numero da conta: %d", this.numConta);
        System.out.printf("\nAgencia: %d", this.agencia);
        System.out.printf("\nSaldo: %.2f\n", this.saldo);
    }

    public void imprimirInfoBanco(){
        System.out.println("===== Banco =====");
        System.out.println(banco.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.println(banco.getEndereco());
    }

    public void imprimirInfoCliente(){
        System.out.println("===== Cliente =====");
        System.out.println("Nome: "+this.cliente.getNome());
    }

}
