/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import paquete03.Menu;
/**
 *
 * @author Matias Quezada
 */
public class MenuEconomico extends Menu {
    double pDescuento;

    public MenuEconomico(String np,  double vim, double pd) {
        super(np, vim);
        pDescuento = pd;
    }
    
    
    public void establecerPorcentajeDescuento(double n) {
        pDescuento = n;
    }

    public double obtenerPorcentajeDescuento() {
        return pDescuento;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - (pDescuento * valorInicialMenu)/100;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Económico\n%s", super.toString());
        cadena = String.format("%s"
                + "Porcentaje Descuento: %.2f\n"
                + "Valor del Menu:%.2f\n", cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }
}

