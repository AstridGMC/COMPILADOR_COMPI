/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Arbol;

import Backend.Manejador.Cuarteto;
import java.util.ArrayList;

/**
 *
 * @author astridmc
 */
public class AST {
    
    public ArrayList< Cuarteto> cuartetos;
    
    public  void recorridoInorden(Nodo raiz){
        ayudanteInorden(raiz);
    }
    
    //meoto recursivo para recorrido inorden
    private void ayudanteInorden( Nodo nodo)
    {
        if(nodo == null)
            return;
        
        ayudanteInorden(nodo.izquierdo);
        System.out.print(nodo.tipo + " ");
        ayudanteInorden(nodo.derecho);
    }
    
    
    
}
