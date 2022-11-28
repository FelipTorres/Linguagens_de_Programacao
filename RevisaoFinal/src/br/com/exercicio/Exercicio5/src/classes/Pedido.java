package br.com.exercicio.Exercicio5.src.classes;

import java.util.ArrayList;
import java.util.Random;

public class Pedido  extends Cozinha{
    Random aleatorio = new Random();
    int codigo;
    ArrayList<Prato> pratosEscolhidos;
    
    
    public Pedido(String tipo, ArrayList<Prato> pratos) {
        super(tipo, pratos);
        pratosEscolhidos = new ArrayList<>(pratos);
    }




    public Pedido(Cozinha cozinha) {
        super(cozinha.getTipo(), cozinha.getPratos());
        this.codigo =  aleatorio.nextInt(1000);
    }


    public Double CalcularValorPedido(){
        Double valor = 0.;

        for (Prato prato : Pratos) {

            valor +=prato.getValor();
        }

        return valor;
        
    }
    
}
