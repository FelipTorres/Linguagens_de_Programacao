package br.com.figurinhas.limpaconsole;

import java.io.IOException;

public class LimpaConsole {

    public LimpaConsole() {
    }

    public void Console() throws InterruptedException, IOException {

        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            new ProcessBuilder("clear").inheritIO().start().waitFor();
    }
}