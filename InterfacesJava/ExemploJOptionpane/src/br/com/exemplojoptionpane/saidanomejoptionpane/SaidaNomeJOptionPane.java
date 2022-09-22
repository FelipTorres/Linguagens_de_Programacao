package br.com.exemplojoptionpane.saidanomejoptionpane;

import javax.swing.JOptionPane;

public class SaidaNomeJOptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome : ");
        
        String nomeCompleto = nome + " " + sobrenome;

        JOptionPane.showMessageDialog(null, "Nome completo : " + nomeCompleto, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}
