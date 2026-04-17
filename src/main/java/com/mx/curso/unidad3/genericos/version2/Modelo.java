package com.mx.curso.unidad3.genericos.version2;

public interface Modelo<T>{
    void activar (List<T> activaciones);

}
class implementaModelo implements Modelo<String>{
    @Override
    public void activar(List<Integer> activaciones){

    }
}
class ImplementaModeloDoubles implements Modelo<Double> {
    Override

    public void activar(List<Double> activaciones) {
    }
}