package com.progra;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA=new Producto();
		productoB=new Producto();
		productoC=new Producto();
		
		productoA.nombre="Parasetamol";
		productoA.descripcion="Patillas para tratar dolores";
		productoA.stockActual=15;
		productoA.precio=1.50;
		
		productoB.nombre="Buprex";
		productoB.descripcion="Patillas para dolor de cabeza";
		productoB.stockActual=10;
		productoB.precio=2.50;
		
		productoC.nombre="Pedialite";
		productoC.descripcion="Bebida hidratante";
		productoC.stockActual=17;
		productoC.precio=1.75;
		
		System.out.println("Nombre:"+productoA.nombre);
		System.out.println("Descripcion:"+productoA.descripcion);
		System.out.println("Stock:"+productoA.stockActual);
		System.out.println("Precio:"+productoA.precio);
		System.out.println("-----------");
		System.out.println("Nombre:"+productoB.nombre);
		System.out.println("Descripcion:"+productoB.descripcion);
		System.out.println("Stock:"+productoB.stockActual);
		System.out.println("Precio:"+productoB.precio);
		System.out.println("-----------");
		System.out.println("Nombre:"+productoC.nombre);
		System.out.println("Descripcion:"+productoC.descripcion);
		System.out.println("Stock:"+productoC.stockActual);
		System.out.println("Precio:"+productoC.precio);
	}

}
