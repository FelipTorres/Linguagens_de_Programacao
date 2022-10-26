package br.com.Carro;

import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList <Carro> listaCarro = new ArrayList<Carro>() ;

    public Agencia(String nome, ArrayList<Carro> listaCarro) {
        this.nome = nome;
        this.listaCarro = listaCarro;
    }

    void adicionaCarro(Carro Carro){
        listaCarro.add(Carro);
    }

    int GetQuantidadeCarro(){
        return listaCarro.size();
    }

}
