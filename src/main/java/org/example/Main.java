package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        System.out.println("1. El Multiplicador");
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Antes de multiplicar: " + numeros);
        Numeros.multiplicar(numeros, 4);
        System.out.println("Después de multiplicar" + numeros);
        System.out.println("Prueba con lista vacía");
        ArrayList<Integer> vacia = new ArrayList<>();
        System.out.println("Antes de multiplicar: " + vacia);
        Numeros.multiplicar(vacia, 6);
        System.out.println("Después de multiplicar" + vacia);


        System.out.println("2. El Filtro Selectivo");
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("trucha", "delfin", "salmon", "tiburon", "betta"));
        System.out.println("Lista original: " + palabras);
        Cadenas.filtrar(palabras, 't', 5);
        System.out.println("Lista filtrada: " +palabras);

        System.out.println("3. Conversor de Mayúsculas");
        ArrayList<String> listaMayusculas = new ArrayList<>(Arrays.asList("Tablet", "Apunte", "Clase"));
        System.out.println(Cadenas.convertirMayusculas(listaMayusculas));
        System.out.println("Prueba con lista vacía");
        ArrayList<String> palabrasVacias = new ArrayList<>();
        System.out.println(Cadenas.convertirMayusculas(palabrasVacias));

        System.out.println("4. Cuadrados Únicos");
        ArrayList<Integer> numeros2 = new ArrayList<>(Arrays.asList(2,2,4,6,6,8));
        System.out.println(Numeros.cuadradosUnicos(numeros2));
        System.out.println("Prueba con lista vacía");
        ArrayList<Integer> numerosVacios = new ArrayList<>();
        System.out.println(Numeros.cuadradosUnicos(numerosVacios));

        System.out.println("5. Mapa de Longitudes");
        ArrayList<String> palabrasMapa = new ArrayList<>(Arrays.asList("Lapiz", "Cuaderno", "Computadora"));
        System.out.println(Cadenas.mapaLongitudes(palabrasMapa));

        System.out.println("6. Modificador de Inventario");
        HashMap<String,Double> inventario = new HashMap<>();
        inventario.put("Sombras", 15000.0);
        inventario.put("Rubor", 300.0);
        inventario.put("Base", 600.0);
        Numeros.imprimirCatalogo(inventario);

        System.out.println("7. Contador de Frecuencias");
        ArrayList<String> palabrasFrecuencia = new ArrayList<>(Arrays.asList("gato", "perro", "gato", "gato", "gallina"));
        HashMap<String,Integer> frecuencias = Cadenas.contarFrecuencias(palabrasFrecuencia);
        System.out.println(frecuencias);
        System.out.println("Prueba con lista vacía");
        ArrayList<String> sinPalabras = new ArrayList<>();
        System.out.println(Cadenas.contarFrecuencias(sinPalabras));

        System.out.println("8. Clasificador de Palabras");
        System.out.println(Cadenas.clasificarPalabras(frecuencias,3));

        System.out.println("9. Deduplicación de Palabras");
        String frase = "El gato está debajo de la cama";
        System.out.println(Cadenas.deduplicar(frase,4));

        System.out.println("10. El Tope de Frecuencias");
        System.out.println("Frecuencias anteriores: " + frecuencias);
        Numeros.limitarFrecuencias(frecuencias, 2);
        System.out.println("Frecuencias posteriores: " + frecuencias);
    }
}