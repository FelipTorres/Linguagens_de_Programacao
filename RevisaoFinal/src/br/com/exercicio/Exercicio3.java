package br.com.exercicio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio3 {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Bem - Vindo");

        JLabel nome =new JLabel("Nome ");
        JLabel email =new JLabel("E-mail");
        JButton butao = new JButton("OK");
        JLabel labelCEP = new JLabel("CEP:");
        labelCEP.setBounds(50,40,100,20);

        JPanel painel = new JPanel();


        painel.add(labelCEP);
        painel.add(nome);
        painel.add(email);
        painel.add(butao);

        janela.getContentPane().add(painel);
        janela.setSize(300,200);
        janela.setVisible(true);

    }

}
