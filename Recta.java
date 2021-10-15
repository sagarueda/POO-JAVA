package org.uma.mbd.mdRectas.recta;

public class Recta {
    private Vector direccion;
    private Punto pto;

    public Recta(Punto p1, Punto p2) {
        direccion = new Vector(p1, p2);
        pto = p1;
    }

    public Recta(Vector v, Punto p) {
        direccion = v;
        pto = p;
    }

    private double determinante(double x, double y, double w, double z) {
        return x * z - y * w;
    }

    public Recta paralelaPor(Punto p) {
        return new Recta(direccion, p);
    }

    public Recta perpendicularPor(Punto p) {
        return new Recta(direccion.ortogonal(), p);
    }

    public double distanciaDesde(Punto p) {
        Recta r = perpendicularPor(p);
        return p.distancia(this.interseccionCon(r));//buscar intersecciòn
    }

    public Punto interseccionCon(Recta r) {
        Implicita I1 = this.implicita();
        Implicita I2 = r.implicita();
        double det = determinante(I1.a(),I1.b(),I2.a(),I2.b());
        if (this.paralelaA(r)) {
            throw new RuntimeException("Rectas paralelas");
        }
        else {
            double x0 = 1 / det * determinante(-I1.c(),I1.b(),-I2.c(),I2.b());
            double y0 = 1 / det * determinante(I1.a(),-I1.c(),I2.a(),-I2.c());
            return new Punto(x0, y0);
        }
    }

    public boolean paralelaA(Recta r){
        Implicita I1 = this.implicita();
        Implicita I2 = r.implicita();
        return (determinante(I1.a(),I1.b(),I2.a(),I2.b()) == 0);
    }


    public boolean pasarPor(Punto p){
        Vector v1 = new Vector (pto,p);
        return (determinante(v1.getComponenteX(), v1.getComponenteY(),
                direccion.getComponenteX(),direccion.getComponenteY())==0);
    }

    @Override //R(vector,punto)
    public String toString(){return "Recta("+direccion+","+pto+")";}

    private Implicita implicita() {
        return new Implicita(this.direccion.getComponenteY() ,this.direccion.getComponenteX(),
                pto.getY() * this.direccion.getComponenteX() - pto.getX() * this.direccion.getComponenteY());
    }
}






