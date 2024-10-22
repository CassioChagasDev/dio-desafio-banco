package main.java.org.example;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, Banco bc) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        bc.addConta(this);
    }

    @Override
    public void sacar(double valor) {
        validarValorPositivo(valor);
        validarSaldoSuficiente(valor);
        saldo -= valor;
    }


    @Override
    public void depositar(double valor) {
        validarValorPositivo(valor);
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return String.format("\nTitular: %s\nAgência: %d\nNúmero: %d\nSaldo: %f",
                this.cliente.getNome(), this.agencia, this.numeroConta, this.saldo);
    }


    public int getAgencia() {
        return agencia;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    private void validarValorPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
    }

    private void validarSaldoSuficiente(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

}
