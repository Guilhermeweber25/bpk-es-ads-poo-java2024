import java.util.ArrayList;
import java.util.List;

public class Time {
    // Atributos da classe
    private String nome;
    private String tecnico;
    private List<String> jogadores; // Lista para armazenar os nomes dos jogadores

    // Construtor da classe
    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    // Método para adicionar um jogador
    public void adicionarJogador(String jogador) {
        if (jogador != null && !jogador.trim().isEmpty()) {
            jogadores.add(jogador);
            System.out.println("Jogador " + jogador + " adicionado ao time " + nome + ".");
        } else {
            System.out.println("Nome do jogador inválido.");
        }
    }

    // Método para remover um jogador
    public void removerJogador(String jogador) {
        if (jogadores.remove(jogador)) {
            System.out.println("Jogador " + jogador + " removido do time " + nome + ".");
        } else {
            System.out.println("Jogador " + jogador + " não encontrado no time " + nome + ".");
        }
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public List<String> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<String> jogadores) {
        this.jogadores = jogadores;
    }

    // Método para exibir a lista de jogadores
    public void exibirJogadores() {
        System.out.println("Jogadores do time " + nome + ": " + jogadores);
    }
}
