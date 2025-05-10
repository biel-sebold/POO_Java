package Exe08;

public class Retangulo {
    private double altura;
    private double comprimento;
    
    public Retangulo(){
        this.altura = 0;
        this.comprimento = 0;
      
    }
    
    public Retangulo(double comp, double alt){
        this.altura = alt;
        this.comprimento = comp;
        
    }

    public void setAltura(double altura) {
        this.altura = altura;
        
        if (altura <= 0) {
            throw new IllegalAccessError("A altura não pode ser igual ou menor a zero!!!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    public double calcularPerimetro(){
        return 0;
    }
    
    public double calcularAreaa(){
        return 0;
    }
    
    
    
 
    
    
}
