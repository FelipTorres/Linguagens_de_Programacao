import br.com.exercicio_pratico1.carro.Carro;

public class App {
    public static void main(String[] args) {

        Carro palio = new Carro("Palio", "branco");
        Carro Corsa = new Carro("Corsa","preto");
        Carro Gol = new Carro("Gol","verde");

        palio.andar(60);
        Corsa.andar(70);
        Gol.andar(50);

    }
}
