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
public class ProdCaduca extends Producto{
    protected String fecha;

    public ProdCaduca(String fecha, int codigo, String nombre, int peso) {
        super(codigo, nombre, peso);
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void mostrar()
    {
        super.mostrar();
        System.out.print(" fecha : " +this.getFecha());
    }
    
    
}
