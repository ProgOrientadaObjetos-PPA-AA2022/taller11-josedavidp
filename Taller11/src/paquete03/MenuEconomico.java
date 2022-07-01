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
public class MenuEconomico extends Menu {
    //porcentaje de descuento, en referencia al valor inicial del menú
    private double porcentajeDescuento;
    
    public MenuEconomico(String np, double vim) {
        super(np, vim);
    }

    public void establecerPorcentajeDescuento(double pd) {
        porcentajeDescuento = pd;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento / 100);
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Porcentaje de Descuento: %.2f\n", super.toString(), porcentajeDescuento);
        return cadena;
    }
}
