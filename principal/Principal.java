package principal;

import modelos.Musica;
import modelos.Podcast;
import modelos.Preferidas;

public class Principal {
    static void main() {
        Musica musica = new Musica();
        musica.setTitulo("neverland");
        musica.setCantor("Cry wolf");

        for (int i = 0; i < 50; i++){
            musica.curtir();
        }

        for (int i = 0; i < 1000; i++){
            musica.reproduz();
        }

        Podcast podcast = new Podcast();
        podcast.setApresentador("nao sei");
        podcast.setTitulo("tbm nao sei");

        for (int i = 0; i < 6000; i++){
            podcast.reproduz();        }

        for (int i = 0; i < 4000; i++){
            podcast.curtir();
        }
        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
