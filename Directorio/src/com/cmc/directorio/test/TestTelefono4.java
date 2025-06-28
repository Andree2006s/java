package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;
public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf= new Telefono("movi","",1);
		Telefono telf2= new Telefono("claro","",2);
		Telefono telf3= new Telefono("claro","",3);
		Telefono telf4= new Telefono("claro","",4);
		AdminTelefono ad = new AdminTelefono();
		
		int cont=ad.contarClaro(telf, telf2, telf3, telf4);
		System.out.println("Hay "+cont+" con claro");
	}

}
