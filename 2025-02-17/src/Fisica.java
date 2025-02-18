public class Fisica extends Pessoa {

    private double gastosSaude;

    public Fisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual, calcularImposto(rendaAnual, gastosSaude));
        this.gastosSaude = gastosSaude;
        System.out.println("Pessoa física criada com sucesso!");
    }

    private static double calcularImposto(double rendaAnual, double gastosSaude) {
        double imposto;
        if (rendaAnual < 20000) {
            imposto = rendaAnual * 0.15;
        } else {
            imposto = rendaAnual * 0.25;
        }
        return imposto - (gastosSaude * 0.5);
    }

    public double getGastosSaude() {
        return gastosSaude;
    }
}