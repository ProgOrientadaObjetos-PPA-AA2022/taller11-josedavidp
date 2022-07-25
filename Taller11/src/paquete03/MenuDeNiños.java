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
    
    public MenuDeNiños(String np, double vim, double pHelado, double pPastel){
        super(np, vim);
        valorPorcionHelado = pHelado;
        valorPorcionPastel = pPastel;
    }

    public void establecerValorPorcionHelado(double vph) {
        valorPorcionHelado = vph;
    }

    public void establecerValorPorcionPastel(double vpp) {
        valorPorcionPastel = vpp;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
    }

    public double obtenerValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }

    @Override
    public String toString(){
        String cadena = String.format("Menú de Niños: \n"
                + "\tPlato: %s\n\tValor Inicial: %.2f\n\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n\tValor del Menú: %.2f\n\n",
                nombrePlato,
                valorInicialMenu,
                valorPorcionHelado,
                valorPorcionPastel,
                valorMenu);
        return cadena;
    }
}
