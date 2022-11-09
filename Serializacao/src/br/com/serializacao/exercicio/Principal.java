package br.com.serializacao.exercicio;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException {

        String pathNomes = "/temp/Nomes.txt";
        String pathSobrenomes = "/temp/Sobrenome.txt";
        String pathNomesSobrenomes = "/temp/NomesSobrenomes.txt";

        ArrayList<String> nomes = new ArrayList<String>(ManipuladorArquivo.leitor(pathNomes));
        
        ArrayList<String> Sobrenomes = new ArrayList<String>(ManipuladorArquivo.leitor(pathSobrenomes));

        ManipuladorArquivo.escritor(pathNomesSobrenomes, nomes, Sobrenomes);


    }
}
