package br.com.spectlife.model.plant;

import br.com.spectlife.model.Species;
import br.com.spectlife.model.taxonomy.PlantTaxonomy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_plant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plant extends Species {
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PlantSunlight sunlight;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PlantWaterNeeds waterNeeds;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PlantSoilType soilType;

    @Column(nullable = false)
    private String growthHabit; // Describes plant's form (e.g., tree, shrub, herb)

    @Column(nullable = false)
    private String leafType; // Describes leaf shape (e.g., simple, compound)

    @ManyToOne
    @JoinColumn(name = "taxonomy_id")
    private PlantTaxonomy plantTaxonomy;

    private String floweringTime; // Season or month of flowering
    private String pollinationType; // Wind, insect, etc.
}