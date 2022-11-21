package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainChat {

    public String nombre;
    public String mensaje;

    public static final int CONTACTOS_INICIALES = 10;

    private static ArrayList<String> personas = new ArrayList<String>(Arrays.asList("Andrea", "Alba", "Alma", "Mónica", "Ana", "Angela", "Angi", "Antonio", "Paco", "Argenis", "Armando", "Aroa", "Brandon", "Pedro", "Juan", "Eduardo"));

    private static ArrayList<String> mensajes = new ArrayList<String>(Arrays.asList(
            "Hola", "Que tal?", "Como vas?", "Ni Hao", "Bonjiorno", "Me lees?", "Cierra la puerta", "Te paso la solución", "Oye!", "Madre mia!", "Jajajaja", "Así es", "Como veas", "Te quiero", "Un saludo", "Hasta mañana!"));

    public static MainChat generateContacto(){
        Collections.shuffle(personas);
        MainChat c = new MainChat();
        c.nombre = personas.get(0);
        c.mensaje = mensajes.get(0);
        return c;
    }

    public static MainChat[] generateContactos(int n) {
        MainChat[] contacto = new MainChat[n];
        for(int i = 0; i< n; i++){
            contacto[i] = MainChat.generateContacto();
        }
        return contacto;
    }

}
