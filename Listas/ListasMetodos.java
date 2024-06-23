package Listas;

public class ListasMetodos {
    private NodoInt primero;

    public void imprimir() {
        System.out.print("[");
        NodoInt actual = this.primero;
        while (actual != null) {
            System.out.print(actual.elemento);
            if (actual.siguiente != null) {
                System.out.print(", ");
            }
            actual = actual.siguiente;
        }
        System.out.println("]");
    }

    public boolean pertenece(int e){
        if(this.primero==null){
            throw new RuntimeException("la lista está vacia");
        }
        NodoInt actual = this.primero;
        while (actual != null){
            if(actual.elemento == e){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void agregarAdelante(int n) {

        NodoInt nuevo = new NodoInt(n);
        nuevo.siguiente = this.primero;
        this.primero = nuevo;

    }

    public void agregarAtras(int n) {
        NodoInt nuevo = new NodoInt(n);

        if (this.primero == null) {
            this.primero = nuevo;

        }
        else {
            NodoInt actual = this.primero;
            while (actual.siguiente != null) {

                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public int maximo() {
        if (this.primero == null) {
            throw new RuntimeException("La lista esta vacia");
        }
        int max = this.primero.elemento;
        NodoInt actual = this.primero;
        while (actual != null) {
            if (max < actual.elemento) {
                max = actual.elemento;
            }
            actual = actual.siguiente;
        }
        return max;
    }

    public void quitar(int n) {
        if (this.primero != null && this.primero.elemento == n) {
            this.primero = this.primero.siguiente;

        } else {
            NodoInt actual = this.primero;

            while (actual.siguiente != null && actual.siguiente.elemento != n) {
                actual = actual.siguiente;
            }

            if (actual.siguiente != null) {
                actual.siguiente = actual.siguiente.siguiente;
            }
        }

    }

    public void quitarTodos(int i) {
        while (this.primero != null && this.primero.elemento == i) {
            this.primero = this.primero.siguiente;

        }
        NodoInt actual = this.primero;
        while (actual.siguiente != null && actual.siguiente != null) {
            if (actual.siguiente.elemento == i) {
                actual.siguiente = actual.siguiente.siguiente;
            } else
                actual = actual.siguiente;
        }
    }

    public int largo() {

        int cantidad = 0;
        NodoInt actual = this.primero;
        while (actual != null) {

            cantidad++;

            actual = actual.siguiente;
        }
        return cantidad;
    }

    public int iesimo(int i){
        if (this.primero == null) {
            throw new RuntimeException("La lista esta vacia");
        }
        NodoInt actual = this.primero;
        int posicion = 0;
        while(actual!=null && i!=actual.elemento){
            posicion++;
            actual = actual.siguiente;
        }

        return posicion;
    }

    public void quitarPorIndice(int i) {
        // Si el índice es negativo, lanzamos una excepción
        if (i < 0) {
            throw new IndexOutOfBoundsException("Índice negativo");
        }

        // Si la lista está vacía, no hay nada que eliminar
        if (this.primero == null) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        // Si se quiere eliminar el primer nodo (índice 0)
        if (i == 0) {
            this.primero = this.primero.siguiente;
            return;
        }

        // Encontrar el nodo en la posición i-1
        NodoInt actual = this.primero;
        int pos = 0;
        while (actual != null && pos < i - 1) {
            actual = actual.siguiente;
            pos++;
        }

        // Si actual es null o su siguiente es null, el índice está fuera de rango
        if (actual == null || actual.siguiente == null) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        // Saltar el nodo en la posición i
        actual.siguiente = actual.siguiente.siguiente;
    }

     public void intercambiar(int i, int j) {
        // Validar índices
        if (i < 0 || j < 0) {
            throw new IndexOutOfBoundsException("Índice negativo");
        }
        if (i == j) {
            return; // No hay nada que intercambiar si los índices son iguales
        }

        NodoInt prevI = null, prevJ = null;
        NodoInt nodoI = this.primero, nodoJ = this.primero;
        int pos = 0;

        // Encontrar nodo en la posición i y su predecesor
        while (nodoI != null && pos < i) {
            prevI = nodoI;
            nodoI = nodoI.siguiente;
            pos++;
        }

        // Resetear pos para buscar nodo en la posición j
        pos = 0;

        // Encontrar nodo en la posición j y su predecesor
        while (nodoJ != null && pos < j) {
            prevJ = nodoJ;
            nodoJ = nodoJ.siguiente;
            pos++;
        }

        // Validar que ambos nodos existen
        if (nodoI == null || nodoJ == null) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        // Intercambiar nodos
        if (prevI != null) {
            prevI.siguiente = nodoJ;
        } else {
            this.primero = nodoJ;
        }

        if (prevJ != null) {
            prevJ.siguiente = nodoI;
        } else {
            this.primero = nodoI;
        }

        // Intercambiar siguientes
        NodoInt temp = nodoI.siguiente;
        nodoI.siguiente = nodoJ.siguiente;
        nodoJ.siguiente = temp;
    }

    public void quitarDuplicados() {
        if (this.primero == null) {
            throw new RuntimeException("La lista está vacía");
        } else {
            NodoInt actual = this.primero;
            
            while (actual != null) {
                NodoInt iterador = actual;
                while (iterador.siguiente != null) {
                    if (iterador.siguiente.elemento == actual.elemento) {
                        iterador.siguiente = iterador.siguiente.siguiente;
                    } else {
                        iterador = iterador.siguiente;
                    }
                }
                actual = actual.siguiente;
            }
        }
    }

    
    
    public void invertir() {
        if (this.primero == null) {
            throw new RuntimeException("La lista está vacía");
        } else {
            NodoInt anterior = null;
            NodoInt actual = this.primero;
            NodoInt siguiente = null;
            
            while (actual != null) {
                siguiente = actual.siguiente; // Guarda el siguiente nodo
                actual.siguiente = anterior;  // Invierte el puntero
                anterior = actual;            // Mueve el puntero anterior a este nodo
                actual = siguiente;           // Avanza al siguiente nodo
            }
            
            this.primero = anterior; // El nuevo primer nodo es el último nodo original
        }
    }
    
    public void agregarEntrePares(int e) {
        if (this.primero == null) {
            throw new RuntimeException("La lista está vacía");
        } else {
            NodoInt actual = this.primero;
    
            while (actual != null && actual.siguiente != null) {
                // Verifica si el nodo actual y el siguiente nodo son pares
                if (actual.elemento % 2 == 0 && actual.siguiente.elemento % 2 == 0) {
                    // Crea un nuevo nodo con el valor especificado
                    NodoInt nuevoNodo = new NodoInt(e);
                    // Inserta el nuevo nodo entre el nodo actual y el siguiente nodo
                    nuevoNodo.siguiente = actual.siguiente;
                    actual.siguiente = nuevoNodo;
                    // Avanza al siguiente par de nodos
                    actual = nuevoNodo.siguiente;
                } else {
                    // Avanza al siguiente nodo
                    actual = actual.siguiente;
                }
            }
        }
    }
    
}