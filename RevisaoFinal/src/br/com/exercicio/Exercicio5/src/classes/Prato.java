package br.com.exercicio.Exercicio5.src.classes;

public class Prato {

    String nome;

    public String getNome() {
        return nome;
    }

    Double valor;

    public Double getValor() {
        return valor;
    }

    public Prato(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

}
