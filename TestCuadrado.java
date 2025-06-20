package com.progra;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		
		c1.lado=4;
		c2.lado=3;
		c3.lado=2;
		
		double areaC1=c1.calcularArea();
		double areaC2=c2.calcularArea();
		double areaC3=c3.calcularArea();
		
		double peric1=c1.cacularPerimetro();
		double periC2=c2.cacularPerimetro();
		double periC3=c3.cacularPerimetro();
		
		System.out.println("El area de C1 es:"+areaC1);
		System.out.println("El perimetro de C1 es:"+peric1);
		
		System.out.println("El area de C2 es:"+areaC2);
		System.out.println("El perimetro de C2 es:"+periC2);
		
		System.out.println("El area de C3 es:"+areaC3);
		System.out.println("El perimetro de C3 es:"+periC3);
	}

}
