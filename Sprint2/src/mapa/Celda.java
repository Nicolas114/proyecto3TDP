package mapa;

import entidad.Entidad;

public class Celda {

	protected int x;
	protected int y;
	protected Mapa miMapa;
	protected Entidad miEntidad;
	

	public Celda(Mapa mapa, int x, int y) {
		this.miMapa = mapa;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Crea una celda con una entidad
	 * @param m - El mapa que contiene esta celda
	 * @param en - La entidad ubicada en este celda
	 */
	public Celda(Mapa m, Entidad en) {
		miMapa = m;
		miEntidad = en;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	/**
	 * Retorna la entidad ubicada en esta celda.
	 * @return La entidad ubicada en esta celda
	 */
	public Entidad getEntidad() {
		return miEntidad;
	}

	/**
	 * Inserta una entidad en esta celda. Si existía una entidad anteriormente en esta celda, es reemplazada.
	 * @param en - La entidad a insertar
	 */
	public void setEntidad(Entidad en) {
		miEntidad = en;
	}

}
