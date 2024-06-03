package Pilas;

import java.util.EmptyStackException;

import Materia.Models.GenericNode;

public class GenericStack<T> {
    private GenericNode<T> top;

    public GenericStack() {
        top = null;
    }

    // Push: Agregar elemento a la pila
    public void push(T value) {
        GenericNode<T> node = new GenericNode<T>(value);
        node.next = top;
        top = node;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");

            throw new EmptyStackException();
        } 
            T value = top.value;
            top = top.next;

            return value;
        
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");

            throw new EmptyStackException();
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
