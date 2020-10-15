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
public class SentenciaIf extends Instruccion{
    public Expresion Condicion;
    public LinkedList<SentenciaElseIf> elseifs;
    public SentenciaElse else1;
    
    public Expresion ExpSwitch;    
    public boolean Switch;
    
    public SentenciaIf(){
    
    }
    
    public SentenciaIf(Expresion condicion,LinkedList<Instruccion>Si,LinkedList<SentenciaElseIf> eifs,SentenciaElse els)
    {
        Condicion=condicion;
        SiguienteInstruccion=Si;
        elseifs=eifs;
        else1=els;
    }
    
    public SentenciaIf(int Nolinea,Expresion Sw, LinkedList<Instruccion>Si, LinkedList<SentenciaElseIf> eifs,SentenciaElse els,boolean sw)
    {
        if(sw=true)
        {
            this.NumeroLinea=Nolinea;
            this.ExpSwitch=Sw;
            this.SiguienteInstruccion=Si;
            this.elseifs=eifs;
            this.else1=els;
            this.Switch=true;
        }
        else
        {
            Condicion=Sw;
            SiguienteInstruccion=Si;
            elseifs=eifs;
            else1=els;
            NumeroLinea=NumeroLinea;
            this.Switch=false;
        }
    }
    
    public SentenciaIf(int Nolinea,Expresion condicion,LinkedList<Instruccion>Si,LinkedList<SentenciaElseIf> eifs,SentenciaElse els)
    {
        Condicion=condicion;
        SiguienteInstruccion=Si;
        elseifs =eifs;
        else1=els;
        NumeroLinea=Nolinea;
        //TablaDeSimbolos.InsertBreakPoint(NumeroLinea);
        //TablaDeSimbolos.DisableBreakPoint(NumeroLinea);
    }
    
}
