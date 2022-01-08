package com.Dio;

public abstract class Conta {
    private final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;

    protected   int agencia , numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = sequencial++;
        this.agencia = this.AGENCIA_PADRAO;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        }
        else System.out.println("Saldo insuficiente!");
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInfoConta(){
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("saldo: " + this.getSaldo());
    }
}
