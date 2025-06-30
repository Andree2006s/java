package com.clearminds.test;
import com.clearminds.componentes.*;
import com.clearminds.maquina.MaquinaDulces;
public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces m=new MaquinaDulces();
		m.agregarCelda(new Celda("A1"));
		m.agregarCelda(new Celda("A2"));
		m.agregarCelda(new Celda("A3"));
		m.agregarCelda(new Celda("A4"));
		m.agregarCelda(new Celda("A5"));
		m.agregarCelda(new Celda("A6"));
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		m.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		m.cargarProducto(producto2, "A2", 6);
		
		Producto producto3 = new Producto("B789", "Coca Cola", 1.50);
		m.cargarProducto(producto3, "A5", 8);

		Producto producto4 = new Producto("C123", "Snickers", 1.25);
		m.cargarProducto(producto4, "A3", 3);

		Producto producto5 = new Producto("F456", "Galletas", 2.10);
		m.cargarProducto(producto5, "A4", 5);

		Producto producto6 = new Producto("G789", "Agua", 0.95);
		m.cargarProducto(producto6, "A6", 10);
		
		m.buscarMenores(1.00);
		
		m.mostrarProductos();
	}

}
