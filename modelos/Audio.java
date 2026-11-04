package modelos;

public class Audio {
    private String titulo;
    private int curtidas;
    private int reproducoes;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }
    public void curtir() {
        this.curtidas++;
    }
    public void reproduz() {
        this.reproducoes++;
    }
}
