
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaDelgada implements Horneador {
    public void hornear() {
        Logger.getLogger(HorneadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza delgada.");
    }
}
