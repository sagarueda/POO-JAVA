package org.uma.mbd.mdJarras;
import org.uma.mbd.mdJarras.Jarra;
public class Main {
    public static void main(String[] args) {
        Jarra j1 = new Jarra(7 );
        Jarra j2 = new Jarra(5);

        j1.set_cont(4);
        j2.set_cont(3);
        System.out.println("Jarra 1: "+j1);
        System.out.println("Jarra 2: "+j2);
        j1.llenaDesde(j2);
        System.out.println("Se llena desde la Jarra 2 a la 1");
        System.out.println("Jarra 1: "+j1);
        System.out.println("Jarra 2: "+j2);
        System.out.println("Se vacía las dos Jarras");

        j1.vacia();
        j2.vacia();
        System.out.println(j1); //sout tab
        System.out.println(j2);
    }
}
