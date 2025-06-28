package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("claro","0987654321",1);
		Telefono telf2= new Telefono("movi","1234567890",2);
		
		Contacto cont =new Contacto("","",telf,100.0);
		Contacto cont2 =new Contacto("","",telf2,90.0);
		
		AdminContactos ad= new AdminContactos();
		Contacto c=ad.buscarMasPesado(cont, cont2);
		boolean value=ad.compararOperadoras(cont, cont2);
	
		System.out.println("El peso es:"+c.getPeso());
		System.out.println(value);
	}

}
