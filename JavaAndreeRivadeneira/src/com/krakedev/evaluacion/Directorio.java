package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.*;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
public Directorio() {
	this.contactos=new ArrayList<Contacto>();	
	this.correctos=new ArrayList<Contacto>();
	this.incorrectos=new ArrayList<Contacto>();
}
	
public ArrayList<Contacto> getContactos() {
	return contactos;
}


public void setContactos(ArrayList<Contacto> contactos) {
	this.contactos = contactos;
}


public ArrayList<Contacto> getCorrectos() {
	return correctos;
}


public void setCorrectos(ArrayList<Contacto> correctos) {
	this.correctos = correctos;
}


public ArrayList<Contacto> getIncorrectos() {
	return incorrectos;
}


public void setIncorrectos(ArrayList<Contacto> incorrectos) {
	this.incorrectos = incorrectos;
}


public boolean agregarContacto(Contacto contacto) {
	Contacto contactoExistente = buscarPorCedula(contacto.getCedula());
	if (contactoExistente != null) {
		return false;
	} else {
		contactos.add(contacto);
		this.fechaModificacion = new Date();
		return true;
	}
}

public Contacto buscarPorCedula(String cedula) {
	Contacto r=null;
	for(int i=0;i<contactos.size();i++) {
		if(contactos.get(i).getCedula().equals(cedula)) {
			r=contactos.get(i);
		}
	}
	return r;
}

public Date getFechaModificacion() {
	return fechaModificacion;
}

public void setFechaModificacion(Date fechaModificacion) {
	this.fechaModificacion = fechaModificacion;
}

public String consultarUltimaModificacion() {
	if (this.fechaModificacion == null) {
		return null;
	}
	
	SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	return formato.format(this.fechaModificacion);
}

public int contarPerdidos() {
		int contador=0;
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getDireccion()==null) {
			 contador+=1;
			}
		}
		return contador;
}

public int contarFijos() {
	int fijos=0;
		for(int i=0;i<contactos.size();i++) {
			ArrayList<Telefono> telf=contactos.get(i).getTelefonos();
			for(int j=0;j<telf.size();j++) {
				if(telf.get(j).getTipo().equals("Convencional") && telf.get(j).getEstado().equals("C")) {
					fijos+=1;
				}
			}
		}
	return fijos;
}
	
public void depurar() {
	for (int i=0;i<contactos.size();i++) {
		Direccion dir=contactos.get(i).getDireccion();
		if(dir!=null) {
			correctos.add(contactos.get(i));
		}else {
			incorrectos.add(contactos.get(i));
		}
	}
}
	
}
