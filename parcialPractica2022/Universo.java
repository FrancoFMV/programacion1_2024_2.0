package parcialPractica2022;

import java.util.ArrayList;

public class Universo {
    public Cuadrante[] cuadrantes;

    public ArrayList<Planeta> planetasConRazasDeNivelSuperior(int r) {
        ArrayList<Planeta> planetasSuperiores = new ArrayList<Planeta>();
        for (Cuadrante c : cuadrantes) {
            for (Planeta p : c.planetas) {
                int contadorRazasSuperiores = 0;

                for (Raza raza : p.razas) {
                    if (raza.nivelTecnologico > 9) {
                        contadorRazasSuperiores++;
                    }
                }
                if (contadorRazasSuperiores > r && !planetasSuperiores.contains(p)) {
                    planetasSuperiores.add(p);
                }

            }
        }
        return planetasSuperiores;
    }

    public int cantidadDePlanetasConEnemigos(){
        int cantDePlanetConEnem = 0;
        
        for (Cuadrante c : cuadrantes){

            for (Planeta p : c.planetas){
                int contadorRazasEnemigas = 0;
                
                for (Raza r : p.razas){
                    if(r.razaEnemiga != null){
                        contadorRazasEnemigas++; 
                    }
                }

                if (contadorRazasEnemigas >= 2){
                    cantDePlanetConEnem++;
                }
            }
        }

        return cantDePlanetConEnem;
    }
    
    
}
