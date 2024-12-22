
public class Horista extends Funcionario{
    
    public double valorhora;
    public double numhoras;
    
    public double CalcSal(){
        return this.valorhora*this.numhoras;
    }
}
