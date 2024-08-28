public class Cozinha {
    // Atributos da classe
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    // Construtor da classe
    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    // Método para cozinhar
    public void cozinhar() {
        System.out.println("A cozinha " + tipo + " está preparando uma refeição para " + quantidadePessoas + " pessoas.");
    }

    // Método para limpar
    public void limpar() {
        System.out.println("A cozinha " + tipo + " de cor " + cor + " está sendo limpa.");
    }

    // Getters e Setters (opcional)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
