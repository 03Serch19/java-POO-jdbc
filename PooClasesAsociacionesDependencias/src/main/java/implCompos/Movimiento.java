package implCompos;

public class Movimiento {
  private String tipo;
  private double monto;

  public Movimiento() {
  }

  public Movimiento(String tipo, double monto) {
    this.tipo = tipo;
    setMonto(monto);
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getMonto() {
    return monto;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  @Override
  public String toString() {
    return "Movimiento tipo=" + tipo + ", monto=" + getMonto();
  }

}
