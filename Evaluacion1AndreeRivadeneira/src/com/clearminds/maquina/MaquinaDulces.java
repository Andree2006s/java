package com.clearminds.maquina;
import java.util.ArrayList;
import com.clearminds.componentes.*;
public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
	celdas=new ArrayList<Celda>();
	}
	
	public void agregarCelda(Celda codigo) {
		celdas.add(codigo); 
	}
	
	public void mostrarConfiguracion() {
		for(int i =0;i<celdas.size();i++) {
			System.out.println(celdas.get(i).getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigo) {
		Celda c1=null;
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getCodigo().equals(codigo)) {
				 c1=celdas.get(i);
			}			
		}
		return c1;
	}
	
	public void cargarProducto(Producto p,String codigo,int item) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p, item);
	}
	
	public void mostrarProductos() {
		for(int i =0;i<celdas.size();i++) {
			System.out.println("Codigo:"+celdas.get(i).getCodigo()+"\t");
			System.out.println("Stock:"+celdas.get(i).getStock()+"\t");
			if(celdas.get(i).getProducto()!=null) {
				System.out.println("Nombre:"+celdas.get(i).getProducto().getNombre()+"\t");
				System.out.println("Precio:"+celdas.get(i).getProducto().getPrecio()+"\t");
			}else {
				System.out.println("Sin producto asignado");
			}
			System.out.println("Saldo:"+this.saldo);
		}
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Producto p=null;
		
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getCodigo().equals(codigo)) {
				p=celdas.get(i).getProducto();
			}
		}		
		return p;
	}
	
	public double consultarPrecio(String codigo) {
		double precio=0;
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getCodigo().equals(codigo)) {
				precio=celdas.get(i).getProducto().getPrecio();
			}
		}
		return precio;
	} 
	
	public Celda buscarCeldaProducto(String codigoP) {
		Celda celda=null;
			for(int i=0; i<celdas.size();i++) {
				if(celdas.get(i).getProducto() != null && celdas.get(i).getProducto().getCodigo().equals(codigoP)) {
					celda=celdas.get(i);
				}
			}
		return celda;
	}
	
	public void incrementarProductos(String codigoP, int items) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoP);
		celdaEncontrada.setStock(items);
	}
	
	public void vender(String codigoC) {
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getCodigo().equals(codigoC)&& celdas.get(i)!=null) {
				double precio=celdas.get(i).getProducto().getPrecio();
				this.saldo+=precio;
			}
		}
	}
	
	public double venderConCambio(String codigoC,int valor) {
		double cambio=0;
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getCodigo().equals(codigoC)) {
				int stock=celdas.get(i).getStock()-1;
				celdas.get(i).setStock(stock);
				cambio=valor-celdas.get(i).getProducto().getPrecio();
			}
		}
		return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> ap=new ArrayList<Producto>();
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getProducto() != null) {
				double precio=celdas.get(i).getProducto().getPrecio();
				if(precio<limite) {
					ap.add(celdas.get(i).getProducto());
				}
			}
			
		}
		return ap;
	}
	
	
}


