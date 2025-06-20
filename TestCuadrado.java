package com.progra;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		
		c1.setLado(2);
		c2.setLado(3);
		c3.setLado(5);
		
		double areaC1=c1.calcularArea();
		double areaC2=c2.calcularArea();
		double areaC3=c3.calcularArea();
		
		double periC1=c1.cacularPerimetro();
		double periC2=c2.cacularPerimetro();
		double periC3=c3.cacularPerimetro();
		
		System.out.println("Area:"+areaC1);
		System.out.println("Perimetro:"+periC1);
		
		System.out.println("Area:"+areaC2);
		System.out.println("Perimetro:"+periC2);
		
		System.out.println("Area:"+areaC3);
		System.out.println("Perimetro:"+periC3);
	}

}
