package com.mycompany.prnimpleherenpoli;

public class Cilindro extends Circulo {
  protected double altura;

  public Cilindro() {
    setAltura(0);
  }

  public Cilindro(double altura, double radio, int coordenadaX, int coordenadaY) {
    super(coordenadaX, coordenadaY, radio);
    setAltura(altura);
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = (altura >= 0) ? altura : 0.0;
  }

  @Override
  public double calcularArea() {
    return 2 * super.calcularArea() + 2 * Math.PI * radio * altura;
  }

  @Override
  public double calcularVolumen() {
    return super.calcularArea() * altura;
  }

  @Override
  public String toString() {
    return super.toString() + "; altura = " + altura;
  }

  @Override
  public String getNombre() {
    return "Cilindro ";
  }
}
