package br.com.pratica2.questao3frase;

import java.util.Scanner;

// Faça um programa que leia uma frase, calcule e mostre o número de vogais existentes, sem repetição.

public class Frase {

    public static void main(String[] args) {
        String frase;
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite uma frase");
        frase = ler.nextLine();

        calculaVogais(frase);

        ler.close();
    }

    public static void calculaVogais (String frase)
    {
        int contVogal = 0 ;
        final String VOGAIS = "AEIOU";
        String vogalReferencia="";

        for (int i = 0; i < VOGAIS.length(); i++) {
            vogalReferencia = VOGAIS.substring(i, i+1);

            if (frase.contains(vogalReferencia) || frase.contains(vogalReferencia.toLowerCase())) {
                contVogal ++;
            } 
        }
        System.out.println("A frase tem " + contVogal + " vogais ");
    }
}
