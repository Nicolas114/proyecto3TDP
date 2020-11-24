package mapa;

import mapa.Mapa;
import entidad.Entidad;
import logica.Juego;

public class Mapa {

	protected Celda[][] celdas;
	protected int filas, columnas;
	protected Juego juego;
	//falta nivel y lista de enemigos


	public Mapa(Juego juego) {
		filas = 14;
		columnas = 6;
		celdas = new Celda[filas][columnas];
		this.juego = juego;
		//crear lista de enemigos

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("ACA "+i);
				celdas[i][j] = new Celda(this, i, j);
			}
		}

		//crear nivel e iniciarlo
	}
	
	public void setEntidad(Entidad e) {
		celdas[e.getX()][e.getY()].setEntidad(e);
	}
	
	public Entidad getEntidad(int x, int y) {
		return celdas[x][y].getEntidad();
	}

	public Juego getLogica() {
		return juego;
	}


	public int getFilas() {
		return filas;
	}

	public int getColumnas() {
		return columnas;
	}


	public Celda getCelda(int x, int y) {
		if ((x < this.filas) && (x >= 0) && (y < this.columnas) && (y >= 0))
			return this.celdas[x][y];
		return null;
	}

	public Mapa cambiarNivel(boolean completado) {
		return null;
		
	}

}
