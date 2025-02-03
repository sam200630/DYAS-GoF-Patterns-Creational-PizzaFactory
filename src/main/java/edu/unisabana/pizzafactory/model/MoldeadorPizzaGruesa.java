package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements Moldeador {
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequeña de masa gruesa.");
    }
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa gruesa.");
    }
}