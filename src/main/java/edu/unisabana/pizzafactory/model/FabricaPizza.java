package edu.unisabana.pizzafactory.model;

public interface FabricaPizza {
    Amasador crearAmasador();
    Horneador crearHorneador();
    Moldeador crearMoldeador();
}