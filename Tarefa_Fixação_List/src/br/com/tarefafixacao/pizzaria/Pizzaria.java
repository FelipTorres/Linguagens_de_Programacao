package br.com.tarefafixacao.pizzaria;

import javax.swing.JOptionPane;

public class Pizzaria {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();

        boolean saidaMenu = false;

        JOptionPane.showMessageDialog(null, "Seja bem Vindo a Pizzaria Casa Nostra", "Pizzaria Casa Nostra", 0);

        pedido1.getCliente().setNome(JOptionPane.showInputDialog(null, "Informe o seu nome:"));


        do {
            
            pedido1.getListaPizza().add

        } while (saidaMenu);
        

    }
}
