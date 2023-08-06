package ProjetoFinal;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
        
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        
    }

    @Override
    public void play() {
        this.reproduzindo = true;
        
    }

    @Override
    public String toString() {
        return "\nVideo [titulo=" + this.titulo + ", avaliacao=" + this.avaliacao + ", views=" + this.views + ", curtidas=" + this.curtidas
                + ", reproduzindo=" + this.reproduzindo + "]";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzir() {
        return reproduzindo;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzindo = reproduzir;
    }

    
    
}
