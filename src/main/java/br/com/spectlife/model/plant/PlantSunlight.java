package br.com.spectlife.model.plant;

import lombok.Getter;

@Getter
public enum PlantSunlight {
    FULL_SUN ("Completamente no sol"),
    PARTIAL_SHADE ("Parcialmente na sombra"),
    FULL_SHADE("Completamente na sombra");

    private final String description;

    PlantSunlight(String description) {
        this.description = description;
    }
}
