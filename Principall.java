public class Principall {
    public static void main(String[] args) {
        Computador meuComputador = new Computador("Intel Core i7", 16, 512);

        // Usando os métodos
        meuComputador.ligar();
        meuComputador.desligar();

        // Acessando os atributos
        System.out.println("Processador: " + meuComputador.getProcessador());
        System.out.println("Memória RAM: " + meuComputador.getMemoriaRAM() + " GB");
        System.out.println("Armazenamento: " + meuComputador.getArmazenamento() + " GB");
    }
}
