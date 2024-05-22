package br.com.spectlife.model.plant;

import lombok.Getter;

@Getter
public enum PlantSoilType {
    SANDY ("Arenoso"),
    LOAMY ("Argiloso"),
    MUDDY ("Lodoso"),
    HUMIC ("Húmico");

    private final String description;

    PlantSoilType(String description) {
        this.description = description;
    }
}