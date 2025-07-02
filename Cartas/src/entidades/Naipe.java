package entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numeros;
	private ArrayList<Carta> cartas;
	
	public Naipe() {
		ArrayList<Numero> numero = new ArrayList<Numero>();
		ArrayList<Carta> carta = new ArrayList<Carta>();
		
		// Crear los 13 números del naipe
		numero.add(new Numero("A", 11));
		numero.add(new Numero("2", 2));
		numero.add(new Numero("3", 3));
		numero.add(new Numero("4", 4));
		numero.add(new Numero("5", 5));
		numero.add(new Numero("6", 6));
		numero.add(new Numero("7", 7));
		numero.add(new Numero("8", 8));
		numero.add(new Numero("9", 9));
		numero.add(new Numero("10", 10));
		numero.add(new Numero("J", 10));
		numero.add(new Numero("Q", 10));
		numero.add(new Numero("K", 10));
		
		// Crear los 4 palos usando la clase Palos
		Palos palosObj = new Palos();
		ArrayList<String> palos = new ArrayList<String>();
		palos.add(palosObj.getCorazonRojo());   // "CR"
		palos.add(palosObj.getCorazonNegro());  // "CN"
		palos.add(palosObj.getDiamante());      // "DI"
		palos.add(palosObj.getTrebol());        // "TR"
		
		// Crear las 52 cartas combinando cada número con cada palo
		for (Numero num : numero) {
			for (String palo : palos) {
				carta.add(new Carta(num, palo));
			}
		}
		
		// Asignar las listas a los atributos de la clase
		this.numeros = numero;
		this.cartas = carta;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Numero> getNumeros() {
		return numeros;
	}
	
	// Método adicional para mostrar todas las cartas del naipe
	public void mostrarNaipe() {
		System.out.println("Naipe completo (" + cartas.size() + " cartas):");
		for (Carta carta : cartas) {
			carta.mostrar();
		}
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();
		int random;
		for(int i=1;i<101;i++) {
			random=Random.obtenerPosicion();
			Carta c=cartas.get(random);
				if(c.getEstado().equals("N")) {
					c.setEstado("C");
					auxiliar.add(c);
				}
			}
		for(int i=0;i<cartas.size();i++) {
			if(cartas.get(i).getEstado().equals("N")) {
				Carta a=cartas.get(i);
				auxiliar.add(a);
			}
		}
		return auxiliar;
	}
	
}

