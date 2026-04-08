package com.mx.curso.unidad2.interfaces;

interface SeriaLizable{

    public void a();
}

interface Tokenizable{
    public void b();
}


public interface Entrenable {
    public void c();
}

class modelo implents Serializable, Tokenizable, Entrenable{

}