package br.com.Moto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Moto moto1 = new Moto("CG", "Vermelha");
        Moto moto2 = new Moto("Tyger", "Cinza");

        Agencia agencia = new Agencia("Agencia", new ArrayList<Moto>());

        agencia.AdicionarMoto(moto2);
        agencia.AdicionarMoto(moto1);

        System.out.println(agencia.getQuantidademoto());
    }

}
