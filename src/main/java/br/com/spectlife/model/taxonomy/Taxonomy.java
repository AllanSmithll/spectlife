package br.com.spectlife.model.taxonomy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_taxonomy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Taxonomy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String domain;

    @Column(nullable = false)
    private String kingdom;

    @Column(nullable = false)
    private String className;

    @Column(nullable = false)
    private String orderName;

    @Column(nullable = false)
    private String family;

    @Column(nullable = false)
    private String genus;
}
