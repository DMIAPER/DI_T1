/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonHabana;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author DRDRA
 */
public final class logoInicio extends JFrame{
    
    public logoInicio(){
       Logo();
       cargar();
    }
    
    //Metodo para crear el logo del programa
    public void Logo(){
        setLayout(new FlowLayout());
        ImageIcon myImage = new ImageIcon("src/imagenes/inicio.PNG");
        JLabel imagen = new JLabel();
        imagen.setIcon(myImage);
        add(imagen);
    }
    //Metodo main del programa
    public void cargar(){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        
        
        //estas opciones de la variable sirven para generar la pantalla
        this.setUndecorated(true);         
        this.setVisible(true);
        this.setBounds(0, 0, 800, 600);
        Dimension ventana = this.getSize();
        this.setLocation(((pantalla.width - ventana.width)/2), ((pantalla.height-ventana.height)/2));
        
        //Con este metodo se pone el fondo en transparente 
        try{			
            Class clazz = Class.forName("com.sun.awt.AWTUtilities");
            Method metodo = clazz.getMethod("setWindowOpaque", java.awt.Window.class, Boolean.TYPE);
            metodo.invoke(clazz, this, false);
	}catch(ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
            System.out.println("Error "+e);
        }
        
        //metodo para realizar una cuenta para inciar el programa
        int v=0;
        for(int i=0; i<=50; i++){
            for(long j=0; j<1000000; j++){
                String poop = " " +(j+i);
            }
            v++;
        }
        if(v==51){  
            //AppTienda in = new AppTienda();
            //in.setVisible(true);
            System.out.println("Hola que tal");
        }
        //fin del metodo countdown
    }
}
