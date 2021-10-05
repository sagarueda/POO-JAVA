package org.uma.mbd.mdJarras;

public class Jarra {

    private int cap, cont;

    //crear jarra
    public Jarra(int capInicial){
        // Para inicializar Jarra basta con saber la capacidad
        cap = capInicial;
        cont = 0; //se inicializa vacía
    }

    public void set_cont(int n){
        cont = n;
    }

    public int get_cap() { return cap;}
    public int get_cont() { return cont; }

    public void llena(){
        cont = cap;
    }

    public void vacia(){
        cont = 0;
    }


    public void llenaDesde(Jarra j) {
        int cabe = cap - cont;

        if (cabe>=j.cont){
            cont +=j.cont; //se le agrega lo que tiene j
            j.cont = 0;// se la deja a j vacía

        } else {
            cont = cap; //
            j.cont = j.cont-cabe;
        }
    }

    @Override
    public String toString(){
        return "J("+cap+","+cont+")";
    } //no hace falta el print
}
