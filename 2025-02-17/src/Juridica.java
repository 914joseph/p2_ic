public class Juridica extends Pessoa {

    private int numFuncionarios;

    public Juridica(String nome, double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual, calcularImposto(rendaAnual, numFuncionarios));
        this.numFuncionarios = numFuncionarios;
        System.out.println("Pessoa jurídica criada com sucesso!");
    }

    private static double calcularImposto(double rendaAnual, int numFuncionarios) {
        if (numFuncionarios > 10) {
            return rendaAnual * 0.14;
        } else {
            return rendaAnual * 0.16;
        }
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }
}