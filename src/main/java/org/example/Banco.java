package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco{

    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }
    public void imprimirContas(){
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta registrada.");
        } else {
            System.out.println("\n---Contas registradas---");
            for (Conta conta : contas) {
                System.out.println(conta);
                System.out.println("-------------------------");
            }
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
