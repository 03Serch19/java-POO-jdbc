package cos1;

import java.io.*;

class Punto implements Serializable {

  private int x;
  private int y;

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "Punto[" + x + "," + y + "]";
  }
}
