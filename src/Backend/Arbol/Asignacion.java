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
public class Asignacion {
     public ExpresionID Variable;
    public boolean Nueva;
    public Expresion   Expresion;

    public Asignacion(ExpresionID Variable, boolean Nueva, Expresion Expresion) {
        this.Variable = Variable;
        this.Nueva = Nueva;
        this.Expresion = Expresion;
    }
    
}
