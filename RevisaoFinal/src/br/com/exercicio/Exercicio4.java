package br.com.exercicio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel(null);

        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("."));
        panel.add(new JButton("0"));
        panel.add(new JButton("-"));

        panel.add(new JButton("="));
        panel.add(new JButton("+"));


        frame.setSize(300,300);

        frame.add(panel);
        frame.setVisible(true);
    }

}
