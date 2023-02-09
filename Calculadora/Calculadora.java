package Calculadora;



public class Calculadora {
    public static void main(String args[]){
    CalculadoraTela ct = new CalculadoraTela();
    
     } 
    private Double n1;
    private Double n2;
    double fatorial = 1;
    
    public void setN1(Double n1){
        this.n1 = n1;
    }
    public void setN2(Double n2){
        this.n2 = n2;
    }
    
    
    public Double getSoma(){
        return(n1 + n2);
    }
    public Double getSubtrair(){
        return(n1 - n2);
    }
    public Double getMultiplicar(){
        return(n1 * n2);
    }
    public Double getDividir(){
        return(n1 / n2);
    }
    public Double getFatorial(){
        while(n1 > 1){
            fatorial = fatorial * n1;
            n1 = n1 - 1;       
        }
        return(fatorial);
    }

}
