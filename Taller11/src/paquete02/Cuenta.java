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
    

    public Cuenta(String nc, ArrayList<Menu> lista) {
        nombreCliente = nc;
        listaMenus = lista;
    }
    
    public Cuenta(String nc, ArrayList<Menu> lista, double i) {
        nombreCliente = nc;
        listaMenus = lista;
        iva = i;
    }

    public void establecerValorCancelar() {
        valorCancelar = subtotal + ((subtotal * iva)/100);
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
        String cadena = String.format("Factura\nCliente: %s\n", 
                nombreCliente);
        for (Menu m : listaMenus) {
            cadena += m.toString();
        }
        cadena += String.format("Subtotal: %.1f\nIVA: %.1f\nTotal a pagar: %.3f",
                subtotal, 
                iva,
                valorCancelar);
                return cadena;
    }
}
