/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Arbol;

import Backend.TablaDeSimbolos;
import java.util.LinkedList;

/**
 *
 * @author astridmc
 */
public class ExpresionID extends Expresion{
     public String Var;
    
    public LinkedList<Expresion> Indices;

 

    public ExpresionID subExpID;
    public boolean Global;
    
       
    public String NombreMetodo;
    public LinkedList<Expresion> Parametros;
    public boolean nueva;
    
    public ExpresionID(int Nolinea,ExpresionID subEx,String variable,LinkedList<Expresion> indices,boolean metodo) //Variable o metodo con Linea
    {
       
        subExpID=subEx; 
        NumeroLinea=Nolinea;
        if(metodo)
        {
            NombreMetodo=variable;
            Parametros=indices;
        }
        else{
        Var=variable;
        Indices=indices;
        
        }
       
    }
    
    public ExpresionID(ExpresionID subEx,String variable,LinkedList<Expresion> indices,boolean metodo) //Variable o metodo
    {
        subExpID=subEx;
        if(metodo)
        {
            NombreMetodo=variable;
            Parametros=indices;
         
        }
        else{
        Var=variable;
        Indices=indices;
        
        }
        
    }
   

    
}
