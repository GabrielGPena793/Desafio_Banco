package com.Dio;

public class ContaFactory{

    public static Conta contaEspecifica(int tipo, Cliente cliente){

        if (tipo == 1)
            return new ContaCorrente(cliente);
        if (tipo == 2)
            return new ContaPoupanca(cliente);
        return null;

    }
}
