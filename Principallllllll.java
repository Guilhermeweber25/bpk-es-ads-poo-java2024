public class Principallllllll {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Legend of Zelda", "Aventura", 199.90);

        // Iniciando e pausando o jogo
        jogo.iniciar();
        jogo.pausar();

        // Acessando os atributos
        System.out.println("Nome: " + jogo.getNome());
        System.out.println("Gênero: " + jogo.getGenero());
        System.out.println("Preço: R$ " + jogo.getPreco());
    }
}
