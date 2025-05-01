package Exe03;

public class Funcionario {
    double peso;
    double altura;
    
    public double calculaImc(){
        double imc = peso/Math.pow(altura, 2);
        return imc;
    }
    
}
