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
public class MenuCarta extends Menu {
    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String np, double vim, double vpg, double vb, double pa) {
        super(np, vim);
        valorPorcionGuarnicion = vpg;
        valorBebida = vb;
        porcentajeAdicional = pa;
    }

    public void establecerValorPorcionGuarnicion(double vpg) {
        valorPorcionGuarnicion = vpg;
    }

    public void establecerValorBebida(double vb) {
        valorBebida = vb;
    }

    public void establecerPorcentajeAdicional(double pa) {
        porcentajeAdicional = pa;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPorcionGuarnicion + valorBebida + 
                (valorInicialMenu * porcentajeAdicional / 100);
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString(){
        String cadena = String.format("Menú a la Carta: \n"
                + "\tPlato: %s\n\tValor Inicial: %.1f\n\tValor guarnicion: %.1f\n"
                + "\tValor bebida: %.1f\n\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorPorcionGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }
    
}
