import java.util.Scanner;

import br.com.figurinhas.Figurinhas;
import br.com.figurinhas.TextosApp;

public class App {
    static Scanner ler = new Scanner(System.in);
    static TextosApp texto = new TextosApp();
    static Figurinhas figurinha = new Figurinhas();
    public static void main(String[] args){
        String opcao = null;

        texto.boasVindas(coletarNomeUsuario());
        texto.mostraMenuPrincipal();
        opcao = ler.next();

        switch (opcao) {
            case "1":   
                    cadastrarFigurinha();
                break;
        
            default:
                    texto.opcaoInvalida();
                break;
        }


    }
    private static void cadastrarFigurinha() 
    {
        limparCacheScanner();

        texto.perguntaNomeJogador();
        String nomeJogador = ler.nextLine();
        figurinha.setNomeJogador(nomeJogador);

        texto.perguntaIdadeJogador();
        int idadeJogador = ler.nextInt();
        figurinha.setIdadeJogador(idadeJogador);
        limparCacheScanner();


        texto.perguntaSelecaoJogador();
        String seleçãoJogador = ler.nextLine();
        figurinha.setSeleçãoJogador(seleçãoJogador);

        System.out.println("Figurinha adicionada ao album !");
        System.out.println(figurinha);

    }

    private static String coletarNomeUsuario() 
    {
        texto.coletarNomeUsuario();
        return ler.nextLine();
    }

    private static void limparCacheScanner()
    {
        ler = new Scanner(System.in);
    }
}
