package br.com.tratamento.exercicio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// int num1,num2;
		Divisao di = new Divisao(0, 0);
		try {
			int num1, num2;
			System.out.println("Digite um valor para dividir");
			num1 = ler.nextInt();
			System.out.println("Digite um valor para ser dividido");
			num2 = ler.nextInt();
			if (num2 == 0) {
				throw new Exception("Nao e possivel fazer uma divisao por Zero!!!");
			}
			System.out.println(num1 + " / " + num2 + " = " + (di.calcula(num1, num2)));

		} catch (Exception ex) {
			System.out.println("ERRO: " + ex.getMessage());
		} finally {
			System.out.println("Bloco Finally");
		}
	}

}