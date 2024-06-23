package Practica1.resolucion;

public class Punto {
	double x;
	double y;

	public Punto (double x, double y){
		this.x=x;
		this.y=y;
	}

	public void imprimir(){
		System.out.println("coords: ("+x+","+y+")");
	}

	public void desplazar(double desp_x, double desp_y){
		x=x+desp_x;
		y=y+desp_y;
	}

	public static double distancia(Punto p1, Punto p2) {
		double dx = p2.x - p1.x;
		double dy = p2.y - p1.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}


