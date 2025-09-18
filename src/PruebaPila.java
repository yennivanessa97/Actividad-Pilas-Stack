import java.util.Stack;

public class PruebaPila {
    public static void main(String[] args){

        /*En esta parte se crea una pila de tipo string
        utilizando la clase stack de java*/
        Stack<String> pila = new Stack<>();

        // Mostrar la pila vacía
        System.out.println("pila vacía" + pila);

        /* Uso de la función isEmpty() para verificar si la pila está vacía.
        Si la pila está vacía la función retorna true, de lo contrario retorna false
         */
        System.out.println("¿Está vacía? : " + pila.isEmpty());

        /*
         Uso del metodo push() para insertar
         elementos en la parte superior de la pila
        */
        pila.push("Yenni");
        pila.push("Vanessa");
        pila.push("Delgado");
        pila.push("Velasco");

        // Mostrar la pila con los elementos ingresados
        System.out.println("pila" + pila);

        //Eliminar el último elemento ingresado con el método pop()
        pila.pop();
        System.out.println("Contenido después de pop: " + pila);
    }




}