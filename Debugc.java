public class Debugc {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite", 26);

        // Pedalando e freando a bicicleta
        bicicleta.pedalar();
        bicicleta.frear();

        // Acessando os atributos
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Tamanho da Roda: " + bicicleta.getTamanhoRoda() + " polegadas");
    }
}
