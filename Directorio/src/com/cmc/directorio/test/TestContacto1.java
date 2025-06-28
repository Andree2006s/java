package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;
public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi","09999876",1);
		Contacto c = new Contacto("Andree","Rivadeneira",telf,70.0);
		
		System.out.println("Operadora:"+telf.getOperadora());
		System.out.println("Numero:"+telf.getNumero());
		System.out.println("Nombre:"+c.getNombre());
		System.out.println("Apellido:"+c.getApellido());
		System.out.println("Peso:"+c.getPeso());
		
	}

}
