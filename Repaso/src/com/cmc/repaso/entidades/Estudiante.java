package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre;
	public double nota;
	public String resultado;
	
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	
	public void calificar(int nota) {
		if(nota <8) {
			this.resultado="F";
		}else if(nota>=8) {
			this.resultado="A";
		}
	}
}
