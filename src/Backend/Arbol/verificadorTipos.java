/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Arbol;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author astridmc
 */
public class verificadorTipos implements Serializable{

    LinkedList<String> Tipos;

    public verificadorTipos() {
        Tipos = new LinkedList();
    }

    public boolean Buscar(String Tipo) {
        boolean res = false;
        int i;
        for (i = 0; i < Tipos.size(); i++) {
            if (Tipos.get(i).equals(Tipo)) {
                res = true;
            }
        }
        return res;
    }
    
     //Agrega un tipo a al conjunto de tipo
    public void Add(String Tipo) {
        boolean resBuscar = Buscar(Tipo);
        if (!resBuscar) {
            Tipos.add(Tipo);
        }
    }
}
