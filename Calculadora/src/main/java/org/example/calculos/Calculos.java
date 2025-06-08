package org.example.calculos;

public class Calculos {

    private double resultado;

    public double adicao(double numeroUm, double numeroDois) {
        resultado = numeroUm + numeroDois;
        return resultado;
    }

    public double subtracao(double numeroUm, double numeroDois) {
        resultado = numeroUm - numeroDois;
        return resultado;
    }

    public double multiplicao(double numeroUm, double numeroDois) {
        resultado = numeroUm * numeroDois;
        return resultado;
    }

    public double potencia(double numeroUm, double numeroDois) {
        resultado = Math.pow(numeroUm, numeroDois);
        return resultado;
    }

    public double raizQuadrada(double numeroUm) {
        resultado = Math.sqrt(numeroUm);
        return resultado;
    }

}
