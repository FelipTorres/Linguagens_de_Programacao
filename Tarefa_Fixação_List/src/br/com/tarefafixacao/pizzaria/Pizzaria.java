package br.com.tarefafixacao.pizzaria;

import java.util.Random;

import javax.swing.JOptionPane;

public class Pizzaria {
    public static void main(String[] args) {
        Pizza pizzaEscolha= new Pizza();
        Random aleatorio = new Random();

        Pedido pedido1 = new Pedido();

        String opcaoMenuPrincipal = "";

        JOptionPane.showMessageDialog(null, "Seja bem Vindo a Pizzaria Casa Nostra", "Pizzaria Casa Nostra", 0);

        pedido1.getCliente().setNome(JOptionPane.showInputDialog(null, "Informe o seu nome:"));

        do {
            opcaoMenuPrincipal = JOptionPane.showInputDialog(null,
                    "Digite o número do Ingrediente da pizza\n1.	Mussarela\n2.	Bacon\n3.	Presunto\n4.	Frango\n5.	Requeijão\n6.	Possui borda\n7.	Deseja outra pizza?\n8.	Finalizar");

                    switch (opcaoMenuPrincipal) {
                // 1. Mussarela
                case "1":
                    pizzaEscolha.adicionarIngredientesPizza("Mussarela");
                break;
                // 2. Bacon
                case "2":
                    pizzaEscolha.adicionarIngredientesPizza("Bacon");
                    break;
                // 3. Presunto
                case "3":
                    pizzaEscolha.adicionarIngredientesPizza("Presunto");
                    break;
                // 4. Frango
                case "4":
                    pizzaEscolha.adicionarIngredientesPizza("Frango");
                    break;
                // 5. Requeijão
                case "5":
                    pizzaEscolha.adicionarIngredientesPizza("Requeijão");
                    break;
                // 6. Possui borda
                case "6":

                        int escolhaBorda = JOptionPane.showConfirmDialog(null, "Gostaria de borda recheada ? ?", "Borda Recheada", 0);

                         pizzaEscolha.setPossuiBordaRecheada(escolhaBorda == 0 ? true : false);
                        break;
                // 7. Deseja outra pizza?
                case "7":
                    pedido1.getListaPizza().add(pizzaEscolha);
                    pizzaEscolha = new Pizza();

                    break;
                // 8. Finalizar

                case "8":

                    pedido1.getListaPizza().add(pizzaEscolha);

                    pedido1.setNumeroPedido(Integer.toString(aleatorio.nextInt(99999)));

                    JOptionPane.showMessageDialog(null, pedido1.imprimePedido(), "Resumo do Pedido", 0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", 0);
                    break;
            }

        } while (!opcaoMenuPrincipal.equals("8"));

    }
}
