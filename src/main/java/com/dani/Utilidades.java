package com.dani;

import java.util.Random;

public class Utilidades {
    public static float generarNota(float min, float max) {
        Random random = new Random();
        float nota = (int) (random.nextFloat(min, max) * 10);

        return nota / 10;
    }

    public static float promediar(float total, int cantidad) { //TODO: Optimizar este algoritmo
        float promedio = total / cantidad;
        float decimas = promedio % 1f;

        float restoDecimas = (decimas*10) % 1f;

        promedio -= decimas;

        decimas -=  restoDecimas / 10;
        if(restoDecimas > 0.5f) decimas += 0.1f;

        promedio += decimas;

        return promedio;
    }
}
