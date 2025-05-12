package cosg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EjemploArchivo {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Iniciaremos escribiendo un archivo.\nNombre el archivo con su número de carnet");
 escribirArchivo();
    }
 // no esta tan especificado pero el archivo podria crearse antes y luego solo se selecciiona y despues se escribe en el
    //pero tambien podria simplemnte conducirse a la carpeta que qeueramos alamcenar un nuevo archivo y agregagos el nombre .txt
    //en lugar de dejar vacio, y le damos open, sin selccionar nada, nada mas estandao en la carpeta donde queramos almacenar
    //el bnuevo archivo y al dar open se creara y luego solo tendremos que escribir
    public static void escribirArchivo() {
        JOptionPane.showMessageDialog(null, "Ejemplo crear archivo");
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
            File archivo = seleccionador.getSelectedFile();
            PrintWriter flujoSalida = null;
            try {
                flujoSalida = new PrintWriter(archivo);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo"
                        + archivo);
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "Deberá ingresa tres líneas de texto");
            for (int i = 1; i <= 3; i++) {
                String linea = JOptionPane.showInputDialog("Ingrese la línea " + i);
                flujoSalida.println(i + " " + linea);
            }
            flujoSalida.close();
            JOptionPane.showMessageDialog(null, "El texto fue guardado en el archivo: "
                    + archivo);
        }
    }
}

