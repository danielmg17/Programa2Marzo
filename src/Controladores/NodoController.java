
package Controladores;

import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class NodoController implements ActionListener{
    
    //Levantar el Formulario Principal
    frmPrincipal vistaPrincipal;
    frmNodos vistaNodos;
    Lista nuevaLista;

    public NodoController(frmPrincipal vistaPrincipal, frmNodos vistaNodos, Lista nuevaLista) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaNodos = vistaNodos;
        this.nuevaLista = nuevaLista;
        
        
        //Poner a la escucha los botones
        this.vistaPrincipal.btnAgregarNodo.addActionListener(this);
       
        //Levantar Vista Principal
        this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.vistaPrincipal.setVisible(true);
    }
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vistaPrincipal.btnAgregarNodo)
        {
            //Abrir la vista Nodos
            //Poner a la escucha los botones de la vista nodos
            this.vistaNodos.btnApilar.addActionListener(this);
            this.vistaNodos.btnEncolar.addActionListener(this);
            
            //Levantar el formulario lista nodos
            this.vistaNodos.setLocationRelativeTo(null);
            this.vistaNodos.setVisible(true);
        }
    }
    
}
