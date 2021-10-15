/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("LUNES");
        miLista.add("MARTES");
        miLista.add("MIERCOLES");
        miLista.add("JUEVES");
        miLista.add("VIERNES");
        
        for(String elem: miLista){
            System.out.println(elem);
        }
        
        /*miLista.forEach(elem -> {
            System.out.println("elem = "+elem);
        });*/
        
        imprimir(miLista);
        
        Map miMap = new HashMap();
        miMap.put("valor1", "iker");
        miMap.put("valor2", "paco");
        miMap.put("valor3", "juan");
        miMap.put("valor4", "marcos");
        
        String nombre = (String)miMap.get("valor3");
        System.out.println(nombre);
        
        miMap.keySet();
        imprimir(miMap.keySet());
        System.out.println("");
        imprimir(miMap.values());
    }
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elem -> {
            System.out.println("elem = "+elem);
        });
    }
}
