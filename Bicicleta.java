public class Bicicleta {
    // Atributos da classe
    private String marca;
    private String modelo;
    private double tamanhoRoda; // Tamanho da roda em polegadas

    // Construtor da classe
    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    // Método para pedalar
    public void pedalar() {
        System.out.println("A bicicleta " + marca + " modelo " + modelo + " está pedalando.");
    }

    // Método para frear
    public void frear() {
        System.out.println("A bicicleta " + marca + " modelo " + modelo + " está freando.");
    }

    // Getters e Setters (opcional)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(double tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }
}
