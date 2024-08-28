public class Maain {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");

        // Aumentando e diminuindo a população
        cidade.aumentarPopulacao(50000);
        cidade.diminuirPopulacao(20000);

        // Acessando os atributos
        System.out.println("Nome: " + cidade.getNome());
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("Estado: " + cidade.getEstado());
    }
}
