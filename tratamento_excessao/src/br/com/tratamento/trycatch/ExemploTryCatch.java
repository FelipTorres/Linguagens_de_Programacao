package br.com.tratamento.trycatch;

import java.util.Scanner;

public class ExemploTryCatch {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		try {
			System.out.println("Digite um valor Inteiro...:");
			int num1 = ler.nextInt();
			System.out.println("Digite um valor Inteiro...:");
			int num2 = ler.nextInt();

			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} catch (Exception ex) {
			System.out.println("ERRO - Valor digitado nao e um numero Inteiro!");
		}
	}
}