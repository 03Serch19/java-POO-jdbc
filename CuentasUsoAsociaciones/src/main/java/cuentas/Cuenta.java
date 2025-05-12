package cuentas;

import clientes.Cliente;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cuenta {
  private double saldo;
  private ArrayList<Cliente> clientes = new ArrayList<>();
  private ArrayList<Movimiento> movimientos = new ArrayList<>();
  private DecimalFormat precision2 = new DecimalFormat("0.00");

  public Cuenta(double saldo, String cliente) {
    this.setSaldo(saldo);
    this.agregarCliente(cliente);
  }

  public void abonar(double cant) {
    if (cant > 0) {
      setSaldo(this.getSaldo() + cant);
      Movimiento mv = new Movimiento("Abono", cant);
      movimientos.add(mv);
    } else
      System.out.println("Cantidad no valida para abonar");
  }

  public void retirar(double cant) {
    if (!(cant > 0)) {
      System.out.println("Cantidad invalida para el retiro");
      return;
    }
    if (cant <= this.getSaldo()) {
      setSaldo(this.getSaldo() - cant);
      Movimiento mv = new Movimiento("Retiro", cant);
      movimientos.add(mv);
    } else
      System.out.println("Saldo insuficiente para el retiro");
  }

  public void agregarCliente(String cliente) {
    if (this.cantidadClientes() == 2)
      System.out.println("No es posible agregar otro cliente a esta cuenta, porque ya tiene un maximo de 2 clientes");
    else {
      Cliente nCl = new Cliente(cliente);
      clientes.add(nCl);
    }
  }

  public int cantidadClientes() {
    return clientes.size();
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    if (saldo >= 0)
      this.saldo = saldo;
    else {
      throw new IllegalArgumentException("Cantidad no valida");
    }

  }

  @Override
  public String toString() {
    String text = new String();
    if (this.cantidadClientes() == 1)
      text = "Nombre del cliente: ";
    else {
      text = "Nombre de los clientes: ";
    }
    for (Cliente cliente : clientes) {
      text += cliente.toString() + " ";
    }
    for (Movimiento movimiento : movimientos) {
      text += "\n" + movimiento.toString();
    }
    text += "\nSaldo Actual: " + precision2.format(this.getSaldo());
    return text;
  }

  public Cliente getCliente(int posi) {
    if (posi < this.cantidadClientes() && posi >= 0) {
      Cliente referenciCliente = clientes.get(posi);
      return referenciCliente;
    } else {
      System.out.println("Indice no valido para devolver clientes,retornamos null");
      return null;
    }
  }

  public void setCliente(int posi, String cliente) {
    if (posi >= this.cantidadClientes() || posi < 0)
      System.out.println("No es posible cambiar cliente, indice invalido");
    else {
      clientes.set(posi, new Cliente(cliente));
    }
  }

  public void eliminarCliente(Cliente cliente) {
    if (clientes.contains(cliente)) {
      clientes.remove(cliente);
    } else
      System.out.println("El cliente no existe en la cuenta,o cliente invalido");
  }

  public int buscaPosiCliente(String nombreCliente) {
    int posi = -1;
    for (Cliente cliente : clientes) {
      if (cliente.getNombre().equals(nombreCliente)) {
        posi = clientes.indexOf(cliente);
        return posi;
      }
    }
    return posi;
  }
}
