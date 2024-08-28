public class Mainn {
    public static void main(String[] args) {
        Filme filme = new Filme("A Origem", "Christopher Nolan", 148);

        // Iniciando e parando o filme
        filme.iniciar();
        filme.parar();

        // Acessando os atributos
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");
    }
}
