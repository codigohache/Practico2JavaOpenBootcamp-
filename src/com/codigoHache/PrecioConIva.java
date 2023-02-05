package com.codigoHache;

public class PrecioConIva {
    /*
    Realice una simulacion de venta de cuatro articulos, aplicando suma de todos y regla de 3 simple para aplicar
    iva del 21%

     */
    public static void main(String[] args) {
       System.out.println("El iva aplicado en Argentina es del 21%, es el que estoy aplicando");


       int articulo = 100; //precio sin iva
       int articulo2 = 120; //precio sin iva
       int articulo3 = 60; //precio sin iva
       int articulo4 = 20; //precio sin iva

        int resultadoSuma = articulo + articulo2 + articulo3 + articulo4;
       int iva = (resultadoSuma * 21) / 100;
       int precioConIva = resultadoSuma + iva;
        System.out.println(precioConIva);


        //Aplique * 0.21

        System.out.println("El iva aplicado en Argentina es del 21%, es el que estoy aplicando");

        double precioconIva2 = resultadoSuma * 0.21 + resultadoSuma ;
        System.out.println(precioconIva2);

        System.out.println("Entrega trabajo practico 2 java, codigoHache by Humberto Acosta. OpenBootcamp ");
    }



}
