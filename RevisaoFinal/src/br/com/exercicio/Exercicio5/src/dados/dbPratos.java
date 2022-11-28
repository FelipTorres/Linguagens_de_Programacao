package br.com.exercicio.Exercicio5.src.dados;

import java.util.ArrayList;

import br.com.exercicio.Exercicio5.src.classes.Prato;

public class dbPratos {
    static ArrayList<Prato> pratos = new ArrayList<Prato>();

    public static ArrayList<Prato> gePratos() {
        pratos.add(
                new Prato("Tropeiro", 25.));
        pratos.add(
                new Prato("Carbonara", 30.));

        return pratos;
    }

}
