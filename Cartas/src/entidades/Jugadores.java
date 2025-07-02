package entidades;
import java.util.*;
import servicios.*;

public class Jugadores {
    private ArrayList<String> jugadores;

    public Jugadores() {
        this.jugadores = new ArrayList<String>();
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public void jugar() {
        ArrayList<String> jugadoresParaJuego = new ArrayList<String>();
        jugadoresParaJuego.add("Jugador 1");
        jugadoresParaJuego.add("Jugador 2");
        jugadoresParaJuego.add("Jugador 3");

        Juego juego = new Juego(jugadoresParaJuego);
        juego.entregarCartas(5);

        for (int i = 0; i < jugadoresParaJuego.size(); i++) {
            int totalJugador = juego.devolverTotal(i);
            System.out.println("Jugador " + (i + 1) + ": " + jugadoresParaJuego.get(i) +
                               " - Total: " + totalJugador);
        }

        String ganador = juego.determinarGanador();
        System.out.println("\nEl ganador es: " + ganador);
    }
}
