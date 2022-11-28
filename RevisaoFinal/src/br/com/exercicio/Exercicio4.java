package br.com.exercicio;

import javax.swing.*;
import java.awt.*;


public class Exercicio4 {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculator");
        JPanel painelTeclas = new JPanel(null);
        JPanel painelAreaTexto = new JPanel(null);
        Color corBackGround = new Color(128, 128, 128);

        JTextArea jtAreaTexto = new JTextArea();

        JButton jbSete = new JButton("7");
        JButton jbOito = new JButton("8");
        JButton jbNove = new JButton("9");
        JButton jbDivisao = new JButton("/");
        JButton jbQuatro = new JButton("4");
        JButton jbCinco = new JButton("5");
        JButton jbSeis = new JButton("6");
        JButton jbMultiplicação = new JButton("*");
        JButton jbUm = new JButton("1");
        JButton jbDois = new JButton("2");
        JButton jbTres = new JButton("3");
        JButton jbPonto = new JButton(".");
        JButton jbZero = new JButton("0");
        JButton jbMenos = new JButton("-");

        JButton jbIgual = new JButton("=");
        JButton jbMais = new JButton("+");

        painelTeclas.add(jbSete);
        painelTeclas.add(jbOito);
        painelTeclas.add(jbNove);
        painelTeclas.add(jbDivisao);
        painelTeclas.add(jbQuatro);
        painelTeclas.add(jbCinco);
        painelTeclas.add(jbSeis);
        painelTeclas.add(jbMultiplicação);
        painelTeclas.add(jbUm);
        painelTeclas.add(jbDois);
        painelTeclas.add(jbTres);
        painelTeclas.add(jbPonto);
        painelTeclas.add(jbZero);
        painelTeclas.add(jbMenos);
        painelTeclas.add(jbIgual);
        painelTeclas.add(jbMais);



        painelAreaTexto.add(jtAreaTexto);

        painelTeclas.setLayout(new GridLayout(4, 4, 5, 5));
        painelAreaTexto.setLayout(new GridLayout(1, 1, 5, 5));
        janela.setLayout(new GridLayout(2, 1, 5, 5));


        janela.setSize(300, 300);
        painelAreaTexto.setBackground(corBackGround);
        painelTeclas.setBackground(corBackGround);


        janela.add(jtAreaTexto);
        janela.add(painelTeclas);
        janela.setVisible(true);
    }

}
