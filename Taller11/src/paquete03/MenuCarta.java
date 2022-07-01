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

    public MenuCarta(String np, double vim) {
        super(np, vim);
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
    public void establecerValorMenu() {
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
    public String toString() {
        String cadena = String.format("%s\n"
                + "Valor de la Porción de Guarnición: %.2f\n"
                + "Valor de la Bebida: %.2f\n"
                + "Porcentaje de Adicional: %.2f\n", super.toString(), 
                valorPorcionGuarnicion, 
                valorBebida, 
                porcentajeAdicional);
        return cadena;
    }
    
}
