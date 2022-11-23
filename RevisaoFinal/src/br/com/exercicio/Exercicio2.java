package br.com.exercicio;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        int qtdPublico = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Qual a quantidade de pessoa presente no jogo de abertura da copa?"));
        Double valorIngresso = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do ingresso?"));
        Double valorArrecadado = qtdPublico * valorIngresso;

        JOptionPane.showMessageDialog(null,
                "O valor de arrecadação do primeiro jogo de abertura da copa do mundo foi: " + valorArrecadado,
                "Resultado", 1);

    }

}
