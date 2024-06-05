package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Models.Node;

/**
 * Queues
 */
public class Queues {

    private Node front;
    private Node rear;
    private int size;

    public Queues() {
        this.front = null;
        this.rear = null;
    }

    //Metodo para agregar un Nodo a la cola
    public void addNode(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.next= newNode;
            rear = newNode;
        }
        size++;
    }

    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        int value = front.value;
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
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