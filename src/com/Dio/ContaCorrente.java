package com.Dio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public  void imprimirInfoConta() {
        System.out.println("==== Conta Corrente ====");
        super.imprimirInfoConta();
    }
}