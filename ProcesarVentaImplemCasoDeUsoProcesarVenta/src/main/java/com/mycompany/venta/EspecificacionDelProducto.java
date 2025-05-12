package com.mycompany.venta;

public class EspecificacionDelProducto {
  private String descripcion;
  private double precio;
  private String articuloID;

  public EspecificacionDelProducto() {

  }

  public EspecificacionDelProducto(String descripcion, double precio, String articuloID) {
    setDescripcion(descripcion);
    setPrecio(precio);
    setArticuloID(articuloID);
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public String getArticuloID() {
    return articuloID;
  }

  public void setArticuloID(String articuloID) {
    this.articuloID = articuloID;
  }

  @Override
  public String toString() {
    return "Id: " + articuloID + ", Descripcion: " + descripcion + ", Precio: " + precio;
  }
}
