package entidad;

import mapa.Celda;
import mapa.Mapa;

public abstract class Personaje extends Entidad {

	protected int carga_viral;
	protected int vida;

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
