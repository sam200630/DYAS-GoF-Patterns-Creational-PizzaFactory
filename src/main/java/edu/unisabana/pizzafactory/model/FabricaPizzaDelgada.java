package edu.unisabana.pizzafactory.model;

public class FabricaPizzaDelgada implements FabricaPizza {
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }
}
