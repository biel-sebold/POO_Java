package Exe09;

import java.util.Scanner;

/*
No diagrama de classes a seguir, a classe Ponto foi utilizada para retratar um ponto do plano cartesiano. Implemente
este diagrama de classes em Java.
a) O construtor Ponto() deve estabelecer que o ponto terá as coordenadas X=0 e Y=0
b) O construtor Ponto(int,int) deve estabelecer que o ponto terá as coordenadas definidas como parâmetro para
este constructor.
c) Os métodos setX() e getX() devem ser implementados como métodos setter e getter, respectivamente, da
variável de instância x.
d) Os métodos setY() e getY() devem ser implementados como métodos setter e getter, respectivamente, da
variável de instância y.
e) O método identificarQuadrante() deve retornar um valor da enumeração Quadrante para indicar em que
quadrante do plano cartesiano o ponto se encontra. Considere os quadrantes conforme apontado abaixo:
Se o ponto estiver incidindo sobre o eixo X e eixo Y o método deverá retornar NENHUM.
f) O método estaIncidindoSobreX() deve retornar true se o ponto estiver incidindo sobre o eixo X.
g) O método estaIncidindoSobreY() deve retornar true se o ponto estiver incidindo sobre o eixo Y.
h) O método calcularDistancia(Ponto) deve calcular e retornar a distância entre o ponto do objeto corrente ao
ponto do objeto recebido como argumento.
i) O método estático calcularDistancia(Ponto, Ponto) deve calcular a distância dos dois pontos fornecidos
como argumento.
j) Realizar a documentação Javadoc de sua classe Ponto. Deve-se documentar pelo menos os 2 métodos
Construtores e os 5 métodos não são getters e setters.

O objetivo deste programa será informar ao usuário em que região do plano cartesiano se encontra um determinado
ponto. Para isso, o programa deve permitir que o usuário informe a coordenada do eixo X e Y do ponto
*/
public class App9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor para o eixo X: ");
        int x = sc.nextInt();
        System.out.print("Informe o valor para o eixo y: ");
        int y = sc.nextInt();
        
        
        
    }
    
    
}
