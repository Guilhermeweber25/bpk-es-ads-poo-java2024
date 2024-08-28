public class Filme {
    // Atributos da classe
    private String titulo;
    private String diretor;
    private int duracao; // Duração em minutos

    // Construtor da classe
    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    // Método para iniciar o filme
    public void iniciar() {
        System.out.println("O filme \"" + titulo + "\" dirigido por " + diretor + " está começando.");
    }

    // Método para parar o filme
    public void parar() {
        System.out.println("O filme \"" + titulo + "\" dirigido por " + diretor + " foi parado.");
    }

    // Getters e Setters (opcional)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

