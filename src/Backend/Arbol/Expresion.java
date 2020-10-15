/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Arbol;

/**
 *
 * @author astridmc
 */
public class Expresion extends Instruccion{
    public String Operador;
    
    public String Valor;
    public String Temporal;
    
    public int Direccion;
    
     public boolean CargarTS()
    {
        boolean res=true;
        return res;
    }
    
    public String Generar3Direcciones(){String ret=""; return ret;}

    
}
