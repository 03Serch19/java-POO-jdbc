package com.mycompany.prnimpleherenpoli;

public class Circulo extends Punto {
  protected double radio;

  public Circulo() {
    setRadio(0);
  }

  public Circulo(int x, int y, double radio) {
    super(x, y);
    setRadio(radio);
  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = (radio >= 0.0 ? radio : 0.0);
  }

  @Override
  public double calcularArea() {
    return Math.PI * radio * radio;
  }

  @Override
  public String toString() {
    return "Centro = " + super.toString() + "; Radio = " + getRadio();
  }

  @Override
  public String getNombre() {
    return "Circulo";
  }
}
