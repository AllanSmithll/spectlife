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
    @Column(nullable = false, columnDefinition = "varchar(12) default 'Desconhecido'")
    private String averageLength;
    @Column(columnDefinition = "varchar(12) default 'Desconhecido'")
    private String averageWidth;
    @Column(columnDefinition = "varchar(12) default 'Desconhecido'")
    private String averageHeight;
    @Column(nullable = false)
    private String urlImg;
    @Column(columnDefinition = "varchar(256) default 'Sem descrição'")
    private String additionalDetails;
}
