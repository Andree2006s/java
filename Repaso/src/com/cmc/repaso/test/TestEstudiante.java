package com.cmc.repaso.test;

import com.cmc.repaso.entidades.*;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudi=new Estudiante("Nicolas");
		
		estudi.calificar(8);
		
		System.out.println(estudi.resultado); 

	}

}
