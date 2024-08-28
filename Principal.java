public class Principal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador", 3);

        // Usando os métodos
        meuCachorro.latir();
        meuCachorro.correr();

        // Acessando os atributos
        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Raça: " + meuCachorro.getRaca());
        System.out.println("Idade: " + meuCachorro.getIdade() + " anos");
    }
}
