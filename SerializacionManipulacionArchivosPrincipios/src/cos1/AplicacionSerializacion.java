package cos1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AplicacionSerializacion {

  public static void main(String args[]) throws IOException, ClassNotFoundException {
    Punto punto = new Punto(1, 5);
    ObjectOutputStream archivoObjetosSal = new ObjectOutputStream(new FileOutputStream("temp"));
    // Guardando objeto
    archivoObjetosSal.writeObject(punto);
    archivoObjetosSal.close();
    // Recuperando objeto
    ObjectInputStream archivoObjetosEnt = new ObjectInputStream(new FileInputStream("temp"));
    Punto punt = (Punto) archivoObjetosEnt.readObject();
    archivoObjetosEnt.close();
    System.out.println(punt); // jal ya haber ejecutado lo anterior, osea la parte del write, pss luego
                              // podemos comentar
                              // toda esa parte y solo ejecutar lo de abajo
  }
}
