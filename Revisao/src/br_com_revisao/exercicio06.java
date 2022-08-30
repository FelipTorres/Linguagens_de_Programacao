import java.util.Random;
import java.util.Scanner;
 
public class exercicio06 {
    public static void main(String [] args) {
        // 6) Escreva um algoritmo que leia um array de 5 elementos inteiros. Solicite ao usuário a digitação de um número e verifique se o mesmo se encontra no vetor. Se sim, avise o que o número foi encontrado e sua posição, caso contrário informe que o número não se encontra no vetor.
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean existe = false;
        int num [] = new int [5];
        int val;
 
        System.out.println("Digite 5 numeros inteiros : ");
        for (int i = 0; i < 5; i++) {
            num [i] = aleatorio.nextInt(11);
            System.out.println(num[i]);
        }
       
        System.out.println("Digite um numero para testarmos se esta no vetor : ");
        val = ler.nextInt();
        for (int i = 0; i < 5; i++) {
            if (num[i] == val){
                    System.out.println("Numero encontrado na posicao "+i);
                    existe = true;
            }
        }
        if(!existe){
            System.out.println("numero nao encontrado no vetor");
        }
 
        ler.close();
    }
}
 

