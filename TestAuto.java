package com.progra;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		
		auto1= new Auto();
		auto2=new Auto();
		
		auto1.marca="Nissan";
		auto1.anio=2015;
		auto1.precio=15000;
		
		auto2.marca="Suzuki";
		auto2.anio=2025;
		auto2.precio=28000;
		
		System.out.println("Marca:"+ auto1.marca);
		System.out.println("Precio:"+ auto1.anio);
		System.out.println("Precio:"+auto1.precio);
		System.out.println("------------------");
		System.out.println("Marca:"+ auto2.marca);
		System.out.println("Precio:"+ auto2.anio);
		System.out.println("Precio:"+auto2.precio);
	}

}
