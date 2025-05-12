package com.mycompany.pruebaCuenta;

import cuentas.Cuenta;

public class PruebaCuenta {

    public static void main(String[] args) {
      try{
       // Cuenta cuenta1=new Cuenta(-856.36, "Sergio");
        Cuenta cuenta1=new Cuenta(856.36, "Sergio");
       System.out.println(cuenta1);
       // cuenta1.abonar(0);
        cuenta1.abonar(563.36);
      //  cuenta1.abonar(-563.36);
        System.out.println(cuenta1);
        
        cuenta1.retirar(163.36);
       // cuenta1.retirar(-985);
     //  cuenta1.retirar(1985);
      //cuenta1.retirar(0);
        System.out.println(cuenta1);
        
        cuenta1.agregarCliente("Golden");
        System.out.println(cuenta1);
        cuenta1.agregarCliente("Dhashi");
        System.out.println(cuenta1);
        /////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************");
        int posi = cuenta1.buscaPosiCliente("Sergio");
         //posi = cuenta1.buscaPosiCliente("Sssergio");
        System.out.println(posi);
        
        clientes.Cliente cliente =  cuenta1.getCliente(/*9*/posi);
         System.out.println(cliente);
         cuenta1.eliminarCliente(/*null*/cliente);
          System.out.println(cuenta1);
          cuenta1.setCliente(/*5*/posi,"Dhashi");
          System.out.println(cuenta1);
          
      }catch(IllegalArgumentException e){
          System.out.println(e);
      }
        
    }
}
