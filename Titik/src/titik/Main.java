/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titik;

/**
 *
 * @author Evita S
 */
public class Main {
    public static void main(String[] args) {
        Titik a;
        a = new Titik(3,4);
        Titik b = new Titik(-3,4);
        
        System.out.println("Jarak terhadap titik pusat: " + a.jarak());
        System.out.println("Jarak dengan titik (3,-4): " + a.jarak(3,-4));
        
    }
    
}
