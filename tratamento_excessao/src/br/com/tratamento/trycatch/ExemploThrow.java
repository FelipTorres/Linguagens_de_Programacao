package br.com.tratamento.trycatch;

import java.util.Scanner;

public class ExemploThrow {
    public static final String SENHASECRETA = "123456";
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Digite a senha: ");
            String senha = ler.nextLine();
            if (!senha.equals(SENHASECRETA)) {
            throw new Exception("Senha Invalida!!!");
            }
            System.out.println("Senha Correta \nBem Vindo(a)!!!");
        }catch (Exception ex)   {
            System.out.println(ex.getMessage());
        }
    }

}