public class Debuga {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", 5, 20.5);

        // Alimentando e fazendo o animal dormir
        animal.alimentar(1.5);
        animal.dormir();

        // Acessando os atributos
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");
    }
}
