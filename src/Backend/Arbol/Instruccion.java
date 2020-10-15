/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Arbol;

import java.util.LinkedList;

/**
 *
 * @author astridmc
 */
public class Instruccion {
    public LinkedList<Instruccion> SiguienteInstruccion;
    public verificadorTipos tipos =new verificadorTipos();
    
    public int NumeroLinea;
    
     public Instruccion()
    {
        SiguienteInstruccion=new  LinkedList();
    }
}
