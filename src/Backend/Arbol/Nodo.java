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
public class Nodo {
    String tipo;
    String nombre;
    Object valor;
    String operador;
    
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(String tipo, String nombre, Object valor, String operador) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.valor = valor;
        this.operador = operador;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
    public boolean agregarNodo(Nodo nodo) {
        if (izquierdo != null) {
            derecho = nodo;
            return true;
        } else if (derecho != null) {
            izquierdo = nodo;
            return true;
        } else {
            return false;
        }
    }
    
        
   
    
}
