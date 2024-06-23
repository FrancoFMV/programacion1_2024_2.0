package Practica1.resolucion;

public class Main {
	public static void ej1() {
		Fraccion fr1 = new Fraccion(6, 9);
		Fraccion fr2 = new Fraccion(10, 8);
		System.out.print("Fracción: ");
		fr1.imprimir();
		// fr.invertirSigno();
		// fr.invertir();
		fr1.aDouble();
		fr1.reducir();
		System.out.print("Reducida: ");
		fr1.imprimir();
        Fraccion prodFraccion = Fraccion.producto(fr1, fr2);
        System.out.print("Producto de las fracciones: ");
        prodFraccion.imprimir();
		Fraccion sumaFraccion = Fraccion.suma(fr1, fr2);
		System.out.print("Suma de las fracciones: ");
        sumaFraccion.imprimir();
	}

	public static void ej2() {
		Punto punto1 = new Punto(2, 2);
		Punto punto2 = new Punto(1, 1);
		punto1.imprimir();
		punto2.imprimir();
		// punto.desplazar(-2,-1);
		System.out.println("Distancia: " + Punto.distancia(punto1, punto2));
	}

	public static void main(String[] args) {
		ej1();
		// ej2();
	}

}
