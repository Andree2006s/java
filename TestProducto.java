package com.progra;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA=new Producto();
		productoB=new Producto();
		productoC=new Producto();
		
		
		productoA.setNombre("Parasetamol");
		productoA.setDescripcion("Patillas para tratar dolores");
		productoA.setStockActual(15);
		productoA.setPrecio(1.50);
		
		productoB.setNombre("Buprex");
		productoB.setDescripcion("Patillas para dolor de cabeza");
		productoB.setStockActual(10);
		productoB.setPrecio(2.50);
		
		productoC.setNombre("Pedialite");
		productoC.setDescripcion("Bebida hidratante");
		productoC.setStockActual(17);
		productoC.setPrecio(1.75);
		
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
