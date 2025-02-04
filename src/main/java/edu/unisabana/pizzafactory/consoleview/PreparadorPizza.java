package edu.unisabana.pizzafactory.consoleview;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.FabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.FabricaPizzaGruesa;
import edu.unisabana.pizzafactory.model.FabricaPizzaIntegral;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.Tamano;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]) {
        try {
            Ingrediente[] ingredientes = new Ingrediente[]{new Ingrediente("queso", 1), new Ingrediente("jamon", 2)};
            PreparadorPizza pp = new PreparadorPizza();
            
            // Selección del tipo de pizza
            FabricaPizza fabrica;
            String tipoPizza = "gruesa"; // Esto podría ser una entrada del usuario

            switch (tipoPizza) {
                case "delgada" -> {
                    fabrica = new FabricaPizzaDelgada();
                    Logger.getLogger(PreparadorPizza.class.getName()).log(Level.INFO, "[@@] Pizza delgada.");
                }
                case "gruesa" -> {
                    fabrica = new FabricaPizzaGruesa();
                    Logger.getLogger(PreparadorPizza.class.getName()).log(Level.INFO, "[@@] Pizza gruesa.");
                }
                case "integral" -> {
                    fabrica = new FabricaPizzaIntegral();
                    Logger.getLogger(PreparadorPizza.class.getName()).log(Level.INFO, "[@@] Pizza integral.");}
                default -> {
                    throw new ExcepcionParametrosInvalidos("Tipo de pizza inválido: " + tipoPizza);
                    }
            }

            pp.prepararPizza(ingredientes, Tamano.PEQUENO, fabrica);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparación de la Pizza", ex);
        }
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, FabricaPizza fabrica)
            throws ExcepcionParametrosInvalidos {
        // Usamos la fábrica para crear los componentes según el tipo de pizza
        Amasador am = fabrica.crearAmasador();
        Horneador hpd = fabrica.crearHorneador();
        Moldeador mp = fabrica.crearMoldeador();
        
        // Amasamos la pizza
        am.amasar();
        
        // Moldeamos según el tamaño
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }
        
        // Aplicamos los ingredientes
        aplicarIngredientes(ingredientes);
        
        // Horneamos la pizza
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "Aplicando ingredientes: {0}", Arrays.toString(ingredientes));
        
        // Código de llamado al microcontrolador (esto lo debes adaptar)
    }
}