package Objetos.PointYRectangle;

import java.awt.*;

public class Metodos {

	/* Ejercicio 1 */
	public static double distancia(Point p1, Point p2) {
		int dx = p1.x - p2.x;
		int dy = p1.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	/* Ejercicio 2 */
	public static double diagonal(Rectangle r) {
		Point p1 = new Point(r.x, r.y);
		Point p2 = new Point(r.x + r.width, r.y + r.height);
		return distancia(p1, p2);
	}

	/* Ejercicio 3 */
	public static Point centro(Rectangle r) {
		Point c = new Point((r.x + r.width) / 2, (r.y + r.height) / 2);
		return c;
	}

	/* Ejercicio 4 */
	public static boolean estaDentro(Point p, Rectangle r) {
		for (int i = 0; i < (r.width) && i < (r.height); i++) {
			if (!(p.x > r.x + i || p.x < r.x - i || p.y > r.y + i || p.y < r.y - i)) {
				return true;
			}
		}
		return false;
	}

	/* Ejercicio 5 */
	public static Point puntoMedio(Point p1, Point p2) {
		int xm = (p1.x + p2.x) / 2;
		int ym = (p1.y + p2.y) / 2;
		Point pm = new Point(xm, ym);
		return pm;
	}

	/* Ejercicio 6 */
	public static Rectangle encuadrar(Rectangle r1, Rectangle r2) {
		int x1 = Math.min(r1.x, r2.x);
		int y1 = Math.min(r1.y, r2.y);
		int x2 = Math.max(r1.x + r1.width, r2.x + r2.width);
		int y2 = Math.max(r1.y + r1.height, r2.y + r2.height);
		int ancho = x2 - x1;
		int alto = y2 - y1;
		return new Rectangle(x1, y1, ancho, alto);
	}

	/* Ejercicio 7 */
	public static boolean estaContenido(Rectangle r1, Rectangle r2) {
		if (!(r1.x > r2.x || r1.x < r2.x || r1.y > r2.y || r1.y < r2.y)) {
			return true;
		}
		return false;
	}

	/* Ejercicio 8 */
	public static Rectangle interseccion(Rectangle r1, Rectangle r2) {
		if (r1.intersects(r2)) { // Verifica si hay intersección
			int x = Math.max(r1.x, r2.x);
			int y = Math.max(r1.y, r2.y);
			int width = Math.min(r1.x + r1.width, r2.x + r2.width) - x;
			int height = Math.min(r1.y + r1.height, r2.y + r2.height) - y;
			return new Rectangle(x, y, width, height);
		} else {
			return null;
		}
	}
}
