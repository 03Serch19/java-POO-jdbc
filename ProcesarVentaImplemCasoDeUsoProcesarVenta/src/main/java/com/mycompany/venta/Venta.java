package com.mycompany.venta;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import tipoDatoNoPri.Fecha;
import tipoDatoNoPri.Hora;

public class Venta {
  private Fecha fecha;
  private Hora hora;
  private boolean esCompleta;
  private List<LineaDeVenta> lineasDeVenta = new ArrayList<>();
  DecimalFormat precision2 = new DecimalFormat("0.00");

  public Venta() {
  }

  public Venta(Fecha fecha, Hora hora) {
    this.fecha = fecha;
    this.hora = hora;
  }

  /*
   * public void crearLineaDeVenta(EspecificacionDelProducto
   * especificacionProducto, int cantidad){
   * agregarLineaDeVenta(especificacionProducto, cantidad);
   * }
   */
  public void agregarLineaDeVenta(EspecificacionDelProducto especificacionProducto, int cantidad) {
    lineasDeVenta.add(new LineaDeVenta(cantidad, especificacionProducto));
  }

  public boolean validarItem(String cod) {
    for (LineaDeVenta lineaDeVenta : lineasDeVenta) {
      if (lineaDeVenta/* .getEspecificacionPro().getIdArticulo */.getIdEspecificacion().equalsIgnoreCase(cod))
        return true;
    }
    return false;
  }

  public void completar() {
    setEsCompleta(true);
  }

  public double getTotal() {
    double total = 0.0;
    for (int i = 0; i < lineasDeVenta.size(); i++) {
      total += lineasDeVenta.get(i).getSubTotal();
    }
    return total;
  }

  public Fecha getFecha() {
    return fecha;
  }

  public void setFecha(Fecha fecha) {
    this.fecha = fecha;
  }

  public Hora getHora() {
    return hora;
  }

  public void setHora(Hora hora) {
    this.hora = hora;
  }

  public boolean isEsCompleta() {
    return esCompleta;
  }

  public void setEsCompleta(boolean esCompleta) {
    this.esCompleta = esCompleta;
  }

  @Override
  public String toString() {
    String text = new String();
    for (LineaDeVenta lineaDeVenta : lineasDeVenta) {
      text += "Id: " + lineaDeVenta.getIdEspecificacion() +
          " Descripcion: " + lineaDeVenta.getEspecificacionPro().getDescripcion() +
          " Cantidad: " + lineaDeVenta.getCantidad() +
          " Precio: " + lineaDeVenta.getEspecificacionPro().getPrecio() +
          " Subtotal: " + precision2.format(lineaDeVenta.getSubTotal()) + "\n";
    }
    text += "Total Factura = " + precision2.format(getTotal());
    return text;
  }

}
