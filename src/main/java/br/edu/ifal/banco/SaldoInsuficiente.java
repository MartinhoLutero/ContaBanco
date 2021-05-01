package br.edu.ifal.banco;
public class SaldoInsuficiente extends Exception {

    public SaldoInsuficiente() {
        super("Saldo Insuficiente!");
    }
}