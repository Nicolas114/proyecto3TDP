package entidad;

import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * Clase que representa todo objeto del mapa que se representa mediante un gr�fico
 */
public abstract class Graficable {	

	protected int x;
	protected int y;
	protected JLabel jl;	
	protected Icon icon;

	/**
	 * Crea un objeto graficable en la posici�n dada por par�metro.
	 * @param x - La coordenada x del objeto
	 * @param y - La coordenada y del objeto
	 */
	public Graficable(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Retorna el JLabel asociado al objeto.
	 * @return el JLabel del objeto
	 */
	public JLabel getLabel() {
		return jl;
	}
	
	/**
	 * Retorna la coodernada x del objeto.
	 * @return La coordenada x del objeto
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Retorna la coodernada y del objeto.
	 * @return La coordenada y del objeto
	 */
	public int getY() {
		return y;
	}
}
