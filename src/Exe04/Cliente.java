package Exe04;

public class Cliente {
    String nome;
    double peso;
    double altura;
    
    public Cliente(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calculaImc(){
        double imc = peso/Math.pow(altura, 2);
        return imc;
    }
}
