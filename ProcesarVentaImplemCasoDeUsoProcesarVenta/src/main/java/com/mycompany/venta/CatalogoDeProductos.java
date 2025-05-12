package com.mycompany.venta;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeProductos {
   public List<EspecificacionDelProducto> especificacionesProductos=new ArrayList<>();

     public CatalogoDeProductos() {//Constructor vacio, si ocupare crear isntancias de esto sin parametros es necesario crearlo explitamente cuando hay mas constructores con parametros, ya q en ese caso java nocrea un constructor vacio por defectto, pero si no hay mas constructores, java crea este por defecto, aun asi  mejor lo creo aunuqe en este caso no sea necesario
    }
   
   public final void AgregarProducto(EspecificacionDelProducto especificacionProducto){
       especificacionesProductos.add(especificacionProducto);
   }
   public EspecificacionDelProducto getProducto(String idArticulo){
       //devolviendo el producto mismo en si, el propio en la referencia
      /* for (EspecificacionDelProducto especificacionProducto : especificacionesProductos) {
           if(especificacionProducto.getArticuloID().equalsIgnoreCase(idArticulo))return especificacionProducto;
       }
       return null;*/
       //devolviendolo pero u objeto copia,osea igual pero nola misma referencia
       EspecificacionDelProducto especifiProduc;
       especifiProduc=new EspecificacionDelProducto();
       for (EspecificacionDelProducto pivote : especificacionesProductos) {
           if(pivote.getArticuloID().equalsIgnoreCase(idArticulo)){
               especifiProduc.setArticuloID(idArticulo);
               especifiProduc.setDescripcion(pivote.getDescripcion());
               especifiProduc.setPrecio(pivote.getPrecio());
           }
       }
       return especifiProduc;
   }
   public boolean validarProductoCatalogo(String idArticulo){
        for (EspecificacionDelProducto especificacionProducto : especificacionesProductos) {
           if(especificacionProducto.getArticuloID().equalsIgnoreCase(idArticulo))return true;
       }
        return false;
   }
}
