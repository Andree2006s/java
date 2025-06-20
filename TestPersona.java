package com.progra;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; //Se declara una variable llamada p de tipo de Perosna (es una espacio que se crea en la memoria)
		
		p=new Persona(); //Se instancia(crea)un objeto perosna y se lo referencia con p
		
		Persona p2 = new Persona();
		
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
		
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.50);
	
		p2.setNombre("Angelina");
		p2.setEdad(30);
		p2.setEstatura(1.70);
		
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
		
		System.out.println("nombre:"+p2.getNombre());
		System.out.println("edad:"+p2.getEdad());
		System.out.println("estatura:"+p2.getEstatura());
	}

}
