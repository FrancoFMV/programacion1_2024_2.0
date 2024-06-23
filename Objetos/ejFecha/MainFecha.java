package Objetos.ejFecha;

import java.util.*;

public class MainFecha {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("dia: ");
		int dia = scan.nextInt();
		System.out.print("mes: ");
		int mes = scan.nextInt();
		System.out.print("anio: ");
		int anio = scan.nextInt();

		Fecha f1 = new Fecha(dia, mes, anio);
		/* Ejercicio 0 */
		f1.imprimir();
		System.out.println(); /* Salto de linea */

		/* Ejercicio 1 */
		System.out.println("El mes tiene " + Fecha.diasDelMes(mes, anio) + " dias");

		/* Ejercicio 2 */
		if (f1.esValida() == true) {
			System.out.println("Fecha valida");
		} else {
			System.out.println("Fecha no valida");
		}

		/* Ejercicio 3 */
		System.out.print("Mañana será ");
		Fecha f1Avanzada = new Fecha(f1.dia, f1.mes, f1.anio); // Crear una nueva instancia de Fecha
		f1Avanzada.avanzarDia(); // Avanzar un día en la nueva instancia (Esto para no afectar a los metodos posteriores)

		/* Ejercicio 4 */
		System.out.print("\notro dia: ");
		int dia2 = scan.nextInt();
		System.out.print("otro mes: ");
		int mes2 = scan.nextInt();
		System.out.print("otro anio: ");
		int anio2 = scan.nextInt();

		Fecha f2 = new Fecha(dia2, mes2, anio2);

		if (f2.antesQue(f1) == true) {
			System.out.println("La fecha introducida es anterior a la primera.");
		} else {
			System.out.println("La fecha introducida es posterior a la primera.");
		}

		/* Ejercicio 5 */
		System.out.println("Es el día número " + f1.diaDelAño() + " del año");

		/* Ejercicio 6 */
		System.out.println("Hay " + f1.diasDeDiferenciaCon(f2) + " días de diferencia");
	}
}
