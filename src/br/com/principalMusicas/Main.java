package br.com.principalMusicas;

import br.com.musica.MinhasPreferidas;
import br.com.musica.Musica;
import br.com.musica.Podcast;


public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Podcast podcast = new Podcast();

        musica.setTitulo("Forever");
        musica.setArtista("Kiss");

        for (int i = 0; i < 1000 ; i++) {
            musica.reproduz();

        }

        for (int i = 0; i < 50 ; i++) {
            musica.curtirMusica();
        }

        podcast.setTitulo("BolhaDev");
        podcast.setHost("Marcus");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curtirMusica();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);


    }
}
