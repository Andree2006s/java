package com.progra;

public class Cuadrado {
	public int lado;
	
	public double calcularArea () {
		double area = lado*lado;
		return area;
	}
	public double cacularPerimetro() {
		double perimetro=lado*4;
		return perimetro;
	}
}
