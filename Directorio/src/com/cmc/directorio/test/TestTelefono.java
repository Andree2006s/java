package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",10);
		
	System.out.println(telf.getNumero());
	System.out.println(telf.getOperadora());
	System.out.println(telf.getCodigo());
		
		
	}

}
