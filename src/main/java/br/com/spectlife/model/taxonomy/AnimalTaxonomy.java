package br.com.spectlife.model.taxonomy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AnimalTaxonomy extends Taxonomy {
    @Column(nullable = false)
    private String phylum;
    private String subPhylum;
}
