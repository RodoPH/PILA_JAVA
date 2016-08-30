package pila;

import javax.swing.JOptionPane;

public class UsoPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila usoPila = new Pila();
		String[] informacion = { "Apilar", " Desapilar.", " Mostrar pila", "Buscar elemento", "Salir" };

		try {
			String respuesta = ((String) JOptionPane.showInputDialog(null, "Elige una opción", "Opciones", 1, null,
					informacion, informacion[0]));

			// Apilar
			if (respuesta.equals(informacion[0])) {
				for (int i = 0; i <= 9; i++) {
					int datos = Integer.parseInt(JOptionPane.showInputDialog("Escribe un dato"));
					usoPila.apilar(datos);
				}
				
				
			}
			// Desapilar
			if (respuesta.equals(informacion[1])) {

				usoPila.desapilar();
			}
			// MOSTRAR PILA
			if (respuesta.equals(informacion[2])) {
				usoPila.mostrarPila();
			}
			if (respuesta.equals(informacion[3])) {
				usoPila.buscarElemento();
			}
			if (respuesta.equals(informacion[4])) {
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
