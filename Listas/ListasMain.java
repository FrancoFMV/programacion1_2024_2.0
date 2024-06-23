package Listas;

public class ListasMain {

    public static void main(String[] args) {
        // NodoInt nodo1 = new NodoInt(15);
        ListasMetodos lista = new ListasMetodos();

        lista.agregarAdelante(0);
        lista.imprimir();
        lista.agregarAdelante(2);
        lista.imprimir();
        lista.agregarAdelante(-18);
        lista.imprimir();
        lista.agregarAdelante(122);
        lista.imprimir();
        lista.agregarAdelante(15);
        lista.imprimir();
        System.out.println("está en la posición: " + lista.iesimo(-18));
        System.out.println("el maximo es: "+ lista.maximo());
        lista.agregarAtras(0);
        lista.imprimir();
        lista.imprimir();
        lista.quitarPorIndice(1);
        lista.imprimir();
        System.out.println(lista.pertenece(0));
        lista.intercambiar(0, 2);
        lista.imprimir();
        lista.quitarDuplicados();
        lista.imprimir();
        lista.invertir();
        lista.imprimir();
        lista.agregarAdelante(4);
        lista.agregarEntrePares(10);
        lista.imprimir();
    }

}