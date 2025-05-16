package Exe08;

public class Retangulo {
    private double altura;
    private double comprimento;
    
    /**
     *  Estabelece que está sendo criado um retângulo em que a altura e comprimento são iguais à 0
     * 
     * @param altura Altura do retângulo
     * @param comprimento Comprimento o retângulo
     */
    public Retangulo(){
        this.altura = 0;
        this.comprimento = 0;
      
    }
    
    /**
     * 
     * @param comp Comprimento do retângulo
     * @param alt Altura do retângulo
     */
    public Retangulo(double comp, double alt){
        this.altura = alt;
        this.comprimento = comp;
        
    }

    public void setAltura(double altura) {
        this.altura = altura;
        
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para a altura: " + altura + "!!!");
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
        
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para a altura: " + comprimento + "!!!");
        }
    }
    
    /**
     * Calcula o perímetro do retângulo
     * 
     * @return perimetro Multiplicação por dois da multiplicação da altura pelo comprimento
     */
    public double calcularPerimetro(){
        double perimetro = 2*(altura*comprimento);
        return perimetro;
    }
    
    /**
     * Calcula a área do retângulo
     * 
     * @return area Multiplicação da altura pelo comprimento    
     */
    public double calcularArea(){
        double area = altura*comprimento;
        return area;
    }
    
    
    
 
    
    
}
