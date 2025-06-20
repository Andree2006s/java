package com.progra;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		
		auto1.setAnio(2001);
		auto1.setMarca("Ford");
		auto1.setPrecio(15000);
		
		auto2.setAnio(2014);
		auto2.setMarca("Chevorlet");
		auto2.setPrecio(18000);
		
		System.out.println("Marca:"+auto1.getMarca());
		System.out.println("Anio:"+auto1.getAnio());
		System.out.println("Precio:"+auto1.getPrecio());
		
		System.out.println("Marca:"+auto2.getMarca());
		System.out.println("Anio:"+auto2.getAnio());
		System.out.println("Precio:"+auto2.getPrecio());
		}	
	}
