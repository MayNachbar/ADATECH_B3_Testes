package br.ada.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercicioParTest {
        @Test
        void verificarPar() {
            ExercicioPar exercicioPar = new ExercicioPar();
            boolean isPar = exercicioPar.verificarPar(2);
            boolean isImpar = exercicioPar.verificarPar(3);
            assertTrue(isPar);
            assertFalse(isImpar);
        }
}