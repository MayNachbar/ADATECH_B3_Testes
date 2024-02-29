package br.ada.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void adicao() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.adicao(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void subtracao() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtracao(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void multiplicacao() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicacao(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    void divisao() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divisao(6, 3);
        assertEquals(2, resultado);
    }

    @Test
    void divisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calculadora.divisao(6, 0));
    }
}