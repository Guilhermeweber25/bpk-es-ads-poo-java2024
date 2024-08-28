public class Debugd {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("moderna", 4, "branca");

        // Cozinhando e limpando a cozinha
        cozinha.cozinhar();
        cozinha.limpar();

        // Acessando os atributos
        System.out.println("Tipo: " + cozinha.getTipo());
        System.out.println("Quantidade de Pessoas: " + cozinha.getQuantidadePessoas());
        System.out.println("Cor: " + cozinha.getCor());
    }
}
