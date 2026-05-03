public class Simulador {

    public static void main(String[] args) {

        Cola cola = new Cola();
        Pila pila = new Pila();

        Nodo c1 = new Nodo("001", "Maria", "Ventas");
        Nodo c2 = new Nodo("002", "Juan", "Soporte");

        cola.encolar(c1);
        cola.encolar(c2);

        cola.mostrarCola();

        Nodo atendido = cola.desencolar();

        if (atendido != null) {
            pila.push(atendido);
            System.out.println("Atendido: " + atendido.nombre);
        }

        System.out.println("Clientes agregados correctamente");
    }
}