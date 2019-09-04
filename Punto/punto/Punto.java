/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 *
 * @author Estudiantes
 */
public class Punto {
   
    public static void main(String[] args){
    Puntoo c1 = new Puntoo(0,2);
    System.out.println("la distacia entre dos punto es: "+ c1.distacia(new Puntoo(2,2)));
    System.out.println("la distacia entre dos punto es: "+ c1.origen());
    c1.mov(1,2);
    c1.movx(1);
    c1.movy(1);
    c1.movxy(3);

    }
    
}
