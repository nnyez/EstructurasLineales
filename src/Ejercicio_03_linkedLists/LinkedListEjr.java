package Ejercicio_03_linkedLists;

import Materia.Models.Node;

public class LinkedListEjr {

    public Node head;
    private int size;

    public LinkedListEjr() {

    }

    public int getSize() {
        return size;
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
        size++;

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
        size--;
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

    public int getByPos(int position) {
        int repeat = size - position;
        if(repeat<0) return -1;
        Node current = head;
        for (int i = 0; i < repeat; i++) {
            current = current.next;
        }
        return current.value;
    }

}
