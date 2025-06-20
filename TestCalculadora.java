package com.progra;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		calcu=new Calculadora();
		
		int resultSuma=calcu.sumar(5, 3);
		int resultResta=calcu.restar(10,3);
		double resultadoMulti=calcu.multi(10,5);
		double resultadoDiv=calcu.division(10,2);
		double promedio=calcu.promediar(10, 8, 9);
				
		System.out.println("La suma es:"+resultSuma);
		System.out.println("La resta es:"+resultResta);
		System.out.println("La multiplicacion es:"+resultadoMulti);
		System.out.println("La division es:"+resultadoDiv);
		System.out.println("El promedio es:"+promedio);
		calcu.mostrarResultados();
	}

}
