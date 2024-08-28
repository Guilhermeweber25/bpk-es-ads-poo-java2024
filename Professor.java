public class Professor {
    // Atributos da classe
    private String nome;
    private String disciplina;
    private double salario;

    // Construtor da classe
    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    // Método para dar aula
    public void darAula() {
        System.out.println(nome + " está dando aula de " + disciplina + ".");
    }

    // Método para corrigir provas
    public void corrigirProvas() {
        System.out.println(nome + " está corrigindo provas de " + disciplina + ".");
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
