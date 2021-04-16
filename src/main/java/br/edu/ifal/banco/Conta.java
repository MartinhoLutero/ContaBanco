package br.edu.ifal.banco;
public class Conta{
    private String nome;
    private double saldo;

    public Conta (String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;

        this.saldo = 0f;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        
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