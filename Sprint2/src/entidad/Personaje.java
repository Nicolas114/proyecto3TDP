package entidad;

import mapa.Celda;
import mapa.Mapa;

public abstract class Personaje extends Entidad {

	private int carga_viral;
	private float vida;
	private int velocidad;
	private float daño;
	private int valor;
	private float maxVida;

	public Personaje(Mapa mapa, Celda celda) {
		super(mapa, celda);
		
	}
	
	public void morir() {
		miMapa.getLogica().eliminarEntidad(this);
	}
	
	public void recibirGolpe(int golpe) {
		vida = vida - golpe;
		if (vida <= 0) {
			morir();
		}
	}

}
