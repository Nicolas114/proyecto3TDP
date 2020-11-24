package entidad;

import GUI.EntidadGrafica;
import mapa.Celda;
import mapa.Mapa;

public abstract class Entidad {


	//public static final int PIXEL = 64;
	protected Celda miCelda;
	protected Mapa miMapa;
	//protected Visitor miVisitor;
	protected int x;
	protected int y;
	protected EntidadGrafica entidadgrafica;

	public Entidad(Mapa mapa, Celda celda) {
		this.x = celda.getX();
		this.y = celda.getY();
		miCelda = celda;
		miMapa = mapa;
	}

	//public abstract void aceptar(Visitor visitor);

	public void setCelda(Celda c) {
		miCelda = c;
	}

	public Celda getCelda() {
		return miCelda;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public EntidadGrafica getEntidadGrafica() {
		return entidadgrafica;
	}
	
	/*
	public Visitor getVisitor() {
		return miVisitor;
	}

	 */

}