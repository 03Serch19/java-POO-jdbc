package registrohuespedes;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        final String[] UNIDADES={"A","B","C","D","E"};
        Random random = new Random(new Long(13));
        ConsultaHabitaciones consultas = new ConsultaHabitaciones();
        for (int i = 0; i< 5; i++) {
        Habitacion habitacion = new Habitacion();
        habitacion.setNivel(i + 1);
        habitacion.setNumero(UNIDADES[i] + (i+2));
        habitacion.setTipo(1);
        habitacion.setPrecio(random.nextDouble() * 105);
        consultas.modeloHabitaciones.habitaciones.add(habitacion);
        }
        consultas.setVisible(true);
    }
    
}
