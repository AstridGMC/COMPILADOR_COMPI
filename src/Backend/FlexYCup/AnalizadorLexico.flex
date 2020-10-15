package Backend.FLexYCup;
import java_cup.runtime.* ;
import java_cup.runtime.Symbol;
import Backend.CupYFlex.sym;
import java.util.ArrayList;

/*-------------- Declaraciones ------------*/

%% 
%unicode
%public 
%class AnalizadorLexico 
%cupsym sym
%cup 
%char
%column
%line 

%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type, Object value, int fila, int columna) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

N = [0-9]+
L = [A-Za-zñÑ]
simbolos= [_@#$%&*.]
Comilla = [\"]
ComillaS=['];

%%

<YYINITIAL> {


    (("//").(\n))             {System.out.println( "comentarioSimple..." +  yytext());}

    ("true")             {System.out.println( "true..." +  yytext());
                                        return symbol(sym.TRUE , yytext(), yyline, yycolumn);}
    ("false")             {System.out.println( "false..." +  yytext());
                                        return symbol(sym.FALSE , yytext(), yyline, yycolumn);}                                    
    ("int")             {System.out.println( "intid..." +  yytext());
                                        return symbol(sym.INTID , yytext(), yyline, yycolumn);}
    ("char")            {System.out.println( "charid..." +  yytext());
                                        return symbol(sym.CHARID , yytext(), yyline, yycolumn);}
    ("float")           {System.out.println( "floatid..." +  yytext());
                                        return symbol(sym.FLOATID , yytext(), yyline, yycolumn);}
    ("%%VB")            {System.out.println( "declaracion VBID..." +  yytext());
                                        return symbol(sym.VBID , yytext(), yyline, yycolumn);}
    ("%%JAVA")          {System.out.println( "declaracion JAVAID..." +  yytext());
                                        return symbol(sym.JAVAID , yytext(), yyline, yycolumn);} 
    ("%%PY")            {System.out.println( "declaracion PYID..." +  yytext());
                                        return symbol(sym.PYID , yytext(), yyline, yycolumn);}
    ("%%PROGRAMA")      {System.out.println( "declaracion PROGRAMAID..." +  yytext());
                                        return symbol(sym.PROGRAMAID , yytext(), yyline, yycolumn);}

    ("for")      {System.out.println( "declaracion FORID..." +  yytext());
                                        return symbol(sym.FORID , yytext(), yyline, yycolumn);}
    ("while")      {System.out.println( "declaracion WHILEID..." +  yytext());
                                        return symbol(sym.WHILEID , yytext(), yyline, yycolumn);}
    ("print")      {System.out.println( "declaracion PRINTID..." +  yytext());
                                        return symbol(sym.PRINTID , yytext(), yyline, yycolumn);} 
    ("do")      {System.out.println( "declaracion DOID..." +  yytext());
                                        return symbol(sym.DOID , yytext(), yyline, yycolumn);}  
    ("else")      {System.out.println( "declaracion ELSEID..." +  yytext());
                                        return symbol(sym.ELSEID , yytext(), yyline, yycolumn);}                               
// LENGUAJE VISUAL BASIC

    ("Console.ReadLine()")      {System.out.println( "declaracion CONSOLEREADID..." +  yytext());
                                        return symbol(sym.CONSOLEREADID , yytext(), yyline, yycolumn);}
    ("Console.WriteLine")      {System.out.println( "declaracion WRITELNID..." +  yytext());
                                        return symbol(sym.WRITELNID , yytext(), yyline, yycolumn);}                                       
    ("Sub")      {System.out.println( "declaracion SUBID..." +  yytext());
                                        return symbol(sym.SUBID , yytext(), yyline, yycolumn);}
    ("Dim")      {System.out.println( "declaracion DIMID..." +  yytext());
                                        return symbol(sym.DIMID , yytext(), yyline, yycolumn);}
    ("Console.Write")      {System.out.println( "declaracion CONSOLEWRITEID..." +  yytext());
                                        return symbol(sym.CONSOLEWRITEID , yytext(), yyline, yycolumn);}
    ("To")      {System.out.println( "declaracion TOID..." +  yytext());
                                        return symbol(sym.TOID , yytext(), yyline, yycolumn);}
    ("For")      {System.out.println( "declaracion FORIDVB..." +  yytext());
                                        return symbol(sym.FORIDVB , yytext(), yyline, yycolumn);}
    ("Do")      {System.out.println( "declaracion DOIDVB..." +  yytext());
                                        return symbol(sym.DOIDVB , yytext(), yyline, yycolumn);}
    ("While")      {System.out.println( "declaracion WHILEIDVB..." +  yytext());
                                        return symbol(sym.WHILEIDVB , yytext(), yyline, yycolumn);}   
    ("Loop")      {System.out.println( "declaracion LOOPID..." +  yytext());
                                        return symbol(sym.LOOPID , yytext(), yyline, yycolumn);}
    ("Then")      {System.out.println( "declaracion THENID..." +  yytext());
                                        return symbol(sym.THENID , yytext(), yyline, yycolumn);}
    ("End")      {System.out.println( "declaracion ENDID..." +  yytext());
                                        return symbol(sym.ENDID , yytext(), yyline, yycolumn);}
    ("If")      {System.out.println( "declaracion IFIDVB..." +  yytext());
                                        return symbol(sym.IFIDVB , yytext(), yyline, yycolumn);} 
    ("Select")      {System.out.println( "declaracion SELECTID..." +  yytext());
                                        return symbol(sym.SELECTID , yytext(), yyline, yycolumn);} 
    ("Case")      {System.out.println( "declaracion CASEVBID..." +  yytext());
                                        return symbol(sym.CASEVBID , yytext(), yyline, yycolumn);}
     ("As")      {System.out.println( "declaracion ASID..." +  yytext());
                                        return symbol(sym.ASID , yytext(), yyline, yycolumn);}  
     ("Next")      {System.out.println( "declaracion NEXTID..." +  yytext());
                                        return symbol(sym.NEXTID , yytext(), yyline, yycolumn);}
     ("Else")      {System.out.println( "declaracion ELSEID..." +  yytext());
                                        return symbol(sym.ELSEID , yytext(), yyline, yycolumn);}                                     
                                      
//LENGUAJE PYTHON
    ("input")      {System.out.println( "declaracion INPUTID..." +  yytext());
                                        return symbol(sym.INPUTID , yytext(), yyline, yycolumn);}   
    ("print")      {System.out.println( "declaracion PRINTID..." +  yytext());
                                        return symbol(sym.PRINTID , yytext(), yyline, yycolumn);}
    ("def")      {System.out.println( "declaracion DEFID..." +  yytext());
                                        return symbol(sym.DEFID , yytext(), yyline, yycolumn);}  
    ("in range")      {System.out.println( "declaracion INRANGEID..." +  yytext());
                                        return symbol(sym.INRANGEID , yytext(), yyline, yycolumn);}  
    //("elif")      {System.out.println( "declaracion ELIFID..." +  yytext());
                                        //return symbol(sym.ELIFID , yytext(), yyline, yycolumn);}                                      
    ("continue")      {System.out.println( "declaracion CONTINUEID..." +  yytext());
                                        return symbol(sym.CONTINUEID , yytext(), yyline, yycolumn);}

                                        
    //LENGUAJE JAVA      

    ("public")      {System.out.println( "declaracion PUBLICID..." +  yytext());
                                        return symbol(sym.PUBLICID , yytext(), yyline, yycolumn);}
    ("class")      {System.out.println( "declaracion CLASSID..." +  yytext());
                                        return symbol(sym.CLASSID , yytext(), yyline, yycolumn);}                                    
    ("import")      {System.out.println( "declaracion IMPORTID..." +  yytext());
                                        return symbol(sym.IMPORTID , yytext(), yyline, yycolumn);}
    ("System.out.println")      {System.out.println( "declaracion SOUTID..." +  yytext());
                                        return symbol(sym.SOUTID , yytext(), yyline, yycolumn);}
    ("void")        {System.out.println( "declaracion VOIDID..." +  yytext());
                                        return symbol(sym.VOIDID , yytext(), yyline, yycolumn);}
    ("Scanner")     {System.out.println( "declaracion SCANNERID..." +  yytext());
                                        return symbol(sym.SCANNERID , yytext(), yyline, yycolumn);}
    ("new")         {System.out.println( "declaracion NEWID..." +  yytext());
                                        return symbol(sym.NEWID , yytext(), yyline, yycolumn);}
    ("nextLine()")  {System.out.println( "declaracion NEXTLINEID..." +  yytext());
                                        return symbol(sym.NEXTLINEID , yytext(), yyline, yycolumn);}
    ("switch")  {System.out.println( "declaracion SWITCHID..." +  yytext());
                                        return symbol(sym.SWITCHID , yytext(), yyline, yycolumn);}
    ("case")  {System.out.println( "declaracion CASEID..." +  yytext());
                                        return symbol(sym.CASEID , yytext(), yyline, yycolumn);}                                    
    ("break")  {System.out.println( "declaracion BREAKID..." +  yytext());
                                        return symbol(sym.BREAKID , yytext(), yyline, yycolumn);}  
    ("default")  {System.out.println( "declaracion DEFAULTID..." +  yytext());
                                        return symbol(sym.DEFAULTID , yytext(), yyline, yycolumn);}  
                                     
    //LENGUAJE C
    ("#include")      {System.out.println( "declaracion INCLUDEID..." +  yytext());
                                        return symbol(sym.INCLUDEID , yytext(), yyline, yycolumn);}                                    
    ("printf")            {System.out.println( "printfid..." +  yytext());
                                        return symbol(sym.PRINFID , yytext(), yyline, yycolumn);}
    ("scanf")       {System.out.println( "SCANFID..." +  yytext());
                                        return symbol(sym.SCANFID , yytext(), yyline, yycolumn);}
    ("main")                    {System.out.println( "MAINID..." +  yytext());
                                        return symbol(sym.MAINID , yytext(), yyline, yycolumn);}
    ("%d")                    {System.out.println( "MAINID..." +  yytext());
                                        return symbol(sym.INDICADORINT , yytext(), yyline, yycolumn);}
    ("%c")                    {System.out.println( "MAINID..." +  yytext());
                                        return symbol(sym.INDICADORCHAR , yytext(), yyline, yycolumn);}
    ("%f")                    {System.out.println( "MAINID..." +  yytext());
                                        return symbol(sym.INDICADORFLOAT , yytext(), yyline, yycolumn);}                                   
    //----------------------------                                            
    ({L}({N}|{L}|{simbolos})+)      {System.out.println( "ID..." +  yytext());return symbol(sym.ID, yytext(), yyline, yycolumn);}
    ({ComillaS}{L}{ComillaS})       {System.out.println( "CHAR..." +  yytext());return symbol(sym.CHAR, yytext(), yyline, yycolumn);}
    {Comilla}.{Comilla}             {System.out.println( "STRING..." +  yytext());return symbol(sym.STRING, yytext(), yyline, yycolumn);}
    "+"                             {System.out.println( "SIM MAS...."+ yytext() ); return symbol(sym.SIMMAS, yytext(), yyline, yycolumn);}
    "-"                             {System.out.println( "SIM MENOS...."+ yytext() ); return symbol(sym.SIMMENOS, yytext(), yyline, yycolumn);}
    "*"                             {System.out.println( "SIM MULTIPLICACION...."+ yytext() ); return symbol(sym.MULTI, yytext(), yyline, yycolumn);}
    "/"                             {System.out.println( "SIM DIVISION...."+ yytext() ); return symbol(sym.DIV, yytext(), yyline, yycolumn);}
    "="                             {System.out.println( "SIM IGUAL...."+ yytext() ); return symbol(sym.SIMIGUAL, yytext(), yyline, yycolumn);} 
    "{"                             {System.out.println( "llaveAbre..." +  yytext()); return symbol(sym.LLAVEABRE , yytext(), yyline, yycolumn);}                        
    ";"                             {System.out.println( "punto y coma..." +  yytext());return symbol(sym.PUNTOYCOMA , yytext(), yyline, yycolumn);} 
    "}"                             {System.out.println( "llaveCierra..." +  yytext()); return symbol(sym.LLAVECIERRA , yytext(), yyline, yycolumn);}                          
    "]"                             {System.out.println( "corAbre... " +  yytext());return symbol(sym.CORCHETECIERRA, yytext(), yyline, yycolumn);}
    "["                             {System.out.println( "corCierra...."+ yytext() ); return symbol(sym.CORCHETEABRE, yytext(), yyline, yycolumn);}
    "("                             {System.out.println( "parAbre...."+ yytext() ); return symbol(sym.PARABRE, yytext(), yyline, yycolumn);}
    ")"                             {System.out.println( "parCierra...."+ yytext() ); return symbol(sym.PARCIERRA, yytext(), yyline, yycolumn);}
    ":"                             {System.out.println( "dospuntos...."+ yytext() ); return symbol(sym.DOSPUNTOS, yytext(), yyline, yycolumn);}
    ","                             {System.out.println( "coma...."+ yytext() ); return symbol(sym.COMA, yytext(), yyline, yycolumn);}

    "<="                            {System.out.println( "MENORIGUAL...."+ yytext()); return symbol(sym.MENORIGUAL, yytext(), yyline, yycolumn);}
    ">="                            {System.out.println( "MAYORIGUAL...."+ yytext()); return symbol(sym.MAYORIGUAL, yytext(), yyline, yycolumn);}
    "<"                             {System.out.println( "MENOR...."+ yytext() ); return symbol(sym.MENOR, yytext(), yyline, yycolumn);}
    ">"                             {System.out.println( "MAYOR...."+ yytext() ); return symbol(sym.MAYOR, yytext(), yyline, yycolumn);}
    "!"                             {System.out.println( "NOT...."+ yytext() ); return symbol(sym.NOT, yytext(), yyline, yycolumn);}
    "=="                            {System.out.println( "IGUAL...."+ yytext() ); return symbol(sym.IGUAL, yytext(), yyline, yycolumn);}
    "&&"                            {System.out.println( "AND...."+ yytext() ); return symbol(sym.AND, yytext(), yyline, yycolumn);}
    "||"                            {System.out.println( "OR...."+ yytext() ); return symbol(sym.OR, yytext(), yyline, yycolumn);}
    "&"                            {System.out.println( "SIMY...."+ yytext()); return symbol(sym.SIMY, yytext(), yyline, yycolumn);}


    {N}                             {System.out.println( "numero...."+ yytext() ); return symbol(sym.NUMERO, yytext(), yyline, yycolumn);}
    {Comilla}                       {System.out.println( "comilla...."+ yytext() ); return symbol(sym.COMILLA, yytext(), yyline, yycolumn);}
    (\n|\t|\r|\r\n|" ")+              {/*IGNORAR*/}
    .                               {System.out.println( "Caracter no reconocido: "+ yytext());}
}