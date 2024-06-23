package Objetos.ejFecha;

public class Fecha {
	int dia;
	int mes;
	int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public void imprimir() {
		System.out.print(this.dia + "/" + this.mes + "/" + this.anio);
	}

	static boolean bisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0)
			return true;
		else if (anio % 400 == 0)
			return true;
		else
			return false;
	}

	public static int diasDelMes(int mes, int anio) {
		if (mes == 2 && bisiesto(anio) == false) {
			return 28;
		} else if (mes == 2 && bisiesto(anio) == true) {
			return 29;
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		} else {
			return 30;
		}
	}

	public boolean esValida() { // Validar la fecha
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (dia < 1 || dia > diasDelMes(this.mes, this.anio)) {
			return false;
		}
		return true;
	}

	public void avanzarDia() {
		if (!esValida()) {
			System.out.println("Fecha no valida");
			return;
		}
		dia++;
		if (dia > diasDelMes(mes, anio)) {
			dia = 1;
			mes++;
			if (mes > 12) {
				mes = 1;
				anio++;
			}
		}
		imprimir();
	}

	public boolean antesQue(Fecha otra) {
		if (this.anio < otra.anio) {
			return true;
		} else if (this.anio == otra.anio) {
			if (this.mes < otra.mes) {
				return true;
			} else if (this.mes == otra.mes) {
				return this.dia < otra.dia;
			}
		}
		return false;
	}

	public int diaDelAño() {
		int totalDias = this.dia;
		for (int i = 1; i < this.mes; i++) {
			totalDias += diasDelMes(i, this.anio);
		}
		return totalDias;
	}

	public int diasDeDiferenciaCon(Fecha otra) {
		int diasFechaActual = this.diaDelAño();
		int diasOtraFecha = otra.diaDelAño();
		return Math.abs(diasFechaActual - diasOtraFecha);
	}

}
