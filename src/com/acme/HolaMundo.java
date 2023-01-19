package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        String appellidos=msg.solicitarDatos("Escribe tus apellidos: ");

        Persona persona = new Persona(nombre,appellidos);

        msg.saludar(persona);
    }
}
