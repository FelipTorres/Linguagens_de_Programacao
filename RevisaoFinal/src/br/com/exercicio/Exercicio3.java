package br.com.exercicio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exercicio3 {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Bem - Vindo");

        String nome = "";
        String email = "";
        JButton butao = new JButton("OK");

        nome = JOptionPane.showInputDialog("Nome ");
        email = JOptionPane.showInputDialog("E-mail ");
        JPanel painel = new JPanel();

        painel.add(butao);


    }

}
