package com.acme;

public record PersonaRegistro(String nombre,String appellidos) {
    @Override
    public String toString() {
        //Ivan comente esta linea
        //System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre,appellidos);
    }
}
