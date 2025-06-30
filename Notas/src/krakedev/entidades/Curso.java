package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> curso;

	 public Curso() {
	        this.curso = new ArrayList<Estudiante>();
	    }

	    public int getEstudiantes() {    
	        return curso.size();
	    }

	    public void setCurso(ArrayList<Estudiante> curso) {
	        this.curso = curso;
	    }

	public String buscarEstudiantesPorCedula(Estudiante estudiante) {
		String clase=null;
		for(int i=0;i<curso.size();i++) {
				String cedula=estudiante.getCedula();
			if(curso.get(i).getCedula().equals(cedula) && curso.get(i).getCedula()!=null) {
				 clase="Esta en clase";
				 break;
			}
		}
		return clase;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		String result=buscarEstudiantesPorCedula(estudiante);
		if(result==null) {
			curso.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		double promC=0;
		for(int i=0;i<curso.size();i++) {
			promC+=curso.get(i).calcularPromedioNotasEstudiante();
		}
		return promC/curso.size();
	}
	
	public void mostrar() {
		for(int i=0;i<curso.size();i++) {
			System.out.println("Promedio Curso "+i+1+" :"+curso.get(i).calcularPromedioNotasEstudiante());
		}
	}
}
