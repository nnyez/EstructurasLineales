package Materia.ListasEnlazadas;

import Materia.Models.GenericNode;

public class GenericLinkedList<T> {

    public GenericNode<T> head;
    private int size;

    public GenericLinkedList() {

    }

    public int getSize() {
        return size;
    }

    // Agregar nodos a la lista
    public void addNode(T value) {
        if (head == null) {
            head = new GenericNode<T>(value);
            return;
        }

        GenericNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new GenericNode<T>(value);

    }

    public void deleteNode(T value) {
        if (head == null)
            return;

        if (head.value == value) {
            head = head.next;
            return;
        }
        GenericNode<T> current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;

        }
    }

    public void print() {
        if (head == null) {
            System.out.println("lista vacia \n");
            return;
        }
        GenericNode<T> current = head;
        while (current.next != null) {
            System.out.println("Node ->" + current.value);
            current = current.next;

        }
        System.out.println("Node ->" + current.value);
        System.out.println("Fin de la lista\n");
    }

}
