public class Princippall {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00, 10);

        // Aumentando e diminuindo o estoque
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);

        // Acessando os atributos
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
    }
}
