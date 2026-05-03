# Simulador de Atención de Clientes (Cola y Pila en Java)

## Descripción

Este proyecto implementa un simulador básico de atención de clientes utilizando estructuras de datos fundamentales.

El sistema permite:

* Registrar clientes en una cola de espera
* Atender clientes en orden de llegada
* Guardar los clientes atendidos en un historial

Se utilizan dos estructuras principales:

* Cola (Queue): gestión de clientes en espera bajo el principio FIFO (First In, First Out)
* Pila (Stack): almacenamiento del historial de clientes atendidos bajo el principio LIFO (Last In, First Out)

Todas las estructuras fueron implementadas manualmente mediante nodos enlazados, sin utilizar estructuras de Java como Queue, Stack o LinkedList.

---

## Conceptos aplicados

* Listas enlazadas
* Manejo de referencias
* FIFO (First In, First Out)
* LIFO (Last In, First Out)
* Simulación de procesos

---

## Estructura del proyecto

```
simulador-cola-java/
│
├── src/
│   ├── Nodo.java
│   ├── Cola.java
│   ├── Pila.java
│   └── Simulador.java
```

---

## Funcionalidades implementadas

### Cola (Queue)

* Agregar clientes (encolar)
* Atender clientes (desencolar)
* Mostrar clientes en espera
* Verificar si la cola está vacía

### Pila (Stack)

* Guardar clientes atendidos (push)
* Mostrar historial de atención
* Verificar si la pila está vacía

### Simulación

* Crear clientes manualmente en el código
* Atender un cliente
* Mostrar estado de la cola
* Mostrar historial de clientes atendidos

---

## Ejecución del programa

### Compilar

```bash
javac src/*.java
```

### Ejecutar

```bash
java -cp src Simulador
```

---

## Ejemplo de salida

```
001 - Maria - Ventas
002 - Juan - Soporte

Atendido: Maria

Historial:
001 - Maria - Ventas
```

---

## Tecnologías utilizadas

* Java
* Visual Studio Code
