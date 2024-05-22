package br.com.spectlife.model.taxonomy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlantTaxonomy extends Taxonomy {
    private String division;
}