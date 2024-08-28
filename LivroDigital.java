public class LivroDigital {
    // Atributos da classe
    private String titulo;
    private String autor;
    private double tamanhoArquivo; // Tamanho do arquivo em megabytes (MB)

    // Construtor da classe
    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // Método para abrir o livro digital
    public void abrir() {
        System.out.println("O livro digital \"" + titulo + "\" de " + autor + " está agora aberto.");
    }

    // Método para fechar o livro digital
    public void fechar() {
        System.out.println("O livro digital \"" + titulo + "\" de " + autor + " foi fechado.");
    }

    // Getters e Setters (opcional)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
