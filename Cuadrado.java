package com.progra;

public class Cuadrado {
	private int lado;
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public double calcularArea () {
		double area = lado*lado;
		return area;
	}
	public double cacularPerimetro() {
		double perimetro=lado*4;
		return perimetro;
	}
}
