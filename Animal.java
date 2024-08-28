public class Animal {
    // Atributos da classe
    private String especie;
    private int idade;
    private double peso;

    // Construtor da classe
    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    // Método para alimentar o animal
    public void alimentar(double quantidade) {
        System.out.println("O animal da espécie " + especie + " com " + idade + " anos e peso de " + peso + " kg foi alimentado com " + quantidade + " kg de comida.");
    }

    // Método para fazer o animal dormir
    public void dormir() {
        System.out.println("O animal da espécie " + especie + " está agora dormindo.");
    }

    // Getters e Setters (opcional)
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
