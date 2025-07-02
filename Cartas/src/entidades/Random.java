package entidades;

public class Random {
	
	public static int obtenerPosicion() {
		int random= (int)(Math.random()*51)+1;
		return random;
	}
}
