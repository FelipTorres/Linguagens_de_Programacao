package br.com.tratamento.trycatch;

public class ExemploTryCatchDivide2 {
	public static void main(String [] args)	{
		try	{
			int dividendo = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			divide(dividendo,divisor);
		}catch (ArithmeticException e1)	{
			System.out.println("Nao pode dividir por Zero");
		}catch (ArrayIndexOutOfBoundsException e2)	{
			System.out.println("Favor informar dois Numeros!");
		}
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisao = " + (dividendo / divisor));
	}
}