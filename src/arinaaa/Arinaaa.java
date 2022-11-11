/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arinaaa;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Arinaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        person person = new person ();
        System.out.println("universitas merdeka malang");
        System.out.println ("arina hidayah");
        System.out.println("22081000009");
        System.out.print ("Input heigt in kilogram: "); 
        person.weight = sc.nextDouble();
        System.out.print ("Input height in meter: ");
        person.height = sc.nextDouble();
        person.calculateBMI();
        
    }
    
}
