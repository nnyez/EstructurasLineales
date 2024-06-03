import Materia.Models.Windows;
import Pilas.GenericStack;
import Pilas.Pila;

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
        
        System.out.println("Elemento en la cima de la pila es: "+ pila.peek());
        System.out.println("Elemento eliminado de la pila ess: "+ pila.pop());
        System.out.println("Elemento en la cima de la pila es: "+ pila.peek());

    System.out.println();
    
    ///implementaciom de pila generica
       GenericStack<Windows> pilaPantalla = new GenericStack<>();
       pilaPantalla.push(new Windows("Home Page", "/home"));
       pilaPantalla.push(new Windows("Menu Page", "/home/menu"));
       pilaPantalla.push(new Windows("Setting Page", "/home/menu/settings"));

       
       System.out.println("Estoy en la pantalla: \n\t -->"+ pilaPantalla.peek().getNombre());
       System.out.println("Destruir la pantalla: \n\t -->"+ pilaPantalla.pop().getNombre());
       System.out.println("Estoy en la pantalla: \n\t -->"+ pilaPantalla.peek().getNombre());
       pilaPantalla.push(new Windows("User Page", "/home/menu/user"));
       System.out.println("Estoy en la pantalla: \n\t -->"+ pilaPantalla.peek().getNombre());


    }
}
