package Objetos.PointYRectangle;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(3, 0);
		Point p2 = new Point(3, 4);

		/* Ejercicio 1 */
		System.out.println(Metodos.distancia(p1, p2));

		/* Ejercicio 2 */
		Rectangle r1 = new Rectangle(0, 0, 3, 4);
		System.out.println(Metodos.diagonal(r1));

		/* Ejercicio 3 */
		Rectangle r2 = new Rectangle(0, 0, 30, 10);
		System.out.println(Metodos.centro(r2));

		/* Ejercicio 4 */
		Point s = new Point(5, 6);
		Point n = new Point(60, 80);
		System.out.println(Metodos.estaDentro(s, r2)); // true
		System.out.println(Metodos.estaDentro(n, r2)); // false

		/* Ejercicio 5 */
		System.out.println(Metodos.puntoMedio(s, n));

		/* Ejercicio 6 */
		Rectangle r3 = new Rectangle(4, 8, 60, 50);
		System.out.println(Metodos.encuadrar(r2, r3));

		/* Ejercicio 7 */
		System.out.println(Metodos.estaContenido(r1, r2)); // true
		System.out.println(Metodos.estaContenido(r2, r3)); // false

		/* Ejercicio 8 */
		System.out.println(Metodos.interseccion(r2, r3)); // Si hay intersección
		System.out.println(Metodos.interseccion(r1, r3)); // No hay intersección
	}
}
