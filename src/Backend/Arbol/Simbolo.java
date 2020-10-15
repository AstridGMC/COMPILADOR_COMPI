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
public class Simbolo {
    String nombre;
    String tipo;
    String padre;
    
    Simbolo Padre;
    boolean metodo;
    boolean parametro;
    boolean variable;
    
    boolean atributo;
    boolean clase;
    boolean global;
    
    public Instruccion elemArbol;
    
    public int posicion;
    public int posGlobal;
    
    int tam=0;
    
    public int TiposPrimitivos(String tipop)
    {
        this.tipo=tipop;
        this.tam=2;
        if(tipop.equals("int")){this.tam=2;}
        if(tipop.equals("float")){this.tam=4;}
        if(tipop.equals("char")){this.tam=1;}

        return this.tam;
    }
}
