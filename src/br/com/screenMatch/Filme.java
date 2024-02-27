package br.com.screenMatch;
import br.com.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //public Double teste(double teste){ return this.testeProtected += teste;}
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }




}
