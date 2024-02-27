package br.com.calculos;

import br.com.screenMatch.Filme;
import br.com.screenMatch.Serie;
import br.com.screenMatch.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
