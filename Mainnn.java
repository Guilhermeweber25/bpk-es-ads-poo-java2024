public class Mainnn {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Preto");

        // Abastecendo e lavando o veículo
        veiculo.abastecer();
        veiculo.lavar();

        // Acessando os atributos
        System.out.println("Tipo: " + veiculo.getTipo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
    }
}
