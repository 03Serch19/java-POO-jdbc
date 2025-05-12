package implemeAgrega;

public class Prueba {
    public static void main(String[] args) {
        Materia materia1= new Materia("PRN315");
        Materia materia2= new Materia("PRN215");
        Carrera carrera1 = new Carrera("Ingenieria de Sistemas");
        Carrera carrera2 = new Carrera("Ingenieria industrial");
        carrera1.agregarMateria(materia1);
        carrera1.agregarMateria(materia2);
        carrera2.agregarMateria(materia2);
        System.out.println(carrera1);
        System.out.println(carrera2);
        materia2.setCodigo("PRN215Nuevo");
        System.out.println(carrera1);
        System.out.println(carrera2);

    }
    
}
