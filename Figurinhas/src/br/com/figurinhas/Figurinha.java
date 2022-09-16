package br.com.figurinhas;

public class Figurinha {
    private String nomeJogador;
    private int idadeJogador;
    private String seleçãoJogador;

    public Figurinha(){
    }

    public Figurinha(String nomeJogador, int idadeJogador, String seleçãoJogador) {
        this.nomeJogador = nomeJogador;
        this.idadeJogador = idadeJogador;
        this.seleçãoJogador = seleçãoJogador;
    }

    public String getNomeJogador() 
    {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) 
    {
        this.nomeJogador = nomeJogador;
    }

    public int getIdadeJogador() 
    {
        return idadeJogador;
    }

    public void setIdadeJogador(int idadeJogador) 
    {
        this.idadeJogador = idadeJogador;
    }

    public String getSeleçãoJogador() 
    {
        return this.seleçãoJogador;
    }

    public void setSeleçãoJogador(String seleçãoJogador) {
        this.seleçãoJogador = seleçãoJogador;
    }

    @Override
    public String toString() {
        return "Nome = " + this.nomeJogador + ", \tIdade = " + this.idadeJogador + ", \tSeleção = "
                + this.seleçãoJogador ;
    }
    
}
