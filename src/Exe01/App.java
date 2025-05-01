package Exe01;

public class App {
    public static void main(String[] args) {
        Atleta gabriel = new Atleta();
        gabriel.peso = 75;
        gabriel.altura = 1.82;
        System.out.printf("IMC: %.1f", gabriel.calculaImc());
    }
}
