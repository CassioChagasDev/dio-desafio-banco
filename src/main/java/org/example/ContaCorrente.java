package main.java.org.example;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Banco banco){
        super(cliente, banco);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("\n---Extrato Conta Corrente---");
        System.out.println(this);
    }
}
