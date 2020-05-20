package com.example.demo;

import com.example.demo.functionalinterface.Ejecucion;
import java.util.Optional;

public class MainClazz {

  public static void main(String[] args) {

    Ejecucion<String, String, String, Integer> primerCaso = (a,b,c) -> (Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c));
    Ejecucion<String, String, String, Integer> segundoCaso = (a,b,c) -> (Integer.parseInt(a) * Integer.parseInt(b) * Integer.parseInt(c));

    System.out.println("retorno suma: " + primerCaso.ejecutar("10","20","30"));
    System.out.println("retorno multiplicacion: " + segundoCaso.ejecutar("10","20","30"));

    String texto = "";
    Integer var1 = Optional.ofNullable(texto)
        .filter(text1 -> !text1.isEmpty())
        .filter(text2 -> text2.length() > 2)
        .map(valor1 -> Integer.parseInt(valor1) * 10)
        .map(valor2 -> valor2 - 1)
        .orElseGet(() -> 123456789)

        ;

    System.out.println("res1: " + var1);

    /*
    String var2 = Optional.of(texto)
        .orElse("valor por defecto");
    System.out.println("res2: " + var2);
    */
  }
}
