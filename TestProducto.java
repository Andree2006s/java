package com.progra;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA=new Producto("Parasetamol","Pastillas para tratar dolores",1.50,12);
		productoB=new Producto("Buprex","Pastillas para tratar dolores",2.50,10);
		productoC=new Producto("Pedialite","Bebida hidratante",1.75,14);
		
		System.out.println("Nombre:"+productoA.getNombre());
		System.out.println("Descripcion:"+productoA.getDescripcion());
		System.out.println("Stock:"+productoA.getStockActual());
		System.out.println("Precio:"+productoA.getPrecio());
		System.out.println("-----------");
		System.out.println("Nombre:"+productoB.getNombre());
		System.out.println("Descripcion:"+productoB.getDescripcion());
		System.out.println("Stock:"+productoB.getStockActual());
		System.out.println("Precio:"+productoB.getPrecio());
		System.out.println("-----------");
		System.out.println("Nombre:"+productoC.getNombre());
		System.out.println("Descripcion:"+productoC.getDescripcion());
		System.out.println("Stock:"+productoC.getStockActual());
		System.out.println("Precio:"+productoC.getPrecio());
	}

}
