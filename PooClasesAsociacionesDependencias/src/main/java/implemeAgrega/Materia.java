package implemeAgrega;

public class Materia {
  private String codigo;

  public Materia() {

  }

  public Materia(String codigo) {
    this.codigo = codigo;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  @Override
  public String toString() {
    return "Codigo materia = " + codigo;
  }

}
