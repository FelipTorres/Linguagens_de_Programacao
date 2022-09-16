package br.com.figurinhas.textos;


public class TextosApp {

    public TextosApp(){}

    public void  mostraMenuPrincipal ()
    {
        System.out.print("O que você deseja fazer?\n  1 - Inserir figurinhas\n  2 - Ver figurinhas \n  3 - Ver idade média \n  0 - Sair \n   Opção Desejada -> ");
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

    public void mostrarEncerramento() {
        System.out.println("Programa Encerrando \n Se vemos em breve! \n tenha um ótimo dia !!");
    }

}
