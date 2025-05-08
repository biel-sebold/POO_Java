package Exe07;


public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        
        if(this.salario < 0){
            throw new ExceptionInInitializerError("O salário informado não pode ser negativo");
        }
    }

    public double getSalario() {
        return salario;
    }
        
    public double calcularIrpf(){
        return 0;
    }
    
}
