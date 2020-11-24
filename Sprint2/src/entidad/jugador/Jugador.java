package entidad.jugador;

import entidad.Personaje;
import mapa.Celda;
import mapa.Mapa;

public class Jugador extends Personaje {

	public Jugador(Mapa mapa, Celda celda) {
		super(mapa, celda);
		this.entidadgrafica.setImagen("img/recursos/jugador/jugador.png");
		
	}

	
}
