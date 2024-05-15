package br.com.spectlife.model;

import br.com.spectlife.model.animal.Locomotion;
import br.com.spectlife.model.animal.TypeFood;
import br.com.spectlife.model.animal.TypeReprodution;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String scientificName;
    @Column(nullable = false)
    private String commonName;
    @Column(nullable = false)
    private String habitat;
    @Column(nullable = false)
    private String geographicDistribution;
    private String originRegion;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Locomotion locomotion;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeFood typeFood;
    @Column(nullable = false)
    private String hopeLife;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeReprodution typeReproduction;
    @Column(nullable = false)
    private String mainColors;
    @Column(nullable = false)
    private String averageLength;
    private String averageWidth;
    private String averageHeight;
    private String urlImg;
    private String additionalDetails;
}
