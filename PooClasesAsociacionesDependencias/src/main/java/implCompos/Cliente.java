package implCompos;

public class Cliente {
  private String nombre;

  public Cliente() {
  }

  public Cliente(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return getNombre();
  }

}
