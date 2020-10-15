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
public class PrintInst extends Expresion{
    private String CuerpoInstuccion;
    private LinkedList<ExpresionID> variables;

    public PrintInst(String CuerpoInstuccion) {
        this.CuerpoInstuccion = CuerpoInstuccion;
        variables = new LinkedList();
    }
    
    
    
}
