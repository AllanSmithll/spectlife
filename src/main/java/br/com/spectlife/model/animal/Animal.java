package br.com.spectlife.model.animal;

import br.com.spectlife.model.Species;
import br.com.spectlife.model.taxonomy.AnimalTaxonomy;
import br.com.spectlife.model.taxonomy.Taxonomy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_animal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal extends Species {
    private String breed;
    private String periodPregnancy;
    @Column(nullable = false)
    private String furPattern;
    @ManyToOne
    @JoinColumn(name = "taxonomy_id")
    private AnimalTaxonomy animalTaxonomy;
}