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
public class ExpresionTipo extends Expresion{
    
    
    public ExpresionTipo(String valor,String tipo)
    {
        Valor=valor;
        tipos.Add(tipo);
        if(tipo.equals("int")){tipos.Add("float");}
    }
    
    
    public boolean IsPrimitivos(String tipop) {
        boolean res = false;
        if (tipop.equals("int")) {
            res = true;
        }
        if (tipop.equals("float")) {
            res = true;
        }
        if (tipop.equals("char")) {
            res = true;
        }
        return res;
    }
}
