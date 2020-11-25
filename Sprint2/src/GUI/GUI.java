package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidad.Graficable;
import logica.Juego;
import mapa.Celda;
import mapa.Mapa;

import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	private FondoPanel panelPrincipal;
	private Mapa mapa;
	private Juego logica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {

		logica = new Juego();
		mapa = new Mapa(logica);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setTitle("Space Invaders");
		panelPrincipal = new FondoPanel("/recursos/fondos/fondo.jpg");
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);

		JPanel panelSuperior = new JPanel();
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);

		JPanel panelCentral = new JPanel();
		panelCentral.setOpaque(false);
		panelPrincipal.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(12, 7, 0, 0));

		cargarTablero(mapa,panelCentral);


	}
	

	private void cargarTablero(Mapa mapa, JPanel jp) {

		for (int i = 0; i <mapa.getFilas(); i++) {

			for(int j = 0; j<mapa.getColumnas(); j++) {

				Celda c = mapa.getCelda(i,j);

				//ImageIcon grafico = new ImageIcon(Grafica.class.getResource("/recursos/jugador/jugador.png"));
				JLabel label = new JLabel();
				
				jp.add(label);
				label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255,0,0)));

				/*
				label.addComponentListener(new ComponentAdapter() {
					@Override
					public void componentResized(ComponentEvent e) {

						label.setIcon(grafico);

					}
				});

				 */

				label.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						System.out.println("click tablero X:"+c.getX()+" Y:"+c.getY());

					}
				});
				
			}
		}	

	}
	
	public void crearGrafico(Graficable g, int capa) {
		this.panelPrincipal.add(g.getLabel());
		g.getLabel().setBounds(g.getX(), g.getY(), Mapa.PIXEL, Mapa.PIXEL);
		if (capa>=0 && capa < panelPrincipal.getComponentCount()) {
			panelPrincipal.setComponentZOrder(g.getLabel(), capa);
		}		
	}

}
