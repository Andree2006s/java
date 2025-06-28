package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	
	public int contarMovi(Telefono telf,Telefono telf2,Telefono telf3) {
		int contador=0;
		if(telf.getOperadora()=="movi") {
			contador++;
		}
		if(telf2.getOperadora()=="movi") {
			contador++;
		}
		if(telf3.getOperadora()=="movi") {
			contador++;
		}
		
		return contador;
	}
	
	public int contarClaro(Telefono telf, Telefono telf2, Telefono telf3, Telefono telf4) {
		int cont=0;
		
		if(telf.getOperadora()=="claro") {
			cont ++;
		}
		if(telf2.getOperadora()=="claro") {
			cont ++;
		}
		if(telf3.getOperadora()=="claro") {
			cont ++;
		}
		if(telf4.getOperadora()=="claro") {
			cont ++;
		}
		return cont;
	}
	
	public void activarMensajeria(Telefono telf) {
		String operadora=telf.getOperadora();
		if(operadora=="movi") {
			telf.setTieneWhatsapp(true);
		}	
	}
}
