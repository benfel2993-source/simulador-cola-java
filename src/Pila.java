public class Pila {

    Nodo tope;

    public Pila() {
        tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(Nodo nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
    }
}