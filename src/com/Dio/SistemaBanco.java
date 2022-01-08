package com.Dio;

import java.util.Scanner;

public class SistemaBanco {
    Scanner scanner = new Scanner(System.in);
    Conta conta;

    public void menu(){
        int respostaCliente;

        do {
            System.out.println("""
                    ================================
                    Deseja criar uma nova conta ?
                    1 - sim
                    2 - não
                    ================================
                    """);
            respostaCliente= scanner.nextInt();

            if (respostaCliente == 1){
                this.menuCriacaoConta();
            }
            else if (respostaCliente != 2) System.out.println("Digite uma opção válida");

        }while (respostaCliente != 2);

        System.out.println("Obrigado por contar conosco, Volte sempre!");
    }

    public void menuCriacaoConta(){
        int respostaCliente;

        do {
            System.out.println("""
                    ================================
                    Que tipo de conta deseja criar ?
                    1 - Corrente
                    2 - Poupança
                    ================================
                    """);
            respostaCliente = scanner.nextInt();

            if (respostaCliente > 2 || respostaCliente < 1){
                System.out.println("Digite um número válido!");
                continue;
            }

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            Cliente cliente = new Cliente(nome);

            conta = ContaFactory.contaEspecifica(respostaCliente, cliente);
            break;
        }while (true);

        System.out.println("Conta criada com sucesso!");
        System.out.println("""
                Deseja visualizar os dados da conta?
                1 - sim
                2 - não
                """);
        respostaCliente = scanner.nextInt();
        if (respostaCliente == 1) conta.imprimirInfoConta();

        do {
            System.out.println("1 - Para de visualizar");
            respostaCliente = scanner.nextInt();
            if (respostaCliente == 1) break;
        }while (true);


    }

}
