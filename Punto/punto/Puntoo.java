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
public class Puntoo {
    private double x,y,dx=0,dy=0,dt=0;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Puntoo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Puntoo() {
        this.x = 0;
        this.y = 0;
    }
    public Puntoo(Puntoo c) {
        this.x= c.x;
        this.y= c.y;
    }
    public double distacia(Puntoo c){
        return (Math.sqrt(((Math.pow(c.getX() - this.x, 2))+(Math.pow(c.getY() -this.y,2)))));
    }
    public double origen(){
        return this.distacia(new Puntoo(0,0));
    }
    public void movx(double dx){
        this.x=this.x+dx;
    }
    public void movy(double dy){
        this.x=this.x+dy;
        System.out.println(this.x +" , "+ this.y);
    }
    public void mov(double dx,double dy){
        this.x=this.x+dx;
        this.y=this.y+dy;
        System.out.println(this.x +" , "+ this.y);
    }
    public void movxy(double dt){
        this.x=this.x+dt;
        this.y=this.y+dt;
        System.out.println(this.x +" , "+ this.y);
    }
}
