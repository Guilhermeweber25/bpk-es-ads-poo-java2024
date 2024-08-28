public class Mainnnnn {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Jorge Jesus");

        // Adicionando e removendo jogadores
        time.adicionarJogador("Gabigol");
        time.adicionarJogador("Arrascaeta");
        time.exibirJogadores();

        time.removerJogador("Gabigol");
        time.exibirJogadores();

        // Acessando os atributos
        System.out.println("Nome do time: " + time.getNome());
        System.out.println("Técnico: " + time.getTecnico());
    }
}
