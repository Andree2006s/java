package com.cmc.repaso.test;

import com.cmc.repaso.entidades.*;

public class TestProducto {

	public static void main(String[] args) {
		Producto product=new Producto("Chocolate",5.00);
		
		System.out.println(product.getPrecio());
		System.out.println("---------------------");
		double desc=product.calcularPrecioPromo(20);
		
		product.setPrecio(desc);
		System.out.println(product.getPrecio());
	}

}
