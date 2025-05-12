package implCompos;


public class Prueba {
    public static void main(String[] args) {
        Cuenta cuenta1= new Cuenta("Sergio",500.50);
        cuenta1.abonar(8000.75);
        cuenta1.retirar(600);
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1);
        cuenta1.agregarPropietario("Dashi");
        cuenta1.agregarPropietario("Golden");
        System.out.println(cuenta1);
        cuenta1.retirar(9852);
        System.out.println(cuenta1);
        cuenta1.abonar(8426.56);
        System.out.println(cuenta1);
        System.out.println(cuenta1.getSaldo());
        try {
        cuenta1.abonar(-2);
            
        } catch (Exception e) {
            System.out.println("Error siguiente "+e);
        }
        System.out.println(cuenta1);
        
                 
        int posi=cuenta1.buscarPropietario("Sergio");
        System.out.println(posi);
       // posi=cuenta1.buscarPropietario("Golden");
        //System.out.println(posi);
        System.out.println(cuenta1.getPropietario(posi));
        
       // cuenta1.eliminarPropietario(cuenta1.getPropietario(posi));//si funciona
        try {
       cuenta1.eliminarPropietario(cuenta1.getPropietario(posi+9));
            
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            cuenta1.eliminarPropietario(new Cliente("psofsp"));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        posi=cuenta1.buscarPropietario("Dashi");
         System.out.println(posi);
        System.out.println(cuenta1.getPropietario(posi));
        cuenta1.setCliente(3, "GoldenNoValido");
        cuenta1.setCliente(posi, "Golden");
        
        System.out.println(posi);
        System.out.println(cuenta1.getPropietario(posi));
        System.out.println(cuenta1);
    }
}
