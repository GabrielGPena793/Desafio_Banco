package com.Dio;

public class ContaPoupanca  extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfoConta() {
        System.out.println("==== Conta Corrente ====");
        super.imprimirInfoConta();
    }
}
