/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmercadona;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author usuario
 */
public class EjMercadona {
    static ArrayList<Producto> productos= new ArrayList<>();
    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void rellenarDatos() throws ParseException
    {
        for (int i = 0; i < 10; i++) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String fecha=dateFormat.format(date);
            
            ProdCaduca pc= new ProdCaduca(fecha, i, "Nombre",i);
            productos.add(pc);
            ProdFresco pf=new ProdFresco(i+20, fecha, i+10, "Nombre1",i);
            productos.add(pf);
            Bebida b= new Bebida(i+12, fecha, i+20, "Nombre 2",i);
            productos.add(b);
            BebAlcohol ba=new BebAlcohol(i+17, i+2, fecha, i+30, "Nombre 33",i);
            productos.add(ba);
        }
    }
    
    public static void mostrarProd()
    {
        for (Producto producto : productos) {
            //System.out.println(producto.getCodigo());
            producto.mostrar();
        }
    }
    
    public static void mostrarAzucar()
    {
        for (Producto producto : productos) {
            if(producto instanceof Bebida)
            {
                System.out.println(((Bebida)producto).getAzucar());
            }
        }
    }
    
    public static void mediaGraduacion()
    {
        int totGrad=0,count=0;
        for (Producto producto : productos) {
            if(producto instanceof BebAlcohol)
            {
                totGrad+=((BebAlcohol)producto).getGraduacion();
                count++;
            }
        }
        System.out.println("La media de graduación de las bebidas alcoholicas es : " + totGrad/count + " º");
    }
    
    public static void mostarNoAlcohol()
    {
        for (Producto producto : productos) {
            if(producto instanceof Bebida)
            {
                if(!(producto instanceof BebAlcohol))
                {
                    System.out.println("azucar no alcoholica " + ((Bebida)producto).getAzucar());
                }
            }
        }
       }
    
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        rellenarDatos();
        mostrarProd();
        //mostrarAzucar();
        //mediaGraduacion();
        //mostarNoAlcohol();
    }
    
}
