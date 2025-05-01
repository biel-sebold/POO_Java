package Exe05;

public class ClienteEncapsulamento {
    String nome;
    double peso;
    double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaImc(){
        double imc = peso/Math.pow(altura, 2);
        return imc;
    }
    
}
