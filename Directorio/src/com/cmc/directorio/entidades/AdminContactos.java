package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto cont1, Contacto cont2) {
	    if (cont1 == null && cont2 == null) {
	    	return null;}
	    if (cont1 == null) {
	    	return cont2;}
	    if (cont2 == null) {
	    	return cont1;}
	    
	    double peso1 = cont1.getPeso();
	    double peso2 = cont2.getPeso();
	    
	    if (peso1 > peso2) {
	        return cont1;
	    } else if (peso2 > peso1) {
	        return cont2;
	    } else {
	        return null;
	    }
	}
	
	public boolean compararOperadoras(Contacto cont, Contacto cont2) {
		Telefono op= cont.getTelefono();
		Telefono op2=cont2.getTelefono();
		
		String operadora=op.getOperadora();
		String operadora2= op2.getOperadora();
		
		if(operadora==operadora2) {
			return true;
		}else {
			return false;
		}
	}
	
	public void activarUsusario(Contacto cont) {
		Telefono telf =cont.getTelefono();
		boolean whats =telf.isTieneWhatsapp();
		if(whats== true) {
			cont.setActivo(true);
		}	else {
			cont.setActivo(false);
		}
	}
}
 