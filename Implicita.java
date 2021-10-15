package org.uma.mbd.mdRectas.recta;

public record Implicita(double a, double b, double c) {

    public double a() {
        return a;
    }
    public double b() {
        return b;
    }
    public double c() {
        return c;
    }

}