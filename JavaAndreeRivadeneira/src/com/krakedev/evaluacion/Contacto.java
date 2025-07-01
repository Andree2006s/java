package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos=new ArrayList<Telefono>();
	}
	
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void imprimir() {
		if(direccion!=null) {
			System.out.println("\nNombre:"+getNombre()+getApellido()
			+"\nDireccion:"+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());
		}else {
			System.out.println("\nNombre:"+getNombre()+getApellido()+"No tiene direccion asociada");
		}
	}	
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
		for(int i=0;i<telefonos.size();i++) {
			if(!telefonos.get(i).getEstado().equals("E")) {
				System.out.println("Telefono con estado"+telefonos.get(i).getEstado()+"\nNumero:"+telefonos.get(i).getNumero()
						+",Tipo:"+telefonos.get(i).getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> recuperados=new ArrayList<Telefono>();
		for(int i=0;i<telefonos.size();i++) {
			if(telefonos.get(i).getEstado().equals("E")) {
				recuperados.add(telefonos.get(i));
			}
		}
		return recuperados;
	}
	
	
}
