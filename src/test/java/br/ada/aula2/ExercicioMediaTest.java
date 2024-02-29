package br.ada.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercicioMediaTest {
        @Test
        void calcularMedia() {
            ExercicioMedia exercicioMedia = new ExercicioMedia();
            double media = exercicioMedia.calcularMedia(6.5, 7.0, 7.5);
            assertEquals(7.0, media);
        }
}