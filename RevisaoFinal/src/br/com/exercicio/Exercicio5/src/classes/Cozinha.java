package br.com.exercicio.Exercicio5.src.classes;

import java.util.ArrayList;

public class Cozinha {
    
    String tipo;
    
    public String getTipo() {
        return tipo;
    }

    ArrayList<Prato> Pratos = new ArrayList<Prato>();
    
    public ArrayList<Prato> getPratos() {
        return Pratos;
    }

    public Cozinha(String tipo, ArrayList<Prato> pratos) {
        this.tipo = tipo;
        Pratos = pratos;
    }
}
