package Exe08;

import java.util.Scanner;

/*
A classe abaixo foi projetada para representar retângulos. Implemente esta classe, conforme descrito abaixo.
a) O construtor Retangulo() deverá estabelecer que está sendo criado um retângulo em que a altura e comprimento
são iguais à 0.
b) O construtor Retangulo(int, int) deverá estabelecer que o retângulo que está sendo criado terá medidas
(comprimento e altura) iguais às fornecidas por parâmetro.
c) O método setAltura() é o método setter da variável altura, isto é, é o método que deve alterar o valor da variável
de instância altura. Este método não deve aceitar altura com valor igual à 0 ou negativo. Caso ocorra uma tentativa
de estabelecer uma altura incorreta, o método deverá lançar uma exceção com a mensagem semelhante à “Valor
incorreto para altura: -1” (para o caso da altura fornecida ser -1, por exemplo).
d) O método getAltura() é método getter da variável de instância altura.
e) O método setComprimento() é o método setter variável de instância comprimento. Este método não deve aceitar
comprimento com valor igual à zero ou negativo. Caso ocorra esta tentativa, o método deverá lançar uma exceção
com a mensagem “Valor incorreto para comprimento: -1” (para o caso do comprimento informado ser -1).
f) O método getComprimento() deve ser o método getter da variável de instância comprimento.
g) O método calcularPerimetro() deverá calcular e retornar o perímetro do retângulo.
Dica: O perímetro de um retângulo é igual a soma de todos os seus lados.
h) O método calcularArea() deverá calcular e retornar a área do retângulo
i) Realizar a documentação Javadoc de sua classe Retangulo. Deve-se documentar pelo menos os métodos
Construtores e os métodos calcularPerimetro() e calcularArea().

Crie um programa com o método main() (na mesma classe ou separado) que:
- Solicite ao usuário, via terminal, os valores de altura e comprimento do retângulo;
- Exiba no terminal a altura, comprimento, área e perímetro do retângulo;



*/

public class App8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Informe a altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.print("\nInforme o comprimento do retângulo: ");
        double comprimento = sc.nextDouble();
        
        
        Retangulo ret = new Retangulo(altura, comprimento);
        
        System.out.println("\n\n### RESULTADO ###");
        System.out.printf("Altura: %.1f", altura);
        System.out.printf("\nComprimento: %.1f", comprimento);
        System.out.printf("\nÁrea: %.1f", ret.calcularArea());
        System.out.printf("\nPerímetro: %.1f", ret.calcularPerimetro());
      
        
        
    }
    
    
}
