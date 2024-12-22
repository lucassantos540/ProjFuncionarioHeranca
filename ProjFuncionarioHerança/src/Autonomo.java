
public class Autonomo extends Funcionario{
    
    public double totvendas;
    public double percvendas;
    
    public double CalcSal(){
        return (this.totvendas * this.percvendas) / 100;
    }
    
}
