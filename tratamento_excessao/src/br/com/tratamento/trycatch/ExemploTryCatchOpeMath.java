package br.com.tratamento.trycatch;

import javax.swing.JOptionPane;

public class ExemploTryCatchOpeMath {

	public static void main(String[] args) {
		System.out.println("Inicio do Programa. ");
	
	try	{
		int a  = Integer.parseInt(JOptionPane.showInputDialog("a: "));
		int b  = Integer.parseInt(JOptionPane.showInputDialog("b: "));
		System.out.println("Divisao = " + (a/b));
		System.out.println("Multiplicacao = " + (a*b));
		System.out.println("Soma = " + (a+b));
		System.out.println("Subtracao = " + (a-b));
	}catch	(ArithmeticException e1)	{
		System.out.println("Nao pode Dividir por Zero!!!");
	}catch (NumberFormatException e2)	{
		System.out.println("Digite um numero Valido!");
	}
	System.out.println("Fim do Programa.");
	}

}