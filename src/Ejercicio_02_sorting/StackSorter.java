package Ejercicio_02_sorting;

import Materia.Pilas.Pila;

/**
 * StackSorter
 */
public class StackSorter {
    public void sortStack(Pila stack) {
        Pila resultStack = new Pila();
        Pila aux = new Pila();

        while (!stack.isEmpty()) {

            if (resultStack.isEmpty()) {
                resultStack.push(stack.pop());
            } else {

                try {
                    if (resultStack.peek() >= stack.peek()) {
                        aux.push(resultStack.pop());
                    } else {
                        resultStack.push(stack.pop());
                        while (!aux.isEmpty()) {
                            resultStack.push(aux.pop());
                        }
                    }

                } catch (Exception e) {
                    System.out.println("No existe");
                }

            }

        }
        while (!resultStack.isEmpty())

        {
            System.out.println(resultStack.pop());
        }

    }

    public void sortStack2(Pila a) {
        Pila newPila = new Pila();
        Pila aux = new Pila();
        while (!a.isEmpty()) {
            if (newPila.isEmpty()) {
                newPila.push(a.pop());
            } else {
                try {
                    while (newPila.peek() > a.peek()) {
                        aux.push(newPila.pop());
                    }
                } catch (Exception e) {
                    System.out.println("No existe");
                }
                newPila.push(a.pop());
                while (!aux.isEmpty()) {
                    newPila.push(aux.pop());
                }

            }

        }
        while (!newPila.isEmpty()) {
            System.out.println(newPila.pop());
        }

    }

}
