package br.com.tratamento.trycatch;

import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            int dividendo, divisor;
            System.out.println("Digite o valor do Dividendo: ");
            dividendo = ler.nextInt();
            System.out.println("Valor do divisor: ");
            divisor = ler.nextInt();
            if (divisor == 0) {
                throw new Exception("Nao e possivel fazer uma divisao por Zero!!!");
            }
            System.out.println(dividendo+" / "+divisor+" = "+(dividendo/divisor));
        }catch(Exception ex)    {
            System.out.println("ERRO: " + ex.getMessage());
        }finally    {
            System.out.println("Bloco Finally");
        }
    }
}