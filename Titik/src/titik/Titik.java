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
public class Titik {
    
    private double x;
    private double y;
    
    public Titik(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
    
    public double jarak(){
        return(Math.sqrt(x*x+y*y));
    }
    
    
    
    public double jarak(double x1, double y1){
        return(Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y)));
    }
    
    public double jarak(Titik t){
        return this.jarak(t.getX(), t.getY());
    }
    
    

    
    
}
