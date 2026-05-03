public class Cola {

    Nodo frente;
    Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Nodo nuevo) {

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Nodo desencolar() {

        if (estaVacia()) {
            return null;
        }

        Nodo atendido = frente;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return atendido;
    }

    public void mostrarCola() {

        Nodo actual = frente;

        while (actual != null) {
            System.out.println(actual.id + " - " + actual.nombre + " - " + actual.servicio);
            actual = actual.siguiente;
        }
    }
}