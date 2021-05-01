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
        this.setSaldo(this.getSaldo() + valor);
    }

    public void saque(double valor)throws SaldoInsuficiente{
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        }else{
            throw new SaldoInsuficiente();
        }
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