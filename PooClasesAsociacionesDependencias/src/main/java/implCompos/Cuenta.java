package implCompos;

import java.util.ArrayList;

public class Cuenta {
    private double saldo;
    private ArrayList<Cliente> clientes=new ArrayList<>();
    private ArrayList<Movimiento> movimientos=new ArrayList<Movimiento>();
    public Cuenta() {
    }
    public Cuenta(String propietario, double saldo){
      //  Cliente propietarioC = new Cliente(propietario);
        clientes.add(new Cliente(propietario));
        setSaldo(saldo);
    }
    public void agregarPropietario(String otroPropietario){
        if(clientes.size()==2)System.out.println("No es posible agregar otro propietario, esta cuenta ya tiene 2 propietarios asociados");
        else clientes.add(new Cliente(otroPropietario));
    }
    public void abonar(double cant){
        if(cant>0){
        Movimiento movimiento = new Movimiento("Abono", cant);
        setSaldo(getSaldo()+cant);//la guia sugiere saldo=saldo+cant;
        movimientos.add(movimiento);
        }else{
            throw new IllegalArgumentException("Error, Debes ingresar una cantidad positiva");
        }
    }
    public void retirar(double cant){
        if(cant<=getSaldo()){
        Movimiento movimiento = new Movimiento("Retiro", cant);
        setSaldo(getSaldo()-cant);
        movimientos.add(movimiento);
        }else{
            System.out.println("No tienes suficientes fondos para retirar tu saldo es "+getSaldo());
        }
    }
     public int buscarPropietario(String propietario){     
         int indi=-1;
         for (Cliente cliente : clientes) {
             if(cliente.getNombre().equals(propietario))return clientes.indexOf(cliente); 
         }
        return indi;
     }
     public void setCliente(int posi,String nombre){
         if(posi<clientes.size()&&posi>=0){
          Cliente reemplProp=new Cliente(nombre);
          clientes.set(posi, reemplProp);
         }else System.out.println("Posicion invalida para cambiar");
     }
     public Cliente getPropietario(int indi){
         //if(clientes.get(indi)==null){ throw new IllegalArgumentException("Posicion invalida");}//esto no porque incluso elimnando un vcalor del array clientes este espacio mo queda null porque se llena con posicion sigfyuiente y asi sucesivameente
        if(this.getCantidadClientes()<=indi||indi<0){ throw new IllegalArgumentException("Posicion invalida");}
         else{
             Cliente cl=clientes.get(indi);//esta vez no retornare un nuevo objeto ya q lo devolvere para que luego lo eliminen de la lista
             
             return cl;
             //return new Cliente(cl.getNombre());//si retornro esto estoy debolviendo un uevo opjeto y no el que esta en la ´posicon en el array, ya que es otro objeto nuevop que devuelvo asi qyue si esto devuelo lo elimino pues no eliminara el objeto en la posicon buscado yta que son dos objetos diferecntes con mism valor en nombre
         }
     }
     public void eliminarPropietario(Cliente cl){      
         if(clientes.contains(cl))
         clientes.remove(cl);
         else 
             throw new IllegalArgumentException("Error: No existe el propietario");
     }
    public int getCantidadClientes(){
        return clientes.size();
    }
    public double getSaldo() {
        return saldo;
    }
   //creerai este podria ser privado en la logica ya que pues para esop esta abonar saldo el cual se registrar en moviemientos
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }   
    @Override
   public String toString(){
       String texto =new String();
       if(clientes.size()==1)texto="Propietario: ";
       else texto="Propietarios: \n";
        for (Cliente cliente : clientes) {
            texto+="Nombre: "+cliente+"\n";
        }
        for (Movimiento movimiento : movimientos) {
            texto+=movimiento+"\n";
        }
       return texto;
   }
}
