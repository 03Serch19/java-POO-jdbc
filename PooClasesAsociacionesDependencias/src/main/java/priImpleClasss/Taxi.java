package priImpleClasss;

import java.util.ArrayList;
//import java.util.List;

public class Taxi {
    private String matricula;
   // private Chofer chofer;
    //si la asociacion de multiplicada cambira de 1 a 0..*, y habilitariamos de nuevo el constructor vacio,y eliminariamos chofer
    private ArrayList<Chofer> choferes=new ArrayList<>();//Use interfaz list, pero pues podria usar directamenete  fija la calse ArrayList
    //y cambiaria cierto codigo y comentaremos el que ya no se usara
  //si la asociciacion de multiplicidad de taxi a chofer es 1 a  0..1 esta bien dejar el constructor sin argumentos,ya que nos permiter que un objeto taxi pueda o no estar asociado a un chofer
    public Taxi() {
    }
   //péro si la multiplicidad es 1 a 1, no deberiamos perdmitir el constructgor vacio asi cumplimos la restriccion y taxi estara asociado a un chofer
    public Taxi(String matricula, Chofer chofer) {
        //this.matricula = matricula;// o, al menos la guia de java lo deja asincomo esta abajo
        setMatricula(matricula);
       // this.choferes.add(chofer);//puede ser asi o
        agregarChofer(chofer);
        //this.chofer = chofer;
    }
    
    //si la multiplicidad es de nuevo de 1 a 1..* quitamos el cosntructor vacio
    //y tendremmos que modificar el constructor para al menos asegurar un chofer, de nuevo a descomentar Chofer chofer en el constructror
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void agregarChofer(Chofer chofer){
        choferes.add(chofer);
    }
    public int buscarChofer(Chofer chofer){
          return choferes.indexOf(chofer);       
    }  
    public void eliminarChofer(Chofer chofer){
        if(choferes.contains(chofer)){
            choferes.remove(chofer);
        }else{
            throw new IllegalArgumentException("Error chofer no exiiste");
        }
    }
    
    public void setChofer(int posi,Chofer chofer){
        if(posi>=0 && posi <this.getCantidadChoferes()){//en la segunda eva dejo solo el < y no <= porque en caso de querer que se inserte en la ultima posiscion deberia merjor usar el metodo agregarChofer
         choferes.set(posi, chofer);           
        }else{
            throw new IllegalArgumentException("Error posicion invalida");
        }
    }
    public Chofer getChofer(int posi){
        if(posi>=0 && posi <this.getCantidadChoferes()){
        //return choferes.get(posi);//si devuelvo esto estare devolviendo la referencia, osea el objeto en esta posicion y si esto lo guardan en una nueva imnstancia y modifican esa instamncia estaran modificando este objeto ya que es la misma referencia
       Chofer chofer =choferes.get(posi);
        return new Chofer(chofer.getNombre()); //asi que mejor devolvemos un nuevo objeto con el mismo nombre , si esto lo alamcenan en una instancia y modiufican esa minstancia , ya estaran modificando este nuevo objeto y no se modificara la referencia dl objeto en choferes.get(posi)
       }else{
            throw new IllegalArgumentException("Error posicion invalida");
        }
    }
     public int getCantidadChoferes(){
         return choferes.size();
     }
    /*public Chofer getChofer() {
        return chofer;
    }*/

    /*public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }*/

  /*  @Override
    public String toString() {
        return "Taxi matricula = " + matricula + " " + chofer;//el toString no se si es porq estoy en maven o pq pero soi se lo quito aunm asi me funcionaria osea, creo que es porque print si no ve texto en automaticop aplica el tostring
    }     */                                     //la cosa que no es necesario el tostring aca, creo en autmatico chofer ya aca semuestra como texto
                                             //en la guia proponen +chfer.toString()

    @Override
    public String toString() {
        String text="Taxi matricula = " + matricula+"\n";
        for (Chofer chofer : choferes) {
            text+=chofer.toString()+"\n";
        }
        return text;
    }
       
    
}
