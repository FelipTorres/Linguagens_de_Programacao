import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.figurinhas.Figurinhas;
import br.com.figurinhas.TextosApp;

public class App {
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

        idadeMedia = idade / ( listaFigurinhas.size() - 1);

        System.out.println("A copa do mundo possui média de idade + " + idadeMedia + ".");
    }

    private static void mostrarFigurinhas() {
    System.out.println(listaFigurinhas);

    }

    private static void cadastrarFigurinha() {
        limparCacheScanner();

        System.out.print("Nome : ");
        String nomeJogador = ler.nextLine();
        figurinha.setNomeJogador(nomeJogador);

        System.out.print("Idade : ");
        int idadeJogador = ler.nextInt();
        figurinha.setIdadeJogador(idadeJogador);
        limparCacheScanner();


        System.out.print("Seleção : ");
        String seleçãoJogador = ler.nextLine();
        figurinha.setSeleçãoJogador(seleçãoJogador);

        System.out.println("Figurinha adicionada ao album !");
        System.out.println(figurinha);

        listaFigurinhas.add(figurinha);

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
