package br.edu.ifal.banco;
public class Conta{
    private String nome;
    private double saldo;

    public class SaldoInsuficiente extends Exception {
    }

    public Conta (String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;

        this.saldo = 0f;
    }

    public void deposito(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public void saque(double valor){
        this.setSaldo(this.getSaldo() - valor);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}

// public void deposito(double valor, InputMismatchException erroSaldo){
//     if(valor <= this.getSaldo() && this.getSaldo() > 0){
//         this.setSaldo(this.getSaldo() + valor);
//     }else{
//         System.err.println("SaldoInsuficiente!");
//     }
// }