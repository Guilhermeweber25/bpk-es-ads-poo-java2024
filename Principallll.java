public class Principallll {
    public static void main(String[] args) {
        Professor professor = new Professor("Maria Oliveira", "Matemática", 3500.00);

        // Usando os métodos
        professor.darAula();
        professor.corrigirProvas();

        // Acessando os atributos
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: R$ " + professor.getSalario());
    }
}
