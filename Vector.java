package org.uma.mbd.mdRectas.recta;


public class Vector {
    private Punto extremo;

    //public Vector() { extremo = new Punto(0,0);} //este constructor no es necesario

    public Vector (double X, double Y){extremo = new Punto(X,Y);}
    //

    public Vector (Punto p){ extremo = p;}

    public Vector(Punto p1, Punto p2) {
        extremo = new Punto(p2.getX()-p1.getX(),p2.getY()-p1.getY());
    }

    public Punto extremoDesde(Punto org){
        return new Punto(extremo.getX()+org.getX(),extremo.getY()+org.getY());
    }

    public Double getComponenteX() {
        return extremo.getX();
    }

    public Double getComponenteY() {
        return extremo.getY();
    }


    public double modulo(){
        return extremo.distancia(new Punto(0,0));
    }

    public Vector ortogonal(){
        return new Vector(-extremo.getY(), extremo.getX());
    }

    public boolean paraleloA(Vector v){
        return extremo.getX() * v.getComponenteY() == extremo.getY() * v.getComponenteX();
    }

    @Override
    public String toString(){return "V("+extremo.getX()+","+extremo.getY()+")";}
}

