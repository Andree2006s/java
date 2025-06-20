package com.progra;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=3;
		
		int areaR1=r1.calcularArea();
		int areaR2=r2.calcularArea();
		
		System.out.println("El area de r2 es:"+areaR1);
		System.out.println("El area de r1 es:"+areaR2);

		double perimetroR1=r1.calcularPerimetro();
		double perimetroR2=r2.calcularPerimetro();
		System.out.println("El perimetro de r1:"+perimetroR1);
		System.out.println("El perimetro de r2:"+perimetroR2);
		
		}

}
