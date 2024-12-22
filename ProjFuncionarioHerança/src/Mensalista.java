
public class Mensalista extends Funcionario{
    
    public double salbruto;
    public double desconto;
    
    public double CalcSal(){
        return this.salbruto-this.desconto;
    }
}
