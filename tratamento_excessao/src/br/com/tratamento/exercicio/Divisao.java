package br.com.tratamento.exercicio;

public class Divisao {
    int num1,num2;

    public Divisao()    {

    }
    public Divisao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public double calcula(int num1,int num2)    {
        return num1/num2;
    }
}