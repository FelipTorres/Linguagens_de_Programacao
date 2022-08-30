import java.util.Random;

public class exercicio08 {
    public static void main(String[] args) {

        // 8)  Carregue um vetor com 15 números inteiros (Randon). Posteriormente alimente uma matriz com os números armazenados no vetor. Imprima a matriz resultante. :

        int vetor [] = new int [15], x;
        Random aleatorio = new Random();
        int matriz [][] = new int [3][5];


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(20);
            System.out.print(vetor[i] + " ");
        }
        x=0;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = vetor[x];
                x++;
                System.out.print(matriz[i][j] + " ");
                
            }
            
        }


        
    }
    
}
