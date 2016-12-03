/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class KeyListen extends Thread {

   @Override
   public void run()
   {
       Scanner c = new Scanner(System.in);
       System.out.println("Console: (Digita 'exit' per uscire)");
      
       while(true)
       {
          String D = c.next();
          
          if(D.equals("exit")) {System.exit(0);}
       }   
           
       
       
               
       
   }
    
    
    
}
