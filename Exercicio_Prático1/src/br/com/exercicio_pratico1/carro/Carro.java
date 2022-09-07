package br.com.exercicio_pratico1.carro;

public class Carro {
    private String nome;
    private String cor;


    public  Carro (String nome, String cor){
        this.nome = nome;
        this.cor  = cor;
    }

    public void andar(float velocidade){
        System.out.println("O carro está andando a " + velocidade + "Por hora" );
    }
}
