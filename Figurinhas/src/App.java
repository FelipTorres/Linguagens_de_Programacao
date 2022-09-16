import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.figurinhas.figurinha.Figurinhas;
import br.com.figurinhas.limpaconsole.LimpaConsole;
import br.com.figurinhas.textos.TextosApp;

public class App {
    static LimpaConsole l = new LimpaConsole();
    static Scanner ler = new Scanner(System.in);
    static TextosApp texto = new TextosApp();
    static Figurinhas figurinha = new Figurinhas();
    static List < Figurinhas > listaFigurinhas = new ArrayList<Figurinhas>();

    public static void main(String[] args){
        String opcao = null;

        texto.boasVindas(coletarNomeUsuario());

        do {
            texto.mostraMenuPrincipal();
            opcao = ler.next();
            
            switch (opcao) {
                case "0":
                    texto.mostrarEncerramento();
                break;

            case "1":   
                    cadastrarFigurinha();
                break;

            case "2":
                    mostrarFigurinhas();
                break;

            case "3":
                    mostraIdadeMedia();
                break;
        
            default:
                    texto.opcaoInvalida();
                break;
        }

    } while (!opcao.equals("0"));

    }

    private static void mostraIdadeMedia() {
        double idadeMedia = 0;
        double idade = 0;

        for (int i = 0; i < listaFigurinhas.size(); i++) {
            idade += listaFigurinhas.get(i).getIdadeJogador();
        }

        idadeMedia = idade / (  listaFigurinhas.size());

        System.out.println("A copa do mundo possui média de idade " + idadeMedia + ".");
    }

    private static void mostrarFigurinhas() {
    
        for (Figurinhas figurinha : listaFigurinhas) {
                System.out.println(figurinha);
        }

    }

    private static void cadastrarFigurinha() {
        limparCacheScanner();

        System.out.print("Nome : ");
        String nomeJogador = ler.nextLine();

        System.out.print("Idade : ");
        int idadeJogador = ler.nextInt();
        limparCacheScanner();


        System.out.print("Seleção : ");
        String selecaoJogador = ler.nextLine();

        figurinha = new Figurinhas(nomeJogador, idadeJogador, selecaoJogador);

        listaFigurinhas.add(figurinha);
        
        
        System.out.println("Figurinha adicionada com Sucesso !");

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
