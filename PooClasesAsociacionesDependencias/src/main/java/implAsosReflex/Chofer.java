package implAsosReflex;

public class Chofer {
  private String nombre;
  private Chofer suplente;

  public Chofer() {
  }

  public Chofer(String nombre, Chofer suplente) {
    this.nombre = nombre;
    this.suplente = suplente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Chofer getSuplente() {
    return suplente;
  }

  public void setSuplente(Chofer suplente) {
    this.suplente = suplente;
  }

  @Override
  public String toString() {
    if (suplente == null)
      return "Nombre del Chofer: " + nombre;
    return "Nombre del Chofer: " + nombre + " ; Nombre del suplente: " + suplente.getNombre();
  }
}
