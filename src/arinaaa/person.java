/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arinaaa;

/**
 *
 * @author USER
 */
public class person {
    double height, weight, hasil;
    
    void calculateBMI(){
        hasil = weight / (height * height);
        System.out.println("body mass index : " + hasil );          
    }
    
}
