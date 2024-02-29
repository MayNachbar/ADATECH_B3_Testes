package br.ada.aula2;

public class Calculadora {
    public double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        return (double) (num1 / num2);
    }
}
