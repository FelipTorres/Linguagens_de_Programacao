package br.com.Carro;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Palio","Rosa");

        Carro carro2 = new Carro("Gol", "preta");

        Agencia agencia = new Agencia("Agencia Blue", new ArrayList<Carro>());

        agencia.adicionaCarro(carro1);
        agencia.adicionaCarro(carro2);

        System.out.println(agencia.GetQuantidadeCarro());
    }
}
