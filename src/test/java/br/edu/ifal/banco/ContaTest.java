package br.edu.ifal.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 import br.edu.ifal.banco.Conta.SaldoInsuficiente;
// import br.edu.ifal.banco.Conta.sacar;
// import br.edu.ifal.banco.Conta.getSaldo;

public class ContaTest{
    private Conta c;

    @BeforeEach
    public void setUp() {
        this.c = new Conta("Martinho", 200f);
    }

    @Test
    public void depositoTest() {
        double saldoAntigo = c.getSaldo();
        c.deposito(10f);
        assertEquals(10f, c.getSaldo() - saldoAntigo);
    }

    @Test
    public void saqueTest(){
        double saldoAntigo = c.getSaldo();
        c.saque(20f);
        assertEquals(20f, saldoAntigo - c.getSaldo());
    }

    @Test
    public void exceptionSaldoInsufiente(){
        assertThrows(SaldoInsuficiente.class,
        () ->{c.saque(210f);});

    }

}