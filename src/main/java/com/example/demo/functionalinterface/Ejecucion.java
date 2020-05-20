package com.example.demo.functionalinterface;

@FunctionalInterface
public interface Ejecucion<T,U,V,W> {

  W ejecutar(T t, U u, V v);

  default Ejecucion<T,U,V,W> sumar(Ejecucion<T,U,V,W> i){
    return (a,b,c) -> i.ejecutar(a,b,c);
  }

}
