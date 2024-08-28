public class Jogo {
    // Atributos da classe
    private String nome;
    private String genero;
    private double preco;

    // Construtor da classe
    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    // Método para iniciar o jogo
    public void iniciar() {
        System.out.println("O jogo \"" + nome + "\" do gênero " + genero + " foi iniciado.");
    }

    // Método para pausar o jogo
    public void pausar() {
        System.out.println("O jogo \"" + nome + "\" foi pausado.");
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
