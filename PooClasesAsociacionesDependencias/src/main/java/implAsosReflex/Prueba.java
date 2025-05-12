package implAsosReflex;

public class Prueba {
  public static void main(String[] args) {
    Chofer chofer = new Chofer();
    chofer.setNombre("Golden");
    System.out.println(chofer);

    Chofer choferPrincipal = new Chofer("Serr", chofer);
    System.out.println(choferPrincipal);
  }
}
