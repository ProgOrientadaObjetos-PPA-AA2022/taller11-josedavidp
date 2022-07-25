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
    private double porcentajeDescuento;
    
    public MenuEconomico(String np, double vim, double pd) {
        super(np, vim);
        porcentajeDescuento = pd;
    }

    public void establecerPorcentajeDescuento(double pd) {
        porcentajeDescuento = pd;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento / 100);
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString(){
        String cadena = String.format("Menú Econónomico: \n"
                + "\tPlato: %s\n\tValor Inicial: %.2f\n\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f\n\n",
                nombrePlato,
                valorInicialMenu,
                porcentajeDescuento,
                valorMenu);
        return cadena;
    }
}
