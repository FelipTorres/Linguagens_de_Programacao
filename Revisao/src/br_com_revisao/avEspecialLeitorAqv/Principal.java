package avEspecialLeitorAqv;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws IOException {

        String pathPlantas = "/temp/Plantas.txt";
        // String pathNomes = "/temp/Nomes.txt";


        ArrayList<String> plantasEscrita = new ArrayList<String>(ManipuladorArquivo.leitor(pathPlantas));

        for (String nomePlanta : plantasEscrita) {
            
            if (nomePlanta.equals("Jasmin")) {
                JOptionPane.showMessageDialog(null, "Planta com nome Jasmin encontrada : - ) ", "Planta", 0);
            }
        }
        

    }
}
