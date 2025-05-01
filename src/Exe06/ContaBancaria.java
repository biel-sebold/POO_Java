package Exe06;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor<=0) {
            throw new IllegalAccessError("Valor informado é inválido");
        }
        this.saldo+=valor;
    }
    
    public void sacar(double valor){
        
        if (valor<=0 || valor > this.saldo) {
            throw new IllegalAccessError("Valor informado é inválido");
        }
        this.saldo-=valor;
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
}
