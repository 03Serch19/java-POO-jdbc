package com.mycompany.venta;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
  public CatalogoDeProductos catalogo;
  public List<Venta> ventas = new ArrayList<>();// yo me guie por la multiplicidad aunque la guia al parecer le valio
                                                // porque solo crearon una referencia para tener una sola venta;

  public Tienda() {
    catalogo = new CatalogoDeProductos();
  }

  public void agregarProductos() {
    // catalogo.AgregarProducto(new EspecificacionDelProducto("Avena fortificada",
    // 25.63, "HF544DS"));
    EspecificacionDelProducto p1, p2, p3, p4;
    p1 = new EspecificacionDelProducto("Camisa talla XL ", 25.1, "01");
    p2 = new EspecificacionDelProducto("Camisa talla L ", 22., "02");
    p3 = new EspecificacionDelProducto("Camisa talla M ", 15.1, "03");
    p4 = new EspecificacionDelProducto("Camisa talla S ", 12.5, "04");
    catalogo.AgregarProducto(p1);
    catalogo.AgregarProducto(p2);
    catalogo.AgregarProducto(p3);
    catalogo.AgregarProducto(p4);
  }

  public void agregarVenta(Venta v) {
    ventas.add(v);
  }
}
