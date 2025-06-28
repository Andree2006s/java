package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;
public class TestActivos {

	public static void main(String[] args) {
		
		Telefono telf = new Telefono("claro","0987654321",1);
		Contacto c= new Contacto("A","K",telf,70.0);
		
		AdminTelefono ad=new AdminTelefono();
		ad.activarMensajeria(telf);
		
		AdminContactos ac=new AdminContactos();
		ac.activarUsusario(c);
	
		System.out.println(telf.isTieneWhatsapp()); 
		System.out.println(c.isActivo());
	}

}
