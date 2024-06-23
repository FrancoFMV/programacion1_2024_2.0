package Arrays;

public class Metodos {
	public static void imprimir(int[] a) { // ej0
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++) { // Poner a.length-1 para que no repita la ultima posición
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[a.length - 1]);
		System.out.print("]");
	}

	public static int maximo(int[] a) { // ej1
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]); /*Linea de prueba*/
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static double promedio(int[] a) { // ej2
		double promedio = 0;
		double suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
			// System.out.println(suma); /*Linea de prueba*/
			promedio = suma / a.length;
		}
		return promedio;
	}

	public static int[] agregarAtras(int[] a, int x) { // ej3
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[a.length] = x;
		return b;
	}

	public static int[] quitar(int[] a, int pos) { // ej4
		int[] b = new int[a.length - 1];
		for (int i = 0, j =  0; i < a.length; i++) {
			if (i != pos) {
				b[j] = a[i];
				j++;
				// System.out.println(b[j-1]);/*Linea de prueba*/
			}
		}
		return b;
	}

	public static int[] reverso(int[] a){  //ej5
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++){
			b[i] = a[a.length - 1 - i];
		}
		return b;
	}

	public static void revertir(int[] a){  //ej6
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++){
			b[i] = a[a.length - 1 - i];
			System.out.println(b[i]);
		}
	}

	public static int[] opuestos(int[] a){  //ej7
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++){
			b[i] = -a[i];
		}

		return b;
	}

	public static void oponer(int[] a){
		for (int i = 0; i < a.length; i++){
			a[i] = -a[i];
			System.out.println(a[i]);
		}
	}
}
