package br.edu.ifal.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// import br.edu.ifal.banco.Conta.deposito;
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
        assertEquals((c.getSaldo() - saldoAntigo) == 10f, c.deposito(10f));
    }

}