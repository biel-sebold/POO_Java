package Exe02;

import java.util.Scanner;
/*
- Copie a classe Atleta do exercício anterior para um novo pacote.

- Implemente um novo programa (App) que solicite ao usuário sua altura e peso.

- O programa deve calcular e exibir o IMC do usuário.
*/

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("\nInforme seu peso: ");
        double peso = sc.nextDouble();
        
        Atleta2 anonimo = new Atleta2();
        anonimo.altura = altura;
        anonimo.peso = peso;
        System.out.printf("IMC: %.1f\n", anonimo.calculaImc());
    }
    
}
