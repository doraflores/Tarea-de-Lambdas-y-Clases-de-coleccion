package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Cadenas {
    // 2. Filtro Selectivo (ArrayList)
    public static void filtrar(ArrayList<String> lista, char letra, int longitudMinima){
        lista.removeIf(cadena -> cadena.toLowerCase().startsWith(String.valueOf(letra).toLowerCase()) || cadena.length() < longitudMinima);
    }

    // 3. Conversor de Mayúsculas (ArrayList)
    public static ArrayList<String> convertirMayusculas(ArrayList<String> palabras){
        return palabras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 5. Mapa de Longitudes (HashMap)
    public static HashMap<String,Integer> mapaLongitudes(ArrayList<String> palabras){
        return palabras.stream()
                .collect(Collectors.toMap(palabra -> palabra, String::length, (a,b) -> a, HashMap::new));
    }

    // 7. Contador de Frecuecias (HashMap)
    public static HashMap<String,Integer> contarFrecuencias(ArrayList<String> palabras){
        HashMap<String,Integer> frecuencias = new HashMap<>();
        palabras.forEach(palabra -> frecuencias.merge(palabra, 1, Integer::sum));
        return frecuencias;
    }

    // 8. Clasificador de Palabras (HashMap)
    public static ArrayList<String> clasificarPalabras(HashMap<String,Integer> mapa, int limite){
        return mapa.entrySet()
                .stream()
                .filter(e -> e.getValue() < limite)
                .map(e -> e.getKey())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 9. Deduplicación de Palabras (HashSet)
    public static HashSet<String> deduplicar(String frase, int minimoLetras){
        return Arrays.stream(frase.split("\\s+"))
                .map(String::toLowerCase)
                .filter(palabra -> palabra.length() >= minimoLetras)
                .collect(Collectors.toCollection(HashSet::new));
    }
}
