/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author josed
 */
public class MenuDelDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDelDia(String np, double vim) {
        super(np, vim);
    }

    public void establecerValorPostre(double vp) {
        valorPostre = vp;
    }

    public void establecerValorBebida(double vb) {
        valorBebida = vb;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Valor del Postre: %.2f\n"
                + "Valor de la Bebida: %.2f\n", super.toString(), valorPostre, valorBebida);
        return cadena;
    }

}
