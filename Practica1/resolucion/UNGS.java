package Practica1.resolucion;

public class UNGS {
    Comision[] comisiones;

    boolean cursaCon(Estudiante e, Docente d) {
        for (Comision com : this.comisiones) {
            if (com.estaEstudiante(e) && com.estaDocente(d)) {
                return true;
            }
        }
        return false;
    }
}