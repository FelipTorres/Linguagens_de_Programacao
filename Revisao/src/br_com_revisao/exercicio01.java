import java.util.Scanner;

// 1)  Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma  dos números positivos e a soma dos números negativos. 
public class exercicio01{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int somaPos=0, somaNeg=0, num;
        System.out.println("Entre com 10 números: ");
            for (int i = 0; i < 10; i++) {
                num = ler.nextInt();

                if (num >0) {
                    somaPos += num;
                } else {
                    somaNeg += num;
                }
            }
            System.out.println("A soma dos numeros positivos " + somaPos);
            System.out.println("A soma dos numeros negativos "+ somaNeg);

        
        ler.close();
    }
}