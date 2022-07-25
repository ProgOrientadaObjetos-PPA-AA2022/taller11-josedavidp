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

    public MenuDelDia(String np, double vim, double vp, double vb) {
        super(np, vim);
        valorPostre = vp;
        valorBebida = vb;
    }

    public void establecerValorPostre(double vp) {
        valorPostre = vp;
    }

    public void establecerValorBebida(double vb) {
        valorBebida = vb;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menú del Día: \n"
                + "\tPlato: %s\n\tValor Inicial: %.2f\n\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n\tValor del Menú: %.2f\n\n",
                nombrePlato,
                valorInicialMenu,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }
}
