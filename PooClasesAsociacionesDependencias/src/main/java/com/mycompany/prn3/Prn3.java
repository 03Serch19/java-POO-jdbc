
package com.mycompany.prn3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Prn3 {

    public static void main(String[] args) {//Intersante pronto replicar como ejercicio el metodo hasNext y next que implementa ArrayList..
         int temp;
        int altura=0;
        List<Integer> lista=new ArrayList<>();
        
        for (int i =0; i < 10; i++) {
            lista.add(i);//el compilador convierte el int en Integer
        }
        
       // Iterator<Integer> it=lista.iterator();//con esto<> no hace falta agregar el cast (int) a int next= (int) it.next();
        Iterator  it=lista.iterator();
        //arriba su hay advertencia es por lo del generico que habria que establecerlo pero por ahra no incumbe a este fin
        while (it.hasNext()) {
            temp = (int) it.next();
            System.out.println(temp);
            altura+=temp;
        }
        System.out.println(altura);
        
        //java sugiere usar , cuando tenia la creacion de la variable next(luego la renombre a temp y decidi declararla fuera) dentro del whilke, y en cada ciclo se incializabd enuevo
         /*   for (int next : lista) { //es valido, depende de lo que nosotros queramos hacer con el programa y el fin de este
            System.out.println(next);
        }*/
    }
}
