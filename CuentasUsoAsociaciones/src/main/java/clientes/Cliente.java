package clientes;

public class Cliente {
  private String nombre;

  public Cliente(String nombre) {
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
    return "Cliente: " + getNombre();
  }
}
