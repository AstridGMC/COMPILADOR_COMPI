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
public class ExpresionBooleana extends Expresion{
    public Expresion izquierda;
    public Expresion derecha;
    public String operador;

    public ExpresionBooleana(Expresion izquierda, Expresion derecha, String operador) {
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.operador = operador;
    }
    
    
    
}
