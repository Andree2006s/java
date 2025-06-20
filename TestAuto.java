package com.progra;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto("Ford",2000,15.000);
		Auto auto2=new Auto("Chevrolet",2014,18.000);
		
		System.out.println("Marca:"+auto1.getMarca());
		System.out.println("Anio:"+auto1.getAnio());
		System.out.println("Precio:"+auto1.getPrecio());
		
		System.out.println("Marca:"+auto2.getMarca());
		System.out.println("Anio:"+auto2.getAnio());
		System.out.println("Precio:"+auto2.getPrecio());
		}	
	}
