package cosg4;

import static cosg4.EjemploArchivo.escribirArchivo;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Uso {

    public static void main(String[] args) {
       /* JOptionPane.showMessageDialog(null, "Iniciaremos escribiendo un archivo.\nNombre el archivo con su número de carnet");
       escribirArchivo();*/// para este ejemplo podemos comentar esta linea y la de arriba y asi solo probamos de una vez la lectura de arechivos
        JOptionPane.showMessageDialog(null, "Ahora leeremos el archivo creado.\nElija el nombre del archivo recién creado");
        leerArchivo();
    }

    public static void leerArchivo() {
        JOptionPane.showMessageDialog(null, "Ejemplo leer archivo");
        //Se crea el filtro de archivos
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto",
                "txt");
        //El objeto Swing que mostrará la ventana para seleccionar el archivo
        JFileChooser seleccionador = new JFileChooser();
        seleccionador.setFileFilter(filtro);
        seleccionador.setDialogTitle("Abrir");
        //Muestra la ventana de diálogo
        seleccionador.showOpenDialog(null);
        if (seleccionador.getSelectedFile() != null) {
            File nombreArchivo = seleccionador.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Ejemplo leer archivo");
            try {
                // Abrimos el archivo
                FileInputStream fstream = new FileInputStream(nombreArchivo);
                // Creamos el objeto de entrada
                DataInputStream entrada = new DataInputStream(fstream);
                // Creamos el Buffer de Lectura
                BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                String strLinea;
                // Leer el archivo linea por linea
                while ((strLinea = buffer.readLine()) != null) {
                    // Imprimimos la línea por pantalla
                    System.out.println(strLinea);
                }
                // Cerramos el archivo
                entrada.close();
            } catch (Exception e) { //Catch de excepciones
                System.err.println("Ocurrio un error: " + e.getMessage());
            }
        }

    }
}
