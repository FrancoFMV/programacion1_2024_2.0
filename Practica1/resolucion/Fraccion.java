
package Practica1.resolucion;

public class Fraccion {
    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void imprimir() {
        System.out.println(numerador + "/" + denominador + " = " + numerador / denominador);
    }

    public void invertirSigno() {
        numerador = -numerador;
        denominador = -denominador;
        imprimir();
    }

    public void invertir() {
        int aux = numerador;
        numerador = denominador;
        denominador = aux;
        imprimir();
    }

    public double aDouble() {

        return (double) numerador / denominador;
    }

    public void reducir() {
        int mcd = calcularMCD(Math.abs(numerador), Math.abs(denominador)); // Calcular el MCD de numerador y denominador
        numerador /= mcd; // Reducir el numerador
        denominador /= mcd; // Reducir el denominador
    }

    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static Fraccion producto(Fraccion q1, Fraccion q2) {
        int nuevoNumerador = q1.numerador * q2.numerador;
        int nuevoDenominador = q1.denominador * q2.denominador;

        Fraccion producto = new Fraccion(nuevoNumerador, nuevoDenominador);
        producto.reducir(); // Reducir la fracción resultante a su mínima expresión
        return producto;
    }

    // Método estático para sumar dos fracciones y devolver el resultado reducido
    public static Fraccion suma(Fraccion q1, Fraccion q2) {
        int nuevoNumerador = q1.numerador * q2.denominador + q2.numerador * q1.denominador;
        int nuevoDenominador = q1.denominador * q2.denominador;

        Fraccion suma = new Fraccion(nuevoNumerador, nuevoDenominador);
        suma.reducir(); // Reducir la fracción resultante a su mínima expresión
        return suma;
    }

}
