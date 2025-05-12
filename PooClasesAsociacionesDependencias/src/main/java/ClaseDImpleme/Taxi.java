package ClaseDImpleme;

import java.util.ArrayList;

public class Taxi {
  private String matricula;
  ArrayList<AsignacionImpleme> asignaciones = new ArrayList<>();

  /*
   * public Taxi(){
   * 
   * }
   */
  public Taxi(String matricula) {
    this.matricula = matricula;
  }

  public void agregarAsignaciones(Chofer chofer, String fecha) {
    AsignacionImpleme asignacion = new AsignacionImpleme(chofer, fecha);
    asignaciones.add(asignacion);
  }

  public AsignacionImpleme getAsignacion(int indi) {
    AsignacionImpleme asignADevolver = asignaciones.get(indi);
    return new AsignacionImpleme(asignADevolver.getChofer(), asignADevolver.getFecha());
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    String mens = new String();
    mens = "Matricula taxi = " + getMatricula() + "\n";
    for (AsignacionImpleme asignacion : asignaciones) {
      mens += asignacion + "\n";
    }
    return mens;
  }

}
