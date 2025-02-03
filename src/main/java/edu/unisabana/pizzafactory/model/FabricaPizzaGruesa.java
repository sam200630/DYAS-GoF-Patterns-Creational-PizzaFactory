package edu.unisabana.pizzafactory.model;

public class FabricaPizzaGruesa implements FabricaPizza {
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }
}
