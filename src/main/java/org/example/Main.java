package main.java.org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Meu Banco", new ArrayList<>());

        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        Cliente cassio = new Cliente();
        cassio.setNome("Cassio");

        Conta conta1 = new ContaCorrente(cliente1, banco);
        Conta conta2 = new ContaPoupanca(cliente2, banco);

        Conta corrente = new ContaCorrente(cassio, banco);
        Conta poupanca = new ContaPoupanca(cassio, banco);

        corrente.depositar(100);
        corrente.transferir(poupanca, 100);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();


        banco.imprimirContas();

    }
}
