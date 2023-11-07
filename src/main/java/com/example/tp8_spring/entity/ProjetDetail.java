package com.example.tp8_spring.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPd;

    private String description;
    private String technologie;
    private Long cout;
    private Date dateDebut;

    @OneToOne(mappedBy = "projetDetail")
    private  Projet projet;
}
