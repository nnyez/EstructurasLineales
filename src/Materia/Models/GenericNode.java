package Materia.Models;

public class GenericNode<T> {

    public T value;
    public GenericNode<T> next;

    public GenericNode(T value) {
        this.value = value; 
    }
}
