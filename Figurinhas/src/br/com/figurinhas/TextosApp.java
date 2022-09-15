package br.com.figurinhas;

public class TextosApp {

    public TextosApp(){}

    public void  mostraMenuPrincipal ()
    {
        System.out.print("O que você deseja fazer?\n  1 - Inserir figurinhas\n  2 - Ver figurinhas \n  3 - Ver idade média \n  4 - Sair \n   Opção Desejada -> ");
    }

    public void boasVindas (String nomeUsuário)
    {
        System.out.println("Olá "+ nomeUsuário +", seja Bem-vindo!");
    }

    public void coletarNomeUsuario() 
    {
        System.out.print("Olá, tudo bem?? \n Antes de começarmos insira seu nome para uma melhor experiência !! \n Insira seu nome ->");
    }

    public void opcaoInvalida() 
    {
        System.out.println("Opção inválida, jogador!");
    }

    public void perguntaIdadeJogador(){
        System.out.print("Idade : ");
    }

    public void perguntaNomeJogador() {
        System.out.print("Nome : ");

    }

    public void perguntaSelecaoJogador() {
        System.out.print("Seleção : ");

    }
}
