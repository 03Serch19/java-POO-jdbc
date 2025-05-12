package tipoDatoNoPri;

public class Hora {
  private int hora;
  private int minuto;
  private int segundo;

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  public Hora() {
  }

  public Hora(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  @Override
  public String toString() {
    return hora + ":" + minuto + ":" + segundo;
  }
}
