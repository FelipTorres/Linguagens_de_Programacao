package br.com.Moto;

import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Moto> listaMoto = new ArrayList<Moto>();


    public Agencia(String nome, ArrayList<Moto> listaMoto) {
        this.nome = nome;
        this.listaMoto = listaMoto;
    }

    void AdicionarMoto(Moto moto) {
        listaMoto.add(moto);
    }

    int getQuantidademoto(){
        return listaMoto.size();
    }
}
