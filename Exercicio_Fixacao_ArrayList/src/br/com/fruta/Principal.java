package br.com.fruta;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Fruta fruta0 = new Fruta("uva");
        Fruta fruta1 = new Fruta("melancia");
        Fruta fruta2 = new Fruta("banana");

        Sacolao sacolao = new Sacolao("Sacolao", new ArrayList<Fruta>());

        sacolao.AdicionarFruta(fruta0);
        sacolao.AdicionarFruta(fruta1);
        sacolao.AdicionarFruta(fruta2);

        System.out.println(sacolao.getQuantidadeFruta());
    }
}
