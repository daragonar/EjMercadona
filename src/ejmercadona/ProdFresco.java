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
public class ProdFresco extends ProdCaduca{
    protected int temp;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public ProdFresco(int temp, String fecha, int codigo, String nombre, int peso) {
        super(fecha, codigo, nombre, peso);
        this.temp = temp;
    }

   
   
    public void mostrar()
    {
       super.mostrar();
        System.out.print(" temp:  " +this.temp);
    }
    
    
}
