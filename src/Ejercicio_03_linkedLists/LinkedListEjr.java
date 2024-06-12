package Ejercicio_03_linkedLists;

import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Node;

public class LinkedListEjr {

    private ListaEnlazada lista;

    public LinkedListEjr() {
        lista = new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(2);
        lista.addNode(5);
        lista.addNode(7);
        lista.addNode(6);
    }

    public int getByPos(int position) {
        int repeat = lista.getSize() - position;
        if (repeat < 0)
            return -1;
        Node current = lista.head;
        for (int i = 0; i < repeat; i++) {
            current = current.next;
        }
        return current.value;
    }

}
