package ClaseDImpleme;

public class AsignacionImpleme {
  private Chofer chofer;
  private String fecha;

  public AsignacionImpleme(Chofer chofer, String fecha) {
    this.chofer = chofer;
    this.fecha = fecha;
  }

  public Chofer getChofer() {
    return chofer;
  }

  public void setChofer(Chofer chofer) {
    this.chofer = chofer;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  @Override
  public String toString() {
    return chofer + ", Fecha asignacion = " + fecha;
  }

}
