package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Numeros {
    // 1. El Multiplicador (ArrayList)
    public static void multiplicar(ArrayList<Integer> lista, int factor){
        if(lista != null){
            lista.replaceAll(numero -> numero * factor);
        }
    }

    // 4. Cuadrados Únicos (HashSet)
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){
        if(numeros == null){
            return new HashSet<>();
        }
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * numero)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // 6. Modificador de Inventario (HashMap)
    public static void imprimirCatalogo(HashMap<String, Double> inventario){
        inventario.forEach((producto, precio) ->
                System.out.println(producto + " -> $" + String.format("%.2f", precio * 0.90)));
    }

    // 10. Tope de Frecuencias (HashMap)
    public static void limitarFrecuencias(HashMap<String, Integer> mapa, int limite){
        mapa.replaceAll((palabra, frecuencia) -> frecuencia > limite ? limite : frecuencia);
    }
}
