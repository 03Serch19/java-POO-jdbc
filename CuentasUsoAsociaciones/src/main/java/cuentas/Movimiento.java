package cuentas;

public class Movimiento {
  private String tipo;
  private double Monto;

  public Movimiento() {
  }

  public Movimiento(String tipo, double Monto) {
    setTipo(tipo);
    setMonto(Monto);
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getMonto() {
    return Monto;
  }

  public void setMonto(double Monto) {
    this.Monto = Monto;
  }

  @Override
  public String toString() {
    return "Tipo de movimiento: " + getTipo() + ", Monto: " + getMonto();
  }
}
