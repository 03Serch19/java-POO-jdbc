package ClaseDImpleme;

public class Prueba {
    public static void main(String args[ ]){
        //usea otra logica, una guia sugeria que en el cosntructor de taxi se mandara la fecha chofer y matrricula de un osolo y alla lo que yo hice en el metoto agregar lo hubiera hecho en este constructor pero pues preferei asi
      Chofer chofer1=new Chofer("Juan");
      Chofer chofer2=new Chofer("Mario");
      Chofer chofer3=new Chofer("Pedro");
      Chofer chofer4=new Chofer("Boris");
      Taxi taxi=new Taxi("P100100");
      System.out.println(taxi);
      taxi.agregarAsignaciones(chofer4, "22/04/2025");
      taxi.agregarAsignaciones(chofer3, "23/04/2025");
      taxi.agregarAsignaciones(chofer2, "24/04/2025");
      taxi.agregarAsignaciones(chofer1, "25/04/2025");
       System.out.println(taxi);
       
        System.out.println(taxi.getAsignacion(2));
    }
 }
