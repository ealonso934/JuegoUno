import java.util.Random;

public class Carta {

	public static int random;

	public Carta() {
		// TODO Auto-generated constructor stub
	}

	private int cara;
	private String palo;

	public Carta(int caraCarta, String paloCarta) { // Abre constructor
		cara = caraCarta;
		palo = paloCarta;

	} // Cierra constructor

	public String toString() { // Abre metodo toString
		return cara + " " + palo;
	} // Cierra metodo toString

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

//	 void sietecartas() {
//		//Random random = new Random();
//		for (int idx = 1; idx <= 7; ++idx) {
//			Funcion.baraja();
//
//		}
//	}
}
