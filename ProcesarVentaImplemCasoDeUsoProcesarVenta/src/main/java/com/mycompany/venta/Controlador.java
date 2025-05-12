package com.mycompany.venta;

import javax.swing.JOptionPane;
import tipoDatoNoPri.Fecha;
import tipoDatoNoPri.Hora;

public class Controlador {
  public Tienda tienda;
  public Venta venta;

  Fecha fecha;
  Hora hora;

  public void crearNuevaVenta() {
    tienda = new Tienda();
    fecha = new Fecha(5, 2, 2025);
    hora = new Hora(8, 45, 23);

    venta = new Venta(fecha, hora);
    tienda.agregarVenta(venta);
    tienda.agregarProductos();

  }

  public void introducirArticulo(String id, int cant) {
    // EspecificacionDelProducto art;
    if (tienda.catalogo.validarProductoCatalogo(id)) {
      // art=tienda.catalogo.getProducto(id);
      // venta.agregarLineaDeVenta(art, cant);
      venta.agregarLineaDeVenta(tienda.catalogo.getProducto(id), cant);
    }
  }

  public void finalizarVenta() {
    JOptionPane.showMessageDialog(null, venta.toString());
    venta.completar();
  }
}
