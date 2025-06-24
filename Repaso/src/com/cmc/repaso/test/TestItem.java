package com.cmc.repaso.test;
import com.cmc.repaso.entidades.*;

public class TestItem {

	public static void main(String[] args) {
		Item i1=new Item();
		
		Item i2=new Item();
		
		i1.setProductosActuales(20);
		i1.imprimir();
		i1.vender(10);
		i1.devolver(5);
		i1.imprimir();
		
		i2.setProductosActuales(10);
		i2.setNombre("Chicles");
		
		i2.imprimir();
		
		i2.vender(4);
		i2.devolver(2);
		i2.imprimir();
	}

}
