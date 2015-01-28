import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Funcion {

	static Random randomColores = new Random();
	static Random randomNumeros = new Random();
	static int aStart = 0;
	static int aEnd = 9;
	static String colores[] = { "Rojo", "Verde", "Amarillo", "Azul" };
	static boolean tal = false;


	static void baraja() {
		int numeroaleatorioinical = random();
		int numeroaleatorio = random();
		int numeroaleatorio2 = random();
		int numeroaleatorio3 = random();
		int numeroaleatorio4 = random();
		int numeroaleatorio5 = random();
		int numeroaleatorio6 = random();
		int numeroaleatorio7 = random();
		int randintinicial = randomColores.nextInt(colores.length);
		int randint = randomColores.nextInt(colores.length);
		int randint2 = randomColores.nextInt(colores.length);
		int randint3 = randomColores.nextInt(colores.length);
		int randint4 = randomColores.nextInt(colores.length);
		int randint5 = randomColores.nextInt(colores.length);
		int randint6 = randomColores.nextInt(colores.length);
		int randint7 = randomColores.nextInt(colores.length);

		ArrayList listabaraja = new ArrayList();
		ArrayList barajainicial = new ArrayList();
		Carta cartainicial = new Carta();
		Carta carta1 = new Carta();
		Carta carta2 = new Carta();
		Carta carta3 = new Carta();
		Carta carta4 = new Carta();
		Carta carta5 = new Carta();
		Carta carta6 = new Carta();
		Carta carta7 = new Carta();
		cartainicial.setCara(numeroaleatorioinical);
		carta1.setCara(numeroaleatorio);
		carta2.setCara(numeroaleatorio2);
		carta3.setCara(numeroaleatorio3);
		carta4.setCara(numeroaleatorio4);
		carta5.setCara(numeroaleatorio5);
		carta6.setCara(numeroaleatorio6);
		carta7.setCara(numeroaleatorio7);
		cartainicial.setPalo(colores[randintinicial]);
		carta1.setPalo(colores[randint]);
		carta2.setPalo(colores[randint]);
		carta3.setPalo(colores[randint3]);
		carta4.setPalo(colores[randint4]);
		carta5.setPalo(colores[randint5]);
		carta6.setPalo(colores[randint6]);
		carta7.setPalo(colores[randint7]);
		
		barajainicial.add(cartainicial);
		listabaraja.add(carta1);
		listabaraja.add(carta2);
		listabaraja.add(carta3);
		listabaraja.add(carta4);
		listabaraja.add(carta5);
		listabaraja.add(carta6);
		listabaraja.add(carta7);
		
		
		
		JOptionPane.showMessageDialog(null, "La Carta Inicial es:   "   + barajainicial.get(0) + "");
		String op;
		do {
			
			op = JOptionPane.showInputDialog(null, "Ultima Carta:   " + barajainicial.get(0) + "\n" 		
														+ "0. Comer Carta\n"
														+ "1.  "+ listabaraja.get(0) + "\n" 
														+ "2.  "+ listabaraja.get(1) + "\n" 
														+ "3.  "+ listabaraja.get(2) + "\n" 
														+ "4.  "+ listabaraja.get(3) + "\n"
														+ "5.  "+ listabaraja.get(4) + "\n" 
														+ "6.  "+ listabaraja.get(5) + "\n" 
														+ "7.  "+ listabaraja.get(6) + "\n" 
														+ "8.  Salir");

			switch (op) {
			case "0":
				break;
			case "1":
				if( carta1.getCara()==cartainicial.getCara()||carta1.getPalo()==cartainicial.getPalo()){
						JOptionPane.showMessageDialog(null, "Jugador Eric pone:   " + listabaraja.get(0));
						listabaraja.set(0,"");
				}else
							JOptionPane.showMessageDialog(null, "La carta 1 no tiene semejanza con la ultima");
				if(listabaraja.contains(carta1)){
					JOptionPane.showMessageDialog(null, "La carta 1 ya fue tirada");
				}
				
				break;
			case "2":				
				if(listabaraja.contains(carta2)){
					JOptionPane.showMessageDialog(null, "Jugador Eric pone:   "
							+ listabaraja.get(0));
					listabaraja.set(0,"");
				}else
					JOptionPane.showMessageDialog(null, "La carta 1 ya fue tirada");
				break;
			case "3":
				listabaraja.set(2,carta4);
				break;
			case "4":
				listabaraja.set(3,carta5);
				break;
			case "5":
				listabaraja.set(4,carta6);
				break;
			case "6":
				listabaraja.set(5,carta7);
				break;
			case "7":
				listabaraja.set(6,carta2);
				break;
			case "8":
				System.exit(0);

				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion invalida !");
				break;
			}
		} while (!op.equals("8"));

		// String resultado = numeroaleatorio + colores[randint];
		// Correct
		// ArrayList<String> listabaraja = new ArrayList<String>();
		// ArrayList listabaraja = new ArrayList();
		// listabaraja.add(numeroaleatorio + "  " + colores[randint]);

		// Iterator it = listabaraja.iterator(); // se crea el iterador it para
		// el
		// array numeros
		// while (it.hasNext())
		// mientras queden elementos
		// System.out.println(it.next()); // muestra los datos

	}

	private static int random() {
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		Random random = new Random();
		long range = (long) aEnd - (long) aStart + 1;
		long fraction = (long) (range * randomNumeros.nextDouble());
		int numero = (int) (fraction + aStart);
		return numero;

	}

	void comer(final JLabel lblResul) throws Exception {
		int numero = random();
		int randint = randomColores.nextInt(colores.length);
		String resultado = numero + colores[randint];
		String resultado2 = numero + colores[randint];
		lblResul.setText(resultado);
		ArrayList listacomer = new ArrayList();
		// listacomer.add(numero + "  " + Carta.colores[randint]);
		// System.out.println(listacomer);

		Iterator it = listacomer.iterator();
		while (it.hasNext())

			// mientras queden elementos
			System.out.println(it.next()); // muestra los datos

	}
}
