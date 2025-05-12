package implemeAgrega;

import java.util.ArrayList;

public class Carrera {
  private String nombre;
  private ArrayList<Materia> materias = new ArrayList<>();

  public Carrera() {

  }

  public Carrera(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void agregarMateria(Materia materia) {
    materias.add(materia);

  }

  public Materia getMateria(int indi) {
    Materia materia;
    materia = materias.get(indi);
    return new Materia(materia.getCodigo());
  }

  public int getCantidad() {
    return materias.size();
  }

  @Override
  public String toString() {
    String text = "";
    text = getNombre() + "\n";
    for (Materia materia : materias) {
      text += materia + "\n";
    }
    return text;
  }
}
