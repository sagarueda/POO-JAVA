package org.uma.mbd.mdRectas.recta;

public class Punto {
    private double x, y;

    //Constructores
    //public Punto() { x = y = 0; } //This constructor is not nececcesary
    public Punto(double a, double b) { x = a; y = b; }

    public double getX() { return x;}

    public double getY() { return y;}

    public void setX(double X) { x = X;}

    public void setY(double Y) {
        y = Y;
    }


    public void trasladar(double a, double b) {
        x += a; y += b;
    }

    public double distancia(Punto pto) {
        return Math.sqrt(Math.pow(x - pto.x, 2) +
                Math.pow(y - pto.y, 2));
    }
    @Override
    public String toString(){
        return "P("+x+","+y+")";
    }
}