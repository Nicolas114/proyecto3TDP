package GUI;

import javax.swing.JLabel;

public class EntidadGrafica extends JLabel {
	
	protected JLabel milabel;
	protected String path;

	public void setImagen(String string) {
		this.path = string;
	}

	public String getImagen() {
		return this.path;
	}
	
	public void setLabel(JLabel label) {
		this.milabel = label;
	}
	
	public JLabel getLabel() {
		return this.milabel;
	}
}
