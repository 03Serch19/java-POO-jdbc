package priImpleClasss;


public class Prueba {
    public static void main(String[] args) {
       /* Chofer chofer1 =new Chofer("Golden");
        Taxi taxi1= new Taxi("NP541564", chofer1);
        System.out.println(chofer1.toString());
        System.out.println(chofer1);
        System.out.println(taxi1.toString());
        System.out.println(taxi1);
       String taxychofer=taxi1.toString();
        System.out.println(taxychofer);
        System.out.println(taxi1.getChofer());
        chofer1.setNombre("dashi");
        System.out.println("************");
       System.out.println(chofer1.toString());
        System.out.println(chofer1);
        System.out.println(taxi1.toString());
        System.out.println(taxi1);
        String taxychofer2=taxi1.toString();
        System.out.println(taxychofer2);
        System.out.println(taxi1.getChofer());*/
        Chofer chofer1=new Chofer("Juan");
        Chofer chofer2=new Chofer("Pedro");
        Chofer chofer3=new Chofer("Jose");
        Chofer chofer4=new Chofer("Mario");
        Chofer chofer5=new Chofer("Serr");
        //Taxi taxi =new Taxi("P100100");//con multiplicidad 1..* ya no me hes valido esto,debo si o si al menos agregar un chofer
        Taxi taxi =new Taxi("P100100",chofer5);
        taxi.agregarChofer(chofer1);
        taxi.agregarChofer(chofer2);
        taxi.agregarChofer(chofer3);
        
         int pos=taxi.buscarChofer(chofer1);
         System.out.println("\n"+chofer1+" se encuentra en la posicion "+pos);
         pos=taxi.buscarChofer(chofer2);
         System.out.println("\n"+chofer2+" se encuentra en la posicion "+pos);
         pos=taxi.buscarChofer(chofer3);
         System.out.println("\n"+chofer3+" se encuentra en la posicion "+pos);
         pos=taxi.buscarChofer(chofer4);
         System.out.println("\n"+chofer4+" se encuentra en la posicion "+pos);
        System.out.println(taxi+ "\ntiene "+taxi.getCantidadChoferes()+ " choferes");
        
        pos=taxi.buscarChofer(chofer4);
        System.out.println("\n"+chofer4+" se encuentra en la posicion "+pos);
        pos=taxi.buscarChofer(chofer2);
        System.out.println("\n"+chofer2+" se encuentra en la posicion "+pos);
        //pos=taxi.buscarChofer(chofer1);
        //System.out.println("\n"+chofer1+" se encuentra en la posicion "+pos);
        taxi.setChofer(pos, chofer4);
        System.out.println("\n"+chofer2+" fue cambiado por "+chofer4);
        System.out.println(taxi);
        System.out.println(taxi.getChofer(1));
         System.out.println(taxi.getChofer(0));
        taxi.eliminarChofer(chofer1);
        System.out.println("\n"+chofer1+" fue eliminado!!!");
        System.out.println(taxi);
        //taxi.setChofer(pos, chofer4);
         System.out.println(taxi.getChofer(0));
        //  taxi.setChofer(-8, chofer4);
         pos=taxi.buscarChofer(chofer1);
         System.out.println("\n"+chofer1+" se encuentra en la posicion "+pos);
         pos=taxi.buscarChofer(chofer2);
         System.out.println("\n"+chofer2+" se encuentra en la posicion "+pos);
         pos=taxi.buscarChofer(chofer3);
         System.out.println("\n"+chofer3+" se encuentra en la posicion "+pos);
         pos=taxi.buscarChofer(chofer4);
         System.out.println("\n"+chofer4+" se encuentra en la posicion "+pos);
         
         Chofer ch = taxi.getChofer(2);
         
         System.out.println(ch);
         ch.setNombre("nuevo nombre");
         System.out.println(ch);
         System.out.println(chofer3);//si devuelvo un objeto en la progra,macion de getChofer, no se modificara
                                   //pero si lo que devuelvo es la misma referencia en esa posicion
    }                           //entonces estare modificando al objeto en esa referencai que seguira siendo el mismo chofer3
    //////////////////////////para este caso quyeremos mejor devolver un nuevo objeto asi si queremos modificarlo parea otra cosa no afectamos al
    ///                           //al de la lista (el original)
    
}
