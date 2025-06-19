package com.progra;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		return valor1+valor2;
	}
	
	public int restar(int valor1, int valor2) {
		return valor1-valor2;
	}
	public double multi(double valor1,double valor2) {
		return valor1 * valor2;
	}
	public double division(double valor1,double valor2) {
		return valor1/valor2;
	} 
	public double promediar(double valor1,double valor2,double valor3) {
		double total;
		total=valor1+valor2+valor3;
		return total/3;
	}
	public void mostrarResultados() {
		System.out.println("Ahorita no joven, sali al almuerzo.Regreso en 15 minutos");
	}
}
