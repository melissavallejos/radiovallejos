package com.vallejos.radiovallejos.principal;

import com.vallejos.radiovallejos.modelos.Cancion;
import com.vallejos.radiovallejos.modelos.MisFavoritos;
import com.vallejos.radiovallejos.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Sofía Vallejos");
        miPodcast.setTitulo("Conversaciones sinceras");

        //Cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        // Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }


        System.out.println("El total de reproducciones es: " + miCancion.getTotalDeReproducciones());
        System.out.println("El total de Me Gusta es: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);


    }
}
