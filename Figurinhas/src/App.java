import java.util.Scanner;

import br.com.figurinhas.TextosApp;

public class App {
    static Scanner ler = new Scanner(System.in);
    static TextosApp texto = new TextosApp();
    public static void main(String[] args){
        String opcao = null;

        texto.boasVindas(coletarNomeUsuario());
        texto.mostraMenuPrincipal();
        opcao = ler.next();

        switch (opcao) {
            case "1":

                break;
        
            default:
                    texto.opcaoInvalida();
                break;
        }


    }
    private static String coletarNomeUsuario() 
    {
        texto.coletarNomeUsuario();
        return ler.nextLine();
    }
}
