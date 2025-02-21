public class Fisica extends Pessoa{
    
    private double gastoSaude;
    
    public Fisica(String nome,double renda,double gastoSaude){
        super(nome, renda);
        this.gastoSaude = gastoSaude;
    }
    
    
    public double getGastoSaude(){
        
        return gastoSaude;
        
    }
    @Override
    public double calculaImposto(){
        double prob;
        if(this.getRenda()<20000){
                prob = 0.15;
            }else{
                prob = 0.25;
            }
            double impostosaud = this.getGastoSaude()*0.5;
            double calc = ((this.getRenda()*prob)-(impostosaud));
            return calc;
    }
    
    
}
