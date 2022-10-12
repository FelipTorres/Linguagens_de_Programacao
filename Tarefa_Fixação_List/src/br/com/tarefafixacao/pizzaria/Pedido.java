package br.com.tarefafixacao.pizzaria;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private String numeroPedido;
    private Date data;
    private Cliente cliente = new Cliente();
    private ArrayList<Pizza> listaPizza = new ArrayList<Pizza>();

    public double calcularValorPedido() {

        double valorTotalPedido = 0;

        for (Pizza pizza : getListaPizza()) {
            valorTotalPedido += pizza.calcularPrecoPizza();
        }

        return valorTotalPedido;
    }

    public String imprimePedido (){
        return ("Pedido: "+getNumeroPedido()+"\nCliente: "+getCliente().getNome()+"\nQuantidade de Pizzas: " + getListaPizza().size() + "\nValor Total do Pedido:" + calcularValorPedido());
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pizza> getListaPizza() {
        return listaPizza;
    }

    public void setListaPizza(ArrayList<Pizza> listaPizza) {
        this.listaPizza = listaPizza;
    }
}
