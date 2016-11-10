/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmercadona;

/**
 *
 * @author usuario
 */
public class Producto {
    protected int codigo;
    protected String nombre;
    protected int peso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Producto(int codigo, String nombre, int peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
    }

    
    public void mostrar()
    {   
        
        System.out.print( "\ncodigo : "+this.codigo +"  Nombre:"+ this.nombre +" Peso:"+ this.peso);
    }
}
