package br.com.spectlife.model.animal;

import lombok.Getter;

@Getter
public enum TypeFood {
    PHOTOSYNTHESIS("Fotossíntese"),
    CHEMOSYNTHESIS("Quimiossíntese"),
    CARNIVORE("Carnívoro"),
    HERBIVORES("Herbívoro"),
    OMNIVORE("Onívoro"),
    PARASITE("Parasita");

    private final String description;

    TypeFood(String description) {
        this.description = description;
    }

}
