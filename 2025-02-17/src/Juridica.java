public class Juridica extends Pessoa{
    
    private int numFuncionarios;
    
    public Juridica(String nome,double renda,int numFuncionarios){
        super(nome, renda);
        this.numFuncionarios = numFuncionarios;
    }
    
    
    public int getNumFuncionarios(){
        
        return numFuncionarios;
        
    }

    public double calculaImposto(){
        double prob;
        if(this.getNumFuncionarios()>10){
                prob=0.14;
            }else{
                prob=0.16;
            }
            return this.getRenda()*prob;
    }
    
}
