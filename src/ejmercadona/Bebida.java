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
public class Bebida extends ProdCaduca{
    protected int azucar;

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public Bebida(int azucar, String fecha, int codigo, String nombre, int peso) {
        super(fecha, codigo, nombre, peso);
        this.azucar = azucar;
    }

    public void mostrar()
    {
        super.mostrar();
        System.out.print(" Azucar:  " +this.getAzucar());
    }
}
