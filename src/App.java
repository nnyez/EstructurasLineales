import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Cola.GenericQeue;
import Materia.Cola.Queues;
import Materia.Models.Windows;
import Materia.Pilas.GenericStack;
import Materia.Pilas.Pila;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pila pila = new Pila();
        pila.push(5);
        pila.push(51);
        pila.push(0);
        pila.push(41);
        pila.push(11);
        pila.push(23);
        pila.push(23);
        pila.push(47);
        pila.push(55);

        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila ess: " + pila.pop());
        System.out.println("Elemento en la cima de la pila es: " + pila.peek());

        System.out.println();

        /// implementaciom de pila generica
        GenericStack<Windows> pilaPantalla = new GenericStack<>();
        pilaPantalla.push(new Windows("Home Page", "/home"));
        pilaPantalla.push(new Windows("Menu Page", "/home/menu"));
        pilaPantalla.push(new Windows("Setting Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla: \n\t -->" + pilaPantalla.peek().getNombre());
        System.out.println("Destruir la pantalla: \n\t -->" + pilaPantalla.pop().getNombre());
        System.out.println("Estoy en la pantalla: \n\t -->" + pilaPantalla.peek().getNombre());
        pilaPantalla.push(new Windows("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t -->" + pilaPantalla.peek().getNombre());
        System.out.println();
        // Implementacion colas
        Queues colas = new Queues();
        colas.addNode(8);
        colas.addNode(89);
        colas.addNode(100);

        System.out.println("El elemento del frente es: " + colas.peek());
        System.out.println("El elemento retirado es: " + colas.remove());
        System.out.println("El elemento del frente es: " + colas.peek());

        System.out.println("El elemento retirado es: " + colas.remove());
        System.out.println("El elemento del frente es: " + colas.peek());

        System.out.println("¿Cola vacia? " + (colas.isEmpty() ? "Si" : "No"));
        System.out.println("El tamaño de la cola es: " + colas.getSize());
        System.out.println();
        // implementacion cola generica

        GenericQeue<Windows> colaPantalla = new GenericQeue<>();
        colaPantalla.addNode(new Windows("Home Page", "/home"));
        colaPantalla.addNode(new Windows("Menu Page", "/home/menu"));
        colaPantalla.addNode(new Windows("Setting Page", "/homw/menu/settings"));

        System.out.println("Estoy en la pantalla: \n\t -->" + colaPantalla.peek().getNombre());
        System.out.println("Destruir la pantalla: \n\t -->" + colaPantalla.remove().getNombre());
        System.out.println("Estoy en la pantalla: \n\t -->" + colaPantalla.peek().getNombre());
        colaPantalla.addNode(new Windows("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t -->" + colaPantalla.peek().getNombre());

        System.out.println("El tamaño de la cola es: " + colaPantalla.getSize());

        SignValidator s = new SignValidator();
        System.out.println(
                s.isValid("()({[]})"));
        StackSorter st = new StackSorter();
        Pila f = new Pila();
        f.push(5);
        f.push(51);
        f.push(0);
        f.push(41);
        f.push(11);
        f.push(23);
        f.push(23);
        f.push(47);
        f.push(55);
        st.sortStack(f);
    }
}
