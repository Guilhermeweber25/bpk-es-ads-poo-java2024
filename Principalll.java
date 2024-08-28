public class Principalll {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", "20231234", "Engenharia");

        // Notas do aluno
        double[] notas = {8.5, 7.0, 9.0, 6.5};

        // Calculando a média de notas
        double media = aluno.calcularMedia(notas);
        System.out.println("Média das notas de " + aluno.getNome() + ": " + media);
    }
}
