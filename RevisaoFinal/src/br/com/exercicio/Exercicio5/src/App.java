package br.com.exercicio.Exercicio5.src;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.exercicio.Exercicio5.src.classes.Cozinha;
import br.com.exercicio.Exercicio5.src.classes.Pedido;
import br.com.exercicio.Exercicio5.src.classes.Prato;
import br.com.exercicio.Exercicio5.src.dados.dbCozinhas;
import br.com.exercicio.Exercicio5.src.dados.dbPratos;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido meuPedido;

        ArrayList<Cozinha> cozinhas = new ArrayList<Cozinha>();

        cozinhas.add(new Cozinha("Árabe", dbPratos.gePratos()));
        cozinhas.add(new Cozinha("Italiana", dbPratos.gePratos()));
        cozinhas.add(new Cozinha("Mineira", dbPratos.gePratos()));

        String opcao = "";
        do {

            opcao = JOptionPane.showInputDialog(textoMenuInicial(cozinhas));

            if (Integer.parseInt(opcao) <= cozinhas.size()) {
                meuPedido = new Pedido(cozinhas.get(Integer.parseInt(opcao)));

                do {
                    opcao = JOptionPane.showInputDialog(textoMenuEscolherPratos(meuPedido.getPratos()));
                } while (!opcao.equalsIgnoreCase("N"));
            }

        } while (!opcao.equalsIgnoreCase("N"));

    }

    private static String textoMenuEscolherPratos(ArrayList<Prato> pratos) {

        String texto = "Selecione os pratos desejados \n";
        for (int i = 0; i < pratos.size(); i++) {
            texto += "\t " + i + " - " + pratos.get(i).getNome() + " \t R$ " + pratos.get(i).getValor();

        }
        texto += "\t N - Sair";
        return texto;
    }

    private static Object textoMenuInicial(ArrayList<Cozinha> cozinhas) {
        String texto = "Escolha um restaurante\n";
        for (int i = 0; i < cozinhas.size(); i++) {
            texto += "\t" + i + " - " + cozinhas.get(i).getTipo() + "\n";
        }
        texto += "\t N - Sair";

        return texto;
    }
}
