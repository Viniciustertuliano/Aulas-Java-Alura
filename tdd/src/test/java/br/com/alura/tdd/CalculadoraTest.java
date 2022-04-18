package br.com.alura.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.service.CalculadoraService;

public class CalculadoraTest {

    @Test
    public void somaDoisNumerosInteiros(){
        CalculadoraService calc = new CalculadoraService();
        int resp = calc.soma(6, 4);

        assertEquals(10, resp);
    }
}
