package br.com.fruta;

import java.util.ArrayList;

public class Sacolao {
    private String nome;
    private ArrayList<Fruta> listaFruta = new ArrayList<Fruta>();

    public Sacolao(String nome, ArrayList<Fruta> listaFruta) {
        this.nome = nome;
        this.listaFruta = listaFruta;
    }

    void AdicionarFruta(Fruta fruta) {
        listaFruta.add(fruta);
    }

    int getQuantidadeFruta(){
        return listaFruta.size();
    }


}
