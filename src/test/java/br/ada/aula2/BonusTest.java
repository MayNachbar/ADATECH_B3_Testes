package br.ada.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusTest {

    @Test
    public void deveReceber5PorcentoBonus() {
        //Arrange
        Bonus bonus = new Bonus();
        //Act
        double bonusRecebido = bonus.calcularBonus(21, 6, 1000);
        //Assert
        assertEquals(bonusRecebido, 50);
    }

    @Test
    public void deveReceber10PorcentoBonus() {
        //Arrange
        Bonus bonus = new Bonus();
        //Act
        double bonusRecebido = bonus.calcularBonus(31, 12, 1000);
        //Assert
        assertEquals(bonusRecebido, 100);
    }

    @Test
    public void naoRecebeBonus() {
        //Arrange
        Bonus bonus = new Bonus();
        //Act
        double bonusRecebido = bonus.calcularBonus(19, 5, 1000);
        //Assert
        assertEquals(bonusRecebido, 0);
    }
}
