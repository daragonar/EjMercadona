/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmercadona;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class BebAlcohol extends Bebida{
    private int graduacion;

    public int getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }

    public BebAlcohol(int graduacion, int azucar, String fecha, int codigo, String nombre, int peso) {
        super(azucar, fecha, codigo, nombre, peso);
        this.graduacion = graduacion;
    }

  
    public void mostrar()
    {
        super.mostrar();
        System.out.println(" Graduación: "+ this.getGraduacion());
    }
    
}
