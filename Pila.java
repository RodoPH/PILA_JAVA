package pila;

import javax.swing.JOptionPane;

public class Pila {

	int arreglo[] = new int[10];
	int i, o;
	boolean lleno = false, vacio = false;

	public Pila() {
		for (int j = 0; j < arreglo.length; j++) {
			arreglo[j] = j;
		}

	}

	public void apilar(int dato) {
		if (comprobrarPilaLlena()) {
			arreglo[i] = dato;
			i++;
		} else {
			System.out.println("La pila está llena");
		}
	}

	private boolean comprobrarPilaLlena() {

		if (i <= 9) {
			return true;
		} else {
			return false;
		}
	}

	public void desapilar() {

		if (comprobarPilaVacia()) {
			arreglo[i] = 0;
			i--;
		} else {
			System.out.println("La pila está vacía");
		}
	}

	private boolean comprobarPilaVacia() {

		if (i >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarPila() {
		for (int i = 9; i <= arreglo.length; i--) {
			System.out.println(arreglo[i]);
		}
	}

	public void buscarElemento() {

		int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe número a buscar", "Buscar", 1));

		for (int z = 0; z < arreglo.length; z++) {

			if (dato == arreglo[z]) {
				o++;
			}
		}
		if(o>0)
			JOptionPane.showMessageDialog(null, "Elemento está " + o + " veces.");
		else
			JOptionPane.showMessageDialog(null, "El elemento no se encuentra en la cola");
		
	}
}
