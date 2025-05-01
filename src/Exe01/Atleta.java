package Exe01;

import java.util.Scanner;

/*
- O método calcularImc() da classe Atleta deve calcular o IMC do atleta usando a fórmula:
IMC = peso/altura^2

- No método main() da classe App, utilize a classe Atleta para calcular o IMC de
um atleta que tem 1,82 m de altura e 85 kg.

- O programa deve exibir o IMC na tela.
*/

public class Atleta {
    double peso;
    double altura;
    
    public double calculaImc(){
        double imc = peso/Math.pow(altura, 2);
        return imc;
    }
    
    
}
   