package br.com.spectlife.model.animal;

import lombok.Getter;

@Getter
public enum TypeReprodution {
    AEXUAL("Assexual"),
    SEXUAL("Sexual"),
    ALTERNANCE_GENERATIONS("Alternância de gerações"),
    GENIC_RECOMBINATION("Recombinação gênica");

    private final String description;

    TypeReprodution(String description) {
        this.description = description;
    }
}
