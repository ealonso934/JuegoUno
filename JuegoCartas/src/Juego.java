import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 380);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel lblResul = new JLabel("Resul");
		lblResul.setBounds(223, 23, 56, 16);
		contentPane.add(lblResul);

		JButton btnJugador = new JButton("Jugador");
		btnJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Carta miPaqueteDeCartas = new Carta();
				// miPaqueteDeCartas.sietecartas();
				Funcion miPaqueteDeCartas = new Funcion();
				miPaqueteDeCartas.baraja();

			}
		});
		btnJugador.setBounds(72, 215, 97, 25);
		contentPane.add(btnJugador);

		
		JButton btnComer = new JButton("Comer");
		btnComer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcion miPaqueteDeCartas = new Funcion();
				try {
					miPaqueteDeCartas.comer(lblResul);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnComer.setBounds(211, 215, 97, 25);
		contentPane.add(btnComer);

		JLabel lblUltimaCarta = new JLabel("Ultima Carta");
		lblUltimaCarta.setBounds(72, 23, 97, 16);
		contentPane.add(lblUltimaCarta);

		JComboBox cbxModoJuego = new JComboBox();
		cbxModoJuego.addItem("JUGADOR VS JUGADOR");
		cbxModoJuego.addItem("JUGADOR VS MAQUINA");
		cbxModoJuego.setBounds(99, 274, 180, 46);
		contentPane.add(cbxModoJuego);

		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnJugar.setBounds(295, 285, 97, 25);
		contentPane.add(btnJugar);

	}
	
	private void cerrarVentana() {
		int opcion = 0;
		opcion = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicación?", "Salir de Aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (opcion == JOptionPane.YES_OPTION) {
		this.dispose();
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
