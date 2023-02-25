package br.edu.unoesc.api_calcula.service;

public class Calculadora {
	
	public static Double raiz(Double numero1, Double numero2) {
		Double a = Math.sqrt(numero1) + numero2;
		return a;		
	}

	public static Double potencia(Double numero1, Double numero2) {
		Double a = Math.pow(numero1, numero2);
		return a;
	}

	public static Double media(Double numero1, Double numero2) {
		Double soma = numero1 + numero2;
    	Double media = soma / 2;
		return media;
	}

	public static Double soma(Double numero1, Double numero2) {
		return numero1 + numero2;
	}

	public static Double subtracao(Double numero1, Double numero2) {
		return numero1 - numero2;
	}

	public static Double dividir(Double numero1, Double numero2) {
		return numero1 / numero2;
	}

	public static Double multiplicar(Double numero1, Double numero2) {
		return numero1 * numero2;
	}

}