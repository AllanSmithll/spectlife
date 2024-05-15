package br.com.spectlife.model.animal;

import lombok.Getter;

@Getter
public enum Locomotion {
    TERESTRIAL("Terrestre"),
    AQUATIC("Aquático"),
    FLYING("Voador");

    private final String description;

    Locomotion(String description) {
        this.description = description;
    }

}
