package br.com.exercicio.Exercicio6.src;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String pathArquivo = "/temp/NomesJogadores.txt";

        String quantidade = JOptionPane
                .showInputDialog("Qual a quantidade de Nomes de jogadores que vc gostaria de aceitar?");

        ArrayList<String> nomeJogador = new ArrayList<String>();
        for (int i = 0; i < Integer.parseInt(quantidade); i++) {
            nomeJogador.add(JOptionPane.showInputDialog("Digite o nome do " + i + "º jogador : "));

        }
        ManipuladorArquivo.escritor(pathArquivo, nomeJogador);

        ArrayList<String> resultadoLeitura = ManipuladorArquivo.leitor(pathArquivo);

        JOptionPane.showMessageDialog(null, resultadoLeitura, "Resultado Leitura", 0);

        for (String string : resultadoLeitura) {

            if (string.contains("Neymar")) {
                JOptionPane.showMessageDialog(null, "Neymar é um dos jogadores preferidos");
            }

        }
    }

}
