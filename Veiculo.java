public class Veiculo {
    // Atributos da classe
    private String tipo;
    private String placa;
    private String cor;

    // Construtor da classe
    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    // Método para abastecer o veículo
    public void abastecer() {
        System.out.println("O " + tipo + " de placa " + placa + " está sendo abastecido.");
    }

    // Método para lavar o veículo
    public void lavar() {
        System.out.println("O " + tipo + " de cor " + cor + " está sendo lavado.");
    }

    // Getters e Setters (opcional)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
