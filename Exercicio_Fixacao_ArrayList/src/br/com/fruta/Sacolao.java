package br.com.fruta;

import java.util.ArrayList;

public class Sacolao {
    private String nome;
    private ArrayList<Fruta> listaFruta = new ArrayList<Fruta>();

    void AdicionarFruta(Fruta fruta) {
        listaFruta.add(fruta);
    }

    int getQuantidadeFruta(){
        return listaFruta.size();
    }


}
