import java.util.Scanner;

public class Pessoa {
    private String nome;
    private double rendaAnual;
    private double imposto;

    public Pessoa(String nome, double rendaAnual, double imposto) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public double getImposto() {
        return imposto;
    }

    public static Pessoa criarPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de pessoa:\n1-Física\n2-Jurídica");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        System.out.println("Digite a renda anual da pessoa:");
        double rendaAnual = scanner.nextDouble();

        if (tipo == 1) {
            System.out.println("Digite o gasto com saúde da pessoa:");
            double gastosSaude = scanner.nextDouble();
            return new Fisica(nome, rendaAnual, gastosSaude);
        } else if (tipo == 2) {
            System.out.println("Digite o número de funcionários:");
            int numFuncionarios = scanner.nextInt();
            return new Juridica(nome, rendaAnual, numFuncionarios);
        } else {
            System.out.println("Tipo inválido, operação cancelada!");
            return null;
        }
    }

    public String pegarPessoa(Pessoa pessoa) {
        System.out.println("Nome:" + pessoa.getNome() + " Renda anual:R$" + pessoa.getRendaAnual());
        if (pessoa instanceof Fisica) {
            return "Nome:" + pessoa.getNome() + " Renda anual:R$" + pessoa.getRendaAnual() + " Gastos com saúde:R$"
                    + ((Fisica) pessoa).getGastosSaude();
        } else if (pessoa instanceof Juridica) {
            return "Nome:" + pessoa.getNome() + " Renda anual:R$" + pessoa.getRendaAnual() + " Número de funcionários:"
                    + ((Juridica) pessoa).getNumFuncionarios();
        } else {
            return "Erro! Não foi possível acessar a pessoa";
        }
    }
}