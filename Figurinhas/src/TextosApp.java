


public class TextosApp {

    public TextosApp(){}

    public void  mostraMenuPrincipal (){
        System.out.print("O que você deseja fazer?\n  1 - Inserir figurinhas\n  2 - Ver figurinhas \n  3 - Ver idade média \n  0 - Sair \n   Opção Desejada -> ");
    }

    public void boasVindas (String nomeUsuário){
        System.out.println("Olá "+ nomeUsuário +", seja Bem-vindo!");
    }

    public void coletarNomeUsuario() throws InterruptedException{
        System.out.println("Antes de começarmos insira seu nome para uma melhor experiência !!");
        Thread.sleep(1000); 
        System.out.print("Insira seu nome -> ");
    }

    public void opcaoInvalida(){
        System.out.println("Opção inválida, jogador!");
    }

    public void mostrarEncerramento() throws InterruptedException{
        System.out.print("Programa Encerrando");
        for (int i = 0; i <10; i++) {
            System.out.print(".");
            Thread.sleep(300);
        }
        Thread.sleep(1000); 
        System.out.println("\nSe vemos em breve!");
        Thread.sleep(1000); 
        System.out.println("tenha um ótimo dia !!");
        Thread.sleep(1000); 

    }

    public void mostrarIdadeMedia(double idadeMedia){
        System.out.println("A copa do mundo possui média de idade " + idadeMedia + ".");

    }

    public void confirmacaoCadastro (){
        System.out.println("Figurinha adicionada com Sucesso !");
    }

    public void voltarMenu(){
        System.out.print("Aperte qulaquer tecla para voltar ao menu anteiror.\n--> ");
    }

    public void mostraCarregamento() throws InterruptedException{

        System.out.print("Carregando");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(300);
            System.out.print(".");
        }
        System.out.println("\n");
    }

}
