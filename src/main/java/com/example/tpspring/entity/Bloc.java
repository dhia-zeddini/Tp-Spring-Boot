package com.example.tpspring.entity;
import jakarta.persistence.*;

import lombok.*;

import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")
    private Set<Chambre> chambres;

    @ManyToOne
    private Foyer foyer;
}
