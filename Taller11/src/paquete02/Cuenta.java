/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author josed
 */
public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> listaMenus;
    private double valorCancelar;
    private double subtotal;
    private double iva;
    

    public Cuenta(String nc) {
        nombreCliente = nc;
        listaMenus = new ArrayList<>();
    }

    public void establecerValorCancelar(double vc) {
        valorCancelar = vc;
    }
    
    public void establecerNombreCliente(String nc) {
        nombreCliente = nc;
    }

    public void establecerSubtotal() {
        subtotal = 0;
        for (Menu m : listaMenus) {
            subtotal += m.obtenerValorMenu();
        }
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Menu> obtenerListaMenus() {
        return listaMenus;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del cliente: %s\n", 
                nombreCliente);
        for (Menu m : listaMenus) {
            cadena += m.toString();
        }
        cadena += String.format("Valor a cancelar: %.2f\n"
                + "Subtotal: %.2f\nIva: %.2f\n",
                valorCancelar, 
                subtotal, 
                iva);
                return cadena;
    }
}
