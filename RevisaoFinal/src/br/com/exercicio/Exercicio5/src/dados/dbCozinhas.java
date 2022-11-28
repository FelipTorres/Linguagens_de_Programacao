package br.com.exercicio.Exercicio5.src.dados;

import java.util.ArrayList;

import br.com.exercicio.Exercicio5.src.classes.Cozinha;

public class dbCozinhas {
    private ArrayList<Cozinha> cozinhas = new ArrayList<Cozinha>();

    public ArrayList<Cozinha> getCozinhas() {
        this.cozinhas.add(
                new Cozinha("Árabe", dbPratos.gePratos() ));
        this.cozinhas.add(
                new Cozinha("Italiana",dbPratos.gePratos()));
        this.cozinhas.add(
                new Cozinha("Mineira",dbPratos.gePratos()));

        return cozinhas;
    }

}
