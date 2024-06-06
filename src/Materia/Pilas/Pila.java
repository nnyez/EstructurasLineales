package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Models.Node;

/**
 * Pila
 */
public class Pila {
    private Node top;

    public Pila() {
        top = null;
    }

    // Push: Agregar elemento a la pila
    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (top == null) {
            System.out.println("La pila esta vacia");

            throw new EmptyStackException();
        } else {
            int value = top.value;
            top = top.next;

            return value;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("La pila esta vacia");

            throw new EmptyStackException();
        }
        return top.value;
    }
    public boolean isEmpty(){
        return top==null;
    }

}
