package br.com.dio.collections.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.4);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("tuscon"));

        System.out.println("Exiba o consumo do uno: "+ carrosPopulares.get("uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: "); Nao tem como fazer!

        System.out.println("Exiba os modelos: ");
        Set<String> modelos=carrosPopulares.keySet();

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumo = carrosPopulares.values();

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = ""; //variavel de controle

        for (Map.Entry<String, Double>entry : entries){
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: "+modeloMaisEficiente + "-" + consumoMaisEficiente);
        }


    }


}
