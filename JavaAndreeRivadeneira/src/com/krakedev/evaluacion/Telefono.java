package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado="C";
	
	public Telefono(String numero, String tipo) {
        if (numero == null || tipo == null) {
            this.numero = numero;
            this.tipo = tipo;
            this.estado = "E";  
            return;  
        }
        
        if (!tipo.equals("Movil") && !tipo.equals("Convencional")) {
            this.numero = numero;
            this.tipo = tipo;
            this.estado = "E";  
            return;
        }
        
        if (tipo.equals("Movil")) {
            if (numero.length() != 10) {
                this.numero = numero;
                this.tipo = tipo;
                this.estado = "E";  
                return;
            }
        } else if (tipo.equals("Convencional")) {
            if (numero.length() != 7) {
                this.numero = numero;
                this.tipo = tipo;
                this.estado = "E";  
                return;
            }
        }
        
        this.numero = numero;
        this.tipo = tipo;
        this.estado = "C";  
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getEstado() {
        return estado;
    }
}
