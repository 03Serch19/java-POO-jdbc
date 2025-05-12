package com.mycompany.venta;

public class LineaDeVenta {
  private int cantidad;
  private EspecificacionDelProducto especificacionPro;

  public LineaDeVenta() {
  }

  public LineaDeVenta(int cantidad, EspecificacionDelProducto especificacionPro) {
    setCantidad(cantidad);
    setEspecificacionPro(especificacionPro);
  }

  public double getSubTotal() {
    return getCantidad() * especificacionPro.getPrecio();
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public String getIdEspecificacion() {// puede ser util, aunque desde el llamado podria ser directamente
                                       // getEspecificacionPro().getArticuloID()(que esta en la clase
                                       // especificaciondelproducto
    return especificacionPro.getArticuloID();
  }

  public EspecificacionDelProducto getEspecificacionPro() {
    return especificacionPro;
  }

  public void setEspecificacionPro(EspecificacionDelProducto especificacionPro) {
    this.especificacionPro = especificacionPro;
  }

  /*
   * @Override
   * public String toString(){
   * return cantidad+"Subtotal: "+getSubTotal();
   * }
   */
}
