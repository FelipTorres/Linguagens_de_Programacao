import java.io.IOException;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.figurinhas.Figurinha;



public class App {

    static LimpaConsole l = new LimpaConsole();
    static Scanner ler = new Scanner(System.in);
    static TextosApp texto = new TextosApp();
    static Figurinha ff = new Figurinha();
    static List < Figurinha > listaFigurinhas = new ArrayList < Figurinha > ();

    public static void main(String[] args) throws InterruptedException, IOException{
        // l.Console();
        String opcao = null;
        // texto.boasVindas(coletarNomeUsuario());
        // Thread.sleep(1500);

        do {
            l.Console();
            texto.mostraMenuPrincipal();
            opcao = ler.next();
            
            switch (opcao) {
                case "0":
                    l.Console();
                    Thread.sleep(500);
                    texto.mostrarEncerramento();
                break;

                case "1":   
                    l.Console();
                    Thread.sleep(500);
                    cadastrarFigurinha();
                break;

                case "2":
                    l.Console();
                    Thread.sleep(500);
                    mostrarFigurinhas();
                break;

                case "3":
                    l.Console();
                    Thread.sleep(500);
                    mostraIdadeMedia();
                break;
        
                default:
                    l.Console();
                    Thread.sleep(500);
                    texto.opcaoInvalida();
                    Thread.sleep(1000);
                break;
        }

    } while (!opcao.equals("0"));

    }

    private static void mostraIdadeMedia() throws InterruptedException, IOException {
        double idadeMedia = 0, idade = 0;

        if (!listaFigurinhas.isEmpty()){
            for (int i = 0; i < listaFigurinhas.size(); i++) {
                idade += listaFigurinhas.get(i).getIdadeJogador();
            }
            texto.mostraCarregamento();
            l.Console();
    
            idadeMedia = idade / (  listaFigurinhas.size());

            texto.mostrarIdadeMedia(idadeMedia);
            voltarMenu();

        } else{
            System.out.println("Nenhuma Figurinha Cadastrada");
            Thread.sleep(1000);
        }

    }

    private static void mostrarFigurinhas() throws InterruptedException, IOException {
        texto.mostraCarregamento();
        l.Console();

        if(!listaFigurinhas.isEmpty()){        
            for (Figurinha figurinha : listaFigurinhas) {
                    System.out.println(figurinha);
            }
            voltarMenu();
        }else{
            System.out.println("Nenhuma Figurinha Cadastrada");
            Thread.sleep(1000);
        }
    }

    private static void voltarMenu() {
        System.out.println();
        texto.voltarMenu();
        limparCacheScanner();
        String saida = ler.nextLine();
    }

    private static void cadastrarFigurinha() throws InterruptedException, IOException{
        limparCacheScanner();
        System.out.print("\t- CADASTRANDO FIGURINHA -\n");
        Thread.sleep(500);


        System.out.print("Nome : ");
        String nomeJogador = ler.nextLine();

        System.out.print("Idade : ");
        int idadeJogador = ler.nextInt();
        limparCacheScanner();


        System.out.print("Seleção : ");
        String selecaoJogador = ler.nextLine();

        ff = new Figurinha(nomeJogador, idadeJogador, selecaoJogador);

        l.Console();
        teste(ff.getNomeJogador(), ff.getSeleçãoJogador());
        listaFigurinhas.add(ff);

        Thread.sleep(500);

        texto.confirmacaoCadastro();

        Thread.sleep(1500);
        l.Console();



    }

    private static void teste(String nomeJogador, String seleçãoJogador) throws InterruptedException, IOException {
        if(nomeJogador.equals("Marquinhos")){
             mostraAlerta(texto.caseMarquinhos());
        }else if (seleçãoJogador.equals("Argentina")) {
             mostraAlerta(texto.caseArgentina());
        } else if(nomeJogador.equals("Hulk")){
             mostraAlerta(texto.caseHulk());
        }
        l.Console();
    }

    private static void mostraAlerta(String texto) throws InterruptedException, IOException {
        for (int i = 0; i < 10; i++) {
            System.out.println(texto);
            Thread.sleep(300);
            l.Console();
        }
    }

    private static String coletarNomeUsuario() throws InterruptedException, IOException {
        texto.coletarNomeUsuario();
        String nome = ler.nextLine();
        l.Console();
        return nome;
    }

    private static void limparCacheScanner()
    {
        ler = new Scanner(System.in);
    }
}
