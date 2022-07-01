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
public class MenuDeNiños extends Menu {
    private double valorPorcionHelado;
    private double valorPorcionPastel;
    
    public MenuDeNiños(String np, double vim) {
        super(np, vim);
    }

    public void establecerValorPorcionHelado(double vph) {
        valorPorcionHelado = vph;
    }

    public void establecerValorPorcionPastel(double vpp) {
        valorPorcionPastel = vpp;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
    }

    public double obtenerValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Valor de la Porcion de Helado: %.2f\n"
                + "Valor de la Porcion de Pastel: %.2f\n", 
                super.toString(), 
                valorPorcionHelado, 
                valorPorcionPastel);
        return cadena;
    }
}
