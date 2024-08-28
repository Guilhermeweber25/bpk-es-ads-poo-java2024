public class Debugb {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("O Alquimista", "Paulo Coelho", 1.2);

        // Abrindo e fechando o livro digital
        livro.abrir();
        livro.fechar();

        // Acessando os atributos
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Tamanho do Arquivo: " + livro.getTamanhoArquivo() + " MB");
    }
}
