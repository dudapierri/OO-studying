import br.com.calculos.CalculadoraDeTempo;
import br.com.calculos.FiltroRecomendacao;
import br.com.screenMatch.Episodio;
import br.com.screenMatch.Filme;
import br.com.screenMatch.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(180);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println(filme.getSomaAvaliacoes());
        System.out.println(filme.getTotalDeAvaliacoes());
        System.out.println(filme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar: " + serie.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNome("EP 1");
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);


    }
}
