package Practica1.resolucion;

public class Comision {
    String materia;
    int numero;
    Docente[] docentes;
    Estudiante[] inscriptos;
    int[] clasificaciones;

    public boolean estaEstudiante(Estudiante e) {
        for(Estudiante est : this.inscriptos){
            if(est.equals(e)){
                return true;
            }
        }
        return false;
    }

    public boolean estaDocente(Docente d) {
        for (Docente doc : this.docentes){
            if (doc.equals(d)){
                return true;
            }
        }
        return false;
    }
}
