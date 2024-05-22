package br.com.spectlife.model.plant;

import lombok.Getter;

@Getter
public enum PlantWaterNeeds {
    LOW("Baixa"),
    MODERATE("Moderada"),
    HIGH("Alta");

    private final String description;

    PlantWaterNeeds(String description) {
        this.description = description;
    }
}