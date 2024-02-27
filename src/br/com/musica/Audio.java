package br.com.musica;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeRproducoes;
    private int curtidas;
    private int classificacao;

    public void curtirMusica(){
        this.curtidas ++;
    }

    public void reproduz(){
        this.totalDeRproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeRproducoes() {
        return totalDeRproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

}
