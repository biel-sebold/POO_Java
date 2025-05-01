package Exe03;

import java.util.Scanner;

/*
- Em um terceiro pacote, copie novamente a classe Atleta e renomeie-a para Funcionario.
- O programa (App) deve calcular o IMC de três funcionários.
- Para cada funcionário, o programa deve solicitar altura e peso e, em seguida, exibir o IMC calculado.
*/
public class App3 {
    public static void main(String[] args) {
        Funcionario funcionarios = new Funcionario();
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe sua altura (funcionário %d): ", i+1);
            funcionarios.altura = sc.nextDouble();
            System.out.printf("Informe seu peso (funcionário %d): ", i+1);
            funcionarios.peso = sc.nextDouble();
            
            System.out.printf("IMC (funcionário %d): %.1f\n\n", i+1, funcionarios.calculaImc());
            
        }
    }
    
}
