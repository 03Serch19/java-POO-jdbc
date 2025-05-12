package registrohuespedes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class HabitacionTableModel extends AbstractTableModel{
    List<Habitacion> habitaciones = new ArrayList<>();
    private String tiposHabitacion[] = {"Sencilla", "Doble", "Triple"};
    
    @Override
    public int getRowCount() {
      return habitaciones.size();
    }

    @Override
    public int getColumnCount() {
        return 4;//cpor ahora manual se coloca los campos qeus eran coklumna de la clase, por ahora no se si hay forma de saberlo tipo comola longitud de un arrya, pero seria, como la longitud de camopos de una clase, no se si se podra eso
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object valor=null;
        switch (columnIndex) {
            case 0:
                valor=habitaciones.get(rowIndex).getNumero();
                break;
            case 1:
                valor=habitaciones.get(rowIndex).getNivel();
                break;
            case 2:
                int iTipo=habitaciones.get(rowIndex).getTipo();
                valor=tiposHabitacion[iTipo-1];
               break;
            case 3:
                valor=habitaciones.get(rowIndex).getPrecio();
                break;
            default:
                throw new AssertionError();
        }
        
        return valor;
    }
    /*//esto sugeria netbeans pero por ahora lo hare a lo clasico
        @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object valor=null;
        switch (columnIndex) {
            case 0 -> valor=habitaciones.get(rowIndex).getNumero();
            case 1 -> valor=habitaciones.get(rowIndex).getNivel();
            case 2 -> {
                int iTipo=habitaciones.get(rowIndex).getTipo();
                valor=tiposHabitacion[iTipo-1];
            }
            case 3 -> valor=habitaciones.get(rowIndex).getPrecio();
            default -> throw new AssertionError();
        }
        
        return valor;
    }*/
    
}
