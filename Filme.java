public class Filme {
    private String titulo;
    private String genero;
    private String duracao;

   public Filme(String titulo, String genero, String duracao) {
       this.titulo = titulo;
       this.genero = genero;
       this.duracao = duracao;
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

}
