package com.mycompany.mantenimientoproducto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProductoTableModel extends AbstractTableModel {
  List<Producto> productos = new ArrayList<>();

  @Override
  public int getRowCount() {
    return productos.size();
  }

  @Override
  public int getColumnCount() {
    return 4;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    Producto producto = productos.get(rowIndex);
    Object valor = null;
    switch (columnIndex) {
      case 0:
        valor = producto.codigo;
        break;
      case 1:
        valor = producto.nombre;
        break;
      case 2:
        valor = producto.cantidadExistencia;
        break;
      case 3:
        valor = producto.precioUnitario;
        break;
      default:
        throw new AssertionError();
    }
    return valor;
  }

}
