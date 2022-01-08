package com.Dio;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    List<Conta> contas = new ArrayList<>();

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void exibirContas(){
        contas.forEach(Conta::imprimirInfoConta);
    }

}
