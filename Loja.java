public class Loja {
    // Atributos da classe
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor da classe
    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método para abrir a loja
    public void abrir() {
        System.out.println("A loja \"" + nome + "\" localizada em " + endereco + " está agora aberta.");
    }

    // Método para fechar a loja
    public void fechar() {
        System.out.println("A loja \"" + nome + "\" localizada em " + endereco + " está agora fechada.");
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
