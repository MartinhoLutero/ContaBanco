package banco;

import java.lang.reflect.Constructor;

public class Conta{
    private String nome;
    private double saldo;

    Constructor(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;

        this.saldo = 0f;
    }

    public void deposito(double valor){

    }

    public void sacar(double valor){
        
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getSaldo(){
        return this.saldo;
    }

    public void setSaldo(boolean saldo){
        this.saldo = saldo;
    }

}