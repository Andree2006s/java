package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	
	public Estudiante(String cedula,String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<Nota>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void agregarNota(Nota agregarNota) {
	    if(agregarNota.getCalificacion() < 0 || agregarNota.getCalificacion() > 10) {
	        return; 
	    }
	    
	    String code2 = agregarNota.getMateria().getCodigo();
	    boolean materiaExiste = false;
	    
	    for(int i = 0; i < notas.size(); i++) {
	        String code = notas.get(i).getMateria().getCodigo();
	        if(code2.equals(code)) {
	            materiaExiste = true;
	            break;
	        }
	    }
	    
	    if(!materiaExiste) {
	        notas.add(agregarNota);
	    }
	}
	
	public void modificarNota(String codigo,double notaNueva) {
		for(int i=0;i<notas.size();i++) {
			String code=notas.get(i).getMateria().getCodigo();
			if(codigo.equals(code) && notaNueva>=0 && notaNueva<=10) {
				notas.get(i).setCalificacion(notaNueva);;
			} 
		}
	}
	
	public double calcularPromedioNotasEstudiante() {
	    if(notas == null || notas.size() == 0) {
	        return 0.0; 
	    }
	    double nota = 0;
	    for(int i = 0; i < notas.size(); i++) {
	        nota += notas.get(i).getCalificacion();
	    }
	    double prom = nota / notas.size();
	    return prom;
	}
	
	public void mostrar() {
		for(int i=0;i<notas.size();i++) {
			System.out.println("Materia:"+notas.get(i).getMateria().getNombre()+"\n Nota:"+notas.get(i).getCalificacion()+"");
		}
	}
}
