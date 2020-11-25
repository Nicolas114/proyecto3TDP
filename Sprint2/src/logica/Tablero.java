package logica;

import java.util.Collection;

//import Enemigos.Enemigo;
import entidad.*;
import entidad.jugador.*;

public class Tablero {
	
	private static Tablero instance;
	private Entidad jugador;
	//private Collection<Enemigo> enemigos;
	
	public Tablero() {
		jugador = new Jugador(null, null);
	}
	
	public static Tablero getInstance() {
		if (instance==null) {
			instance = new Tablero();
		}
		return instance;
	}
}