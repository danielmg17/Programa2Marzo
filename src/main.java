
import Controladores.NodoController;
import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmPrincipal vistaPrincipal = new frmPrincipal();
        frmNodos vistaNodos = new frmNodos(vistaPrincipal, true);
        
        Lista  nuevaLista = new Lista();
        
        //Levantar el controlador
        NodoController nuevoControlador = new NodoController(vistaPrincipal,vistaNodos,nuevaLista);
    }
    
}
