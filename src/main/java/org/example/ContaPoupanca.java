package main.java.org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco){
        super(cliente, banco);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("\n---Extrato Conta Poupança---");
        System.out.println(this);
    }
}