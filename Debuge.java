public class Debuge {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-99", 10);

        // Contratando e demitindo funcionários
        empresa.contratar();
        empresa.demitir();

        // Acessando os atributos
        System.out.println("Nome: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCNPJ());
        System.out.println("Número de Funcionários: " + empresa.getNumeroFuncionarios());
    }
}
