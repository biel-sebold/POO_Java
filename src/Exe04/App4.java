package Exe04;

import java.util.Scanner;

/*
- Copie a classe Funcionario do exercício anterior para um novo pacote e renomeie-a para Cliente.
- O programa (App) deve solicitar ao usuário o nome, altura e peso de três clientes.
- Após a entrada de dados, exiba as informações (nome, altura, peso e IMC) na ordem inversa de digitação 
(ou seja, o terceiro cliente deve ser exibido primeiro e o primeiro, por último).
*/
public class App4 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[3];
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < clientes.length; i++) {
            System.out.printf("\nInforme seu nome (cliente %d): ", i+1);
            String nome = sc.next();
            System.out.printf("Informe sua altura (cliente %d): ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Informe seu peso (cliente %d): ", i+1);
            double peso = sc.nextDouble();
            
            clientes[i] = new Cliente(nome, altura, peso);
            
        }
        
        for (int i = clientes.length - 1; i >= 0; i--) {
            System.out.printf("\n\nCLIENTE %d", i+1);
            System.out.printf("\nNome: %s", clientes[i].nome);
            System.out.printf("\nAltura: %.1f", clientes[i].altura);
            System.out.printf("\nPeso: %.1f", clientes[i].peso);
            System.out.printf("\nIMC: %.1f", clientes[i].calculaImc());
            
        }
    }
    
}
