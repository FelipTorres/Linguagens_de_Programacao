package br.com.exercicio;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        String jogador = "";
        String selecao = "";

        jogador = JOptionPane.showInputDialog(null, "Digite o seu jogador preferido", "Jogador", 1);
        selecao = JOptionPane.showInputDialog(null, "Digite  a Seleção do jogador", "Seleção", 1);

        JOptionPane.showMessageDialog(null, "O jogador " + jogador + " é da seleção " + selecao + ".", "Resultado", 0);

    }

}
