package Exe05;

import java.util.Scanner;

/*Partindo da solução da questão 4, redesenhe o diagrama de classes adaptando a classe Ciente para que
utilize o conceito de encapsulamento. Em seguida, solucione novamente a questão para que seja utilizada
a nova classe.
*/

public class App5 {
    public static void main(String[] args) {
        ClienteEncapsulamento[] clientes = new ClienteEncapsulamento[3];
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < clientes.length; i++) {
            System.out.printf("\nInforme seu nome (cliente %d): ", i+1);
            String nome = sc.next();
            System.out.printf("Informe sua altura (cliente %d): ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Informe seu peso (cliente %d): ", i+1);
            double peso = sc.nextDouble();
            
            ClienteEncapsulamento cliente = new ClienteEncapsulamento();
            cliente.setNome(nome);
            cliente.setAltura(altura);
            cliente.setPeso(peso);
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
