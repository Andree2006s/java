package servicios;
import java.util.*;
import entidades.*;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<String> nombresJugadores;

    // Constructor que recibe ArrayList con ids de jugadores
    public Juego(ArrayList<String> idsJugadores) {
        this.nombresJugadores = idsJugadores;
        this.cartasJugadores = new ArrayList<ArrayList<Carta>>();
        this.naipe = new Naipe(); // Inicializar y barajar el naipe
        this.naipe.barajar();

        for (int i = 0; i < idsJugadores.size(); i++) {
            ArrayList<Carta> cartasDelJugador = new ArrayList<Carta>();
            this.cartasJugadores.add(cartasDelJugador);
        }
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void entregarCartas(int cartasPorJugador) {
        int cartaActual = 0;

        for (int ronda = 0; ronda < cartasPorJugador; ronda++) {
            for (int jugador = 0; jugador < cartasJugadores.size(); jugador++) {
                if (cartaActual < naipe.getCartas().size()) {
                    Carta carta = naipe.getCartas().get(cartaActual);
                    cartasJugadores.get(jugador).add(carta);
                    cartaActual++;
                }
            }
        }
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public void setCartasJugadores(ArrayList<ArrayList<Carta>> cartasJugadores) {
        this.cartasJugadores = cartasJugadores;
    }

    public int devolverTotal(int idJugador) {
        if (idJugador < 0 || idJugador >= cartasJugadores.size()) {
            return 0;
        }

        int sumaTotal = 0;
        ArrayList<Carta> cartasDelJugador = cartasJugadores.get(idJugador);

        for (Carta carta : cartasDelJugador) {
            sumaTotal += carta.getNumero().getValor();
        }

        return sumaTotal;
    }

    public String determinarGanador() {
        if (cartasJugadores == null || cartasJugadores.size() == 0) {
            return null;
        }

        int idGanador = 0;
        int sumaGanador = devolverTotal(0);

        for (int i = 1; i < cartasJugadores.size(); i++) {
            int sumaJugadorActual = devolverTotal(i);
            if (sumaJugadorActual >= sumaGanador) {
                idGanador = i;
                sumaGanador = sumaJugadorActual;
            }
        }

        // Devolver el nombre del ganador
        return nombresJugadores.get(idGanador);
    }
}

