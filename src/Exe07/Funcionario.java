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
        
        double imposto = 0;
        
        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto += (salario - 1903.98) * 0.075;
            
        } else if (salario <= 3751.05) {
            imposto += (2826.65 - 1903.98) * 0.075;
            imposto += (salario - 2826.65) * 0.15;
            
        } else if (salario <= 4664.68) {
            imposto += (2826.65 - 1903.98) * 0.075;
            imposto += (3751.05 - 2826.65) * 0.15;
            imposto += (salario - 3751.05) * 0.225;
            
        } else {
            imposto += (2826.65 - 1903.98) * 0.075;
            imposto += (3751.05 - 2826.65) * 0.15;
            imposto += (4664.68 - 3751.05) * 0.225;
            imposto += (salario - 4664.68) * 0.275;
    }
        return imposto; 
    }
}
