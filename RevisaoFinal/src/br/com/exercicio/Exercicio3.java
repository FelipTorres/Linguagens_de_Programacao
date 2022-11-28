package br.com.exercicio;
import java.awt.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio3 {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Bem - Vindo");

        JLabel nome =new JLabel("Nome ");
        JLabel email =new JLabel("E-mail");
        JButton butao = new JButton("OK");
        
                JTextField tfname = new JTextField();
                JTextField tfEmail = new JTextField();

        JPanel painel = new JPanel();

        painel.add(nome);
        painel.add(tfname);
        painel.add(email);
        painel.add(tfEmail);
        painel.add(butao);

        painel.setLayout(new GridLayout(3, 2, 5, 5));


        janela.getContentPane().add(painel);
        janela.setSize(300,200);
        janela.setVisible(true);

    }

}
