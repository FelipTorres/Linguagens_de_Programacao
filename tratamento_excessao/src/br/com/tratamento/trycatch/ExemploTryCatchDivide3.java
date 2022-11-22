package br.com.tratamento.trycatch;

import javax.swing.JOptionPane;

public class ExemploTryCatchDivide3 {

	public static void main(String[] args) {

		int dividendo, divisor;
		while (true) {
			try {
				dividendo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dividendo: "));
				divisor = Integer.parseInt(JOptionPane.showInputDialog("Entre com Divisor: "));
				divide(dividendo, divisor);
				break;
			} catch (ArithmeticException e1) {
				JOptionPane.showMessageDialog(null, "Nao pode dividir por Zero");
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Favor informar apenas Numeros Inteiros!");
			}
		}
	}

	public static void divide(int dividendo, int divisor) {
		JOptionPane.showMessageDialog(null, "Divisao = " + (dividendo / divisor));
	}
}