import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        // 5)  Faça um algoritmo que armazene as descrições de 5 produtos, armazene também os preços de venda dos mesmos. Atualize os preços de venda aplicando  o percentual de 10%. Imprima as descrições e seus novos preços de venda. 

        Scanner ler = new Scanner (System.in);
    
        String desc [] = new String [5];
        Double preco [] = new Double [5];

        for (int i = 0; i < preco.length; i++) {
            System.out.println("Entre com a descrição do produto "+i+":");
                desc[i] = ler.nextLine();
            System.out.println("Entre com a valor do produto "+i+":");
                preco[i] = ler.nextDouble()*1.1;
                
            
            ler = new Scanner (System.in);
        }

        for (int i = 0; i < preco.length; i++) {
            System.out.println("Produto "+ i);
            System.out.println("Desc : "+ desc[i]);
            System.out.println("Valor : "+ preco[i]);
            System.out.println();
        }
        ler.close();
    
    }
}
