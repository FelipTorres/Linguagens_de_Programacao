package br.com.serializacao.exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.LogManager;

public class ManipuladorArquivo {

    public static ArrayList<String> leitor(String path) throws IOException {
        ArrayList<String> nomes = new ArrayList<String>();
        BufferedReader buffRead = new BufferedReader(new FileReader(path));

        String linha = "";

        long qtqLinha = buffRead.lines().count();

        buffRead.close();
        buffRead = new BufferedReader(new FileReader(path));

        for (long i = 0; i < qtqLinha; i++) {
            linha = buffRead.readLine();
            nomes.add(linha);
            System.out.println(linha);
        }

        buffRead.close();
        return nomes;

    }

    public static void escritor(String path, ArrayList<String> nomes, ArrayList<String> sobrenomes) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

        String linha = "";


        int numeroLinha = nomes.size() - 1;

        for (int i = 0; i < numeroLinha; i++) {

            linha = nomes.get(i) + " " + sobrenomes.get(i);

            buffWrite.append(linha + "\n");

        }

        buffWrite.close();

        System.out.println(buffWrite);
    }
}
