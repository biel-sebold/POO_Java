package Exe09;

public class Ponto {
    private int x;
    private int y;
    
    public Ponto(){
        this.x = 0;
        this.y = 0;
        
    }
    
    public Ponto(int x, int y){
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Quadrante identificarQuadrante(){
        
        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;   
        } else if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        } else if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        } else if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        } else{
            return Quadrante.NENHUM;
        }
        
    }
    
    public boolean estaIncidindoSobreX(){
        if (x == 0) {
            return true;
        } else{
            return false;
        }
    }
    
    public boolean estaIncidindoSobreY(){
        if (y == 0) {
            return true;   
        } else{
            return false;
        }
    }   
    
    public double calcularDistancia(Ponto outroPonto){
        
        
    }
    
    
}
