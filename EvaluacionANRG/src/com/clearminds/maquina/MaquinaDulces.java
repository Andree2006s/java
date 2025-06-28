package com.clearminds.maquina;
import com.clearminds.componentes.*;
public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
		
	public void configurarMaquina(String cod1,String cod2,String cod3,String cod4) {
	    this.celda1 = new Celda(cod1);   
	    this.celda2 = new Celda(cod2);
	    this.celda3 = new Celda(cod3);
	    this.celda4 = new Celda(cod4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("Celda 1:"+celda1.getCodigo());	
		System.out.println("Celda 2:"+celda2.getCodigo());
		System.out.println("Celda 3:"+celda3.getCodigo());
		System.out.println("Celda 4:"+celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		if(codigo==celda1.getCodigo()) {
			return celda1;
		}else if(codigo==celda2.getCodigo()) {
			return celda2;
		}else if(codigo==celda3.getCodigo()) {
			return celda3;
		}else if(codigo==celda4.getCodigo()) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}
	
	public void mostrarProductos() {
	 		System.out.println("Codigo 1:"+celda1.getCodigo());
	 		System.out.println("Stock 1:"+celda1.getStock());
		 		if(celda1.getStock()==0) {
		 			System.out.println("La celda no tiene producto");
		 		}else {
			 		System.out.println("Nombre 1:"+celda1.getProducto().getNombre());
			 		System.out.println("Precio 1:"+celda1.getProducto().getPrecio());
			 	}
	 		
	 		System.out.println("Codigo 2:"+celda2.getCodigo());
	 		System.out.println("Stock 2:"+celda2.getStock());
		 		if(celda2.getStock()==0) {
		 			System.out.println("La celda no tiene producto");
		 		}else {
			 		System.out.println("Nombre 2:"+celda2.getProducto().getNombre());
			 		System.out.println("Precio 2:"+celda2.getProducto().getPrecio());
		 		}
	 		
	 		System.out.println("Codigo 3:"+celda3.getCodigo());
	 		System.out.println("Stock 3:"+celda3.getStock());
		 		if(celda3.getStock()==0) {
		 			System.out.println("La celda no tiene producto");
		 		}else {
			 		System.out.println("Nombre 3:"+celda3.getProducto().getNombre());
			 		System.out.println("Precio 3:"+celda3.getProducto().getPrecio());
		 		}
		 		
	 		System.out.println("Codigo 4:"+celda4.getCodigo());
	 		System.out.println("Stock 4:"+celda4.getStock());
	 			if(celda4.getStock()==0) {
		 			System.out.println("La celda no tiene producto");
	 			}else {
	 				System.out.println("Nombre 4:"+celda4.getProducto().getNombre());
	 				System.out.println("Precio 4:"+celda4.getProducto().getPrecio());
	 			}
	 		System.out.println("Saldo maquina:"+getSaldo());
	 	}
	
	public Producto buscarProductoEnCelda(String codigo) {
	    if(codigo.equals(celda1.getCodigo())) {  
	        return celda1.getProducto();
	    }else if(codigo.equals(celda2.getCodigo())) {  
	        return celda2.getProducto();
	    }else if(codigo.equals(celda3.getCodigo())) {  
	        return celda3.getProducto();
	    }else if(codigo.equals(celda4.getCodigo())) {  
	        return celda4.getProducto();
	    }else {
	        return null;
	    }
	}
	 
	 public double consultarPrecio(String codigo) {
		 if(codigo==celda1.getCodigo()) {
				return celda1.getProducto().getPrecio();
			}else if(codigo==celda2.getCodigo()) {
				return celda2.getProducto().getPrecio();
			}else if(codigo==celda3.getCodigo()) {
				return celda3.getProducto().getPrecio();
			}else if(codigo==celda4.getCodigo()) {
				return celda4.getProducto().getPrecio();
			}else {
				return 0;
			}
	 }
	 
	 public Celda buscarCeldaProducto(String codigo) {
		    if(celda1.getProducto() != null && codigo.equals(celda1.getProducto().getCodigo())) {
		        return celda1;
		    }else if(celda2.getProducto() != null && codigo.equals(celda2.getProducto().getCodigo())) {
		        return celda2;
		    }else if(celda3.getProducto() != null && codigo.equals(celda3.getProducto().getCodigo())) {
		        return celda3;
		    }else if(celda4.getProducto() != null && codigo.equals(celda4.getProducto().getCodigo())) {
		        return celda4;
		    }else {
		        return null;
		    }
		}
	 
	 public void incrementarProductos(String codigo,int cantidad) {
		Celda celdaEncontrada= buscarCeldaProducto(codigo);
		int total=celdaEncontrada.getStock()+cantidad;
		celdaEncontrada.setStock(total);
	 }
	 
	 public void vender(String codigo) {
		 int total =0;
		 double precio=0;
		 double valor=0;
		 if(codigo==celda1.getCodigo()) {
				 total=celda1.getStock()-1;
				 celda1.setStock(total);
				 precio=celda1.getProducto().getPrecio();
				 valor=getSaldo()+precio;
				 setSaldo(valor);
				 
			}else if(codigo==celda2.getCodigo()) {
				 total=celda2.getStock()-1;
				 celda2.setStock(total);
				 precio=celda2.getProducto().getPrecio();
				 valor=getSaldo()+precio;
				 setSaldo(valor);
				 
			}else if(codigo==celda3.getCodigo()) {
				total =celda3.getStock()-1;
				celda3.setStock(total);
				precio=celda3.getProducto().getPrecio();
				valor=getSaldo()+precio;
				setSaldo(valor);
				 
			}else if(codigo==celda4.getCodigo()) {
				total =celda4.getStock()-1;
				celda4.setStock(total);
				precio=celda4.getProducto().getPrecio();
				valor=getSaldo()+precio;
				setSaldo(valor);
			}
	 }
	 
	 public double venderConCambio(String codigo,double ingresado) {
		 int total =0;
		 double precio=0;
		 double valor=0;
		 if(codigo==celda1.getCodigo()) {
				 total=celda1.getStock()-1;
				 celda1.setStock(total);
				 precio=celda1.getProducto().getPrecio();
				 valor=getSaldo()+precio;
				 setSaldo(valor);
				 return ingresado-precio;
				 
			}else if(codigo==celda2.getCodigo()) {
				 total=celda2.getStock()-1;
				 celda2.setStock(total);
				 precio=celda2.getProducto().getPrecio();
				 valor=getSaldo()+precio;
				 setSaldo(valor);
				 return ingresado-precio;
				 
			}else if(codigo==celda3.getCodigo()) {
				total =celda3.getStock()-1;
				celda3.setStock(total);
				precio=celda3.getProducto().getPrecio();
				valor=getSaldo()+precio;
				setSaldo(valor);
				return ingresado-precio;
				
			}else if(codigo==celda4.getCodigo()) {
				total =celda4.getStock()-1;
				celda4.setStock(total);
				precio=celda4.getProducto().getPrecio();
				valor=getSaldo()+precio;
				setSaldo(valor);
				return ingresado-precio;
						
			}else {
				return 0;
			}
	 }
	 
}
