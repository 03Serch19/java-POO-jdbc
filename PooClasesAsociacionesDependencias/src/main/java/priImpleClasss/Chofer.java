package priImpleClasss;

public class Chofer {
  private String nombre;

  public Chofer() {

  }

  public Chofer(String nombre) {
    setNombre(nombre);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Nombre chofer = " + getNombre()/* nombre */;
  }

}
