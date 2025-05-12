package com.mycompany.prnimpleherenpoli;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class PrnImpleHerenPoli {

    public static void main(String[] args) {
       //crear Figuras
       Punto punto = new Punto ( 7, 11 );
       Circulo circulo = new Circulo (22, 8,3.5);
       Cilindro cilindro = new Cilindro (10,3.3,10,10);
       
       //crearAreglos de figuras
      // Figura[] aregloFiguras=new Figura[3];
       //crear areglos de interface figura
       InteFigura[] aregloFiguras=new InteFigura[3];
       aregloFiguras[0]=punto;
       aregloFiguras[1]=circulo;
       aregloFiguras[2]=cilindro;                         
       String salida= punto.getNombre()+": "+punto.toString()+"\n"+//a partir de aca les agregare punto.toString(), aunque sin agregar el toString siempre funciona
               circulo.getNombre()+": "+circulo.toString()+"\n"+//pero por buena practica y ser profesional en el codigop se debria hacer, y funciona es porque todo lo que se concatene con + java implicitamente llma el toString al obketop quse concatena
               cilindro.getNombre()+": "+cilindro.toString()+"\n";//Y EN OTROS CONTEXTOS ESTO PUIEDA DAR ERRORES ya sea llamabndolo en un metodo que no sobreescribe toStrring tal y como lo sout con +, si lo hacen, mejor agregarlo el toString explicimta,mente yu asi dejamos un codigo mas profesional
       DecimalFormat precision2=new DecimalFormat("0.00");
        //ciclo sobre el arregloDeFiguras y recupera el nombre
        // area y volumen de cada Figura en el arregloDeFiguras
        for (int i = 0; i < aregloFiguras.length; i++) {        //aca igual, ser profesional y acostumbrarnos a dejar  claridad y BUENAS PRACTICAS EN PROGRAMACIO0N PROFESIONAL
            salida+="\n\n"+aregloFiguras[i].getNombre()+": "+aregloFiguras[i].toString()+
                    "\nArea = "+precision2.format(aregloFiguras[i].calcularArea())+
                    "\nVolumen = "+precision2.format(aregloFiguras[i].calcularVolumen());
        }
       JOptionPane.showMessageDialog(null, salida,"Demostracion de Polimorfismo",JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
    }
    
    
    
    public static void no(/*String[] args*/) {
       Punto punto1, punto2;
       Circulo circulo1 ,circulo2;
       punto1=new Punto(30, 50);
       circulo1=new Circulo(120, 89, 2.7);
       String salida="Punto punto1: "+punto1/*.toString()*/+"\nCirculo circulo1: "+circulo1/*toString()*/;
        System.out.println(salida);
        System.out.println("*********************");
        punto2=circulo1;
        salida+="\n\nCirculo circulo1(ubicado en referencia de punto2):"+punto2;
        System.out.println(salida);
        System.out.println("*********************");
        //downcasting, casting una referencia de superclase un tipo de la subclase
        circulo2=(Circulo)punto2;
        salida+="\n\nCirculo circulo1(ubicado en la referencia de circulo2): "+circulo2;
        System.out.println(salida);
        System.out.println("*********************");
        DecimalFormat precision2=new DecimalFormat("0.00");
        salida+="\nArea del circulo1(ubicado en la referencia de circulo2): "+precision2.format(circulo2.calcularArea());
        System.out.println(salida);
        //Intento de referir a un objeto Punto con referencia de Circulo
        //if(punto2 instanceof Circulo){//esto daria true porque punto2 esta haciendo referencia a circulo1
        if(punto1 instanceof Circulo){
            circulo2=(Circulo)punto1;
            salida+="\n\nCasting realizado exitosamente";
             System.out.println(salida);
        }else{
            salida+="\n\npunto1 no hace referncia a un Circulo";
            System.out.println(salida);
            JOptionPane.showMessageDialog(null, salida,"Demostracion de la relacion es \"es un\" ",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
