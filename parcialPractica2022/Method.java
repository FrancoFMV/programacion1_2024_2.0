package parcialPractica2022;

public class Method {
    public static String camelCase(String s){
        String retorno = "";
        /*(...caso base....)
        1. recorrer string con resto() (NADA DE CICLOS)
        2. asignar cada charAt a la variable "retorno"
        3. detectar si el charAt == ' ' y eliminarlo
        4. el charAt siguiente al ' ' pasa a Upper
        5. return*/ 

        if(s.isEmpty()){
            return retorno;
        }
        if(s.charAt(0)==' '){
            return s.toUpperCase().charAt(1) + camelCase(resto(resto(s)));
        }
        return s.charAt(0) + camelCase(resto(s));

    }

    public static String resto(String e){
        String result = "";
        for (int i = 1; i<e.length(); i++){
            result += e.charAt(i);
        }
        return result;
    }

    public static String restoInv(String e){
        String result = "";
        for (int i = 0; i<e.length()-1; i++){
            result += e.charAt(i);
        }
        return result;
    }

}
