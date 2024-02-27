package br.com.ooExcercises;

public class Musica2 {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFicha(){
        System.out.println(this.titulo);
        System.out.println(this.artista);
        System.out.println(this.anoDeLancamento);
        System.out.println(totalAvaliacoes());
    }

    void avalia(double nota){
        this.avaliacao += nota;
        this.numAvaliacoes++;
    }

    double totalAvaliacoes(){
        return this.avaliacao/this.numAvaliacoes;
    }
}
