package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Models.GenericNode;

public class GenericQeue<T> {
    private GenericNode<T> front;
    private GenericNode<T> rear;
    private int size;

    public GenericQeue() {
        this.front = null;
        this.rear = null;
    }

    public void addNode(T value) {
        GenericNode<T> newNode = new GenericNode<>(value);
        if (isEmpty()) {
            rear = newNode;
            front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }
    public int getSize(){
        return size;
    }
}
