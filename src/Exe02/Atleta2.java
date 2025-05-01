package Exe02;

public class Atleta2 {
    double peso;
    double altura;
    
    public double calculaImc(){
        double imc = peso/Math.pow(altura, 2);
        return imc;
    }
    
}
