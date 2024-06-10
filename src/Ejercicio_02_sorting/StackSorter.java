package Ejercicio_02_sorting;

import Materia.Pilas.Pila;

/**
 * StackSorter
 */
public class StackSorter {
    public void sortStack(Pila stack) {
        Pila resultStack = new Pila();
        Pila aux = new Pila();
        boolean flag = false;

        while (!stack.isEmpty()) {

            if (resultStack.isEmpty() && aux.isEmpty()) {
                resultStack.push(stack.pop());
            } else {

                try {
                    if (resultStack.isEmpty() || resultStack.peek() >= stack.peek()) {
                        flag = true;
                    } else {
                        aux.push(resultStack.pop());
                    }
                } catch (Exception e) {

                }
                if (flag == true) {
                    resultStack.push(stack.pop());
                    while (!aux.isEmpty()) {
                        resultStack.push(aux.pop());
                    }
                    flag=false;
                }

            }

        }
        System.out.println();

        while (!resultStack.isEmpty())

        {
            System.out.print(resultStack.pop() + (resultStack.isEmpty() ? "" : "-"));
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
