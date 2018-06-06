/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import javax.swing.JLabel;

/**
 *
 * @author LN710Q
 */
public class AnimalThreads extends Thread{
    private String nombre;
    private int limite,x,y;
    private JLabel animal;

    public AnimalThreads(){}
    public AnimalThreads(String nombre,int x, int y, int limite, JLabel animal) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.limite = limite;
        
        this.animal = animal;
    }
    
    @Override
    public void run(){
        for(int i=0; i<this.limite;i+=10){
            System.out.println(this.nombre + "avanza");
            
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.nombre+ " ah llegado a la meta");
        
        
        for(int i=this.limite; i>0;i=i-10){
            System.out.println(this.nombre + "retrocede");
            
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        System.out.println("Ha regresado al inicio");
        yield();
    }
    
    
        
}
