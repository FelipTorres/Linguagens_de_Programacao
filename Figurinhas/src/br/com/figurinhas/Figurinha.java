package br.com.figurinhas;

public class Figurinha {
    String nomeJogador;
    private int idadeJogador;
    private String SeleçãoJogador;

    public Figurinha() 
    {
    }

    public Figurinha(String nomeJogador, int idadeJogador, String seleçãoJogador) 
    {
        this.nomeJogador = nomeJogador;
        this.idadeJogador = idadeJogador;
        SeleçãoJogador = seleçãoJogador;
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
        return SeleçãoJogador;
    }

    public void setSeleçãoJogador(String seleçãoJogador) 
    {
        SeleçãoJogador = seleçãoJogador;
    } 
    
}
