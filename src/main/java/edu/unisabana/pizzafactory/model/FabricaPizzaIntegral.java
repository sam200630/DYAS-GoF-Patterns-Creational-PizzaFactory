package edu.unisabana.pizzafactory.model;

public class FabricaPizzaIntegral implements FabricaPizza {
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }
}