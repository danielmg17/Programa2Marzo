
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Lista {
    Nodo primero;
    Nodo segundo; 
    Nodo Auxiliar;
    String cadena = "";
    
    public void Apilar()
    {
        
    }
        public void Encolar()
    {
        
    }
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
        
        JOptionPane.showMessageDialog(null, "Nodo APILADO");
    }
    
        public void Encolar(int dato)
    {
        Nodo nuevoNodo = new Nodo(dato);
        if(primero == null)
        {
            primero = nuevoNodo;
            segundo = nuevoNodo;
        }
        else{
            segundo.siguiente = nuevoNodo;          
            segundo = nuevoNodo;
        }
        
        JOptionPane.showMessageDialog(null, "Nodo ENCOLADO");
    }
    
    public String Listar()
    {
        Auxiliar = primero;
        cadena = "";
        while(Auxiliar != null)
        {
            cadena = cadena + "[" +Auxiliar.getDato()+"]";
            Auxiliar = Auxiliar.siguiente;
        }
        return cadena;
    }
}
