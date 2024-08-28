public class Principalj {
    public static void main(String[] args) {
        Loja loja = new Loja("Supermercado ABC", "Rua das Flores, 123", "1234-5678");

        // Abrindo e fechando a loja
        loja.abrir();
        loja.fechar();

        // Acessando os atributos
        System.out.println("Nome: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Telefone: " + loja.getTelefone());
    }
}
