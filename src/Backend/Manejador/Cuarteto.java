/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Manejador;

/**
 *
 * @author astridmc
 */
public class Cuarteto {

    String operador;
    String resultado;
    String arg1;
    String arg2;

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public Cuarteto(String operador, String resultado, String arg1, String arg2) {
        this.operador = operador;
        this.resultado = resultado;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    
    
}
