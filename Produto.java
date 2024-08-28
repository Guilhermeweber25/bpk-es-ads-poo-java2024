public class Produto {
    // Atributos da classe
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor da classe
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para aumentar o estoque
    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque de " + nome + " aumentado em " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade inválida para aumentar o estoque.");
        }
    }

    // Método para diminuir o estoque
    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque de " + nome + " diminuído em " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade inválida ou insuficiente para diminuir o estoque.");
        }
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
