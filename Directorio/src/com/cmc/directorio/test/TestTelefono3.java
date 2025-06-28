package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;
public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","",1);
		Telefono telf2=new Telefono("claro","",2);
		Telefono telf3=new Telefono("movi","",3);
		
		AdminTelefono ad=new AdminTelefono();
		int cont=ad.contarMovi(telf, telf2, telf3);
		System.out.println("El numero de telefonos con movi es:"+cont);
	}

}
