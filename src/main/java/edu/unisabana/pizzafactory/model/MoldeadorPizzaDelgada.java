
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class MoldeadorPizzaDelgada implements Moldeador {
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequeña de masa delgada.");
    }
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa delgada.");
    }
}