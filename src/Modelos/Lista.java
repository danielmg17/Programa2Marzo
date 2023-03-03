
package Modelos;

/**
 *
 * @author umg
 */
public class Lista {
    Nodo primero;
    
    public void Apilar(int dato)
    {
        Nodo nuevoNodo = new Nodo(dato);
        if(primero == null)
        {
            primero = nuevoNodo;
        }
        else{
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
    }
}
