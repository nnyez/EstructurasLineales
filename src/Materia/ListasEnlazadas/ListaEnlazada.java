package Materia.ListasEnlazadas;

import Materia.Models.Node;

public class ListaEnlazada {

    private Node head;

    public ListaEnlazada() {

    }

    // Agregar nodos a la lista
    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(value);

    }

    public void deleteNode(int value) {
        if (head == null)
            return;

        if (head.value == value) {
            head = head.next;
            return;
        }
        Node current = head;
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
        Node current = head;
        while (current.next != null) {
            System.out.println("Node ->" + current.value);
            current = current.next;

        }
        System.out.println("Node ->" + current.value);
        System.out.println("Fin de la lista\n");
    }

    // public int size(){
    // return 1;
    // }

}
