package premio;

import entidad.Entidad;
import mapa.Celda;
import mapa.Mapa;

public abstract class Premio extends Entidad {

	public Premio(Mapa mapa, Celda celda) {
		super(mapa, celda);
	}
}
