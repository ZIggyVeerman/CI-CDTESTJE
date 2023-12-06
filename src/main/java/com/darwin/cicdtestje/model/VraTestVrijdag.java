package com.darwin.cicdtestje.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "VRA_TEST_VRIJDAG")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VraTestVrijdag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_vrijdag_seq_gen")
    @SequenceGenerator(name = "test_vrijdag_seq_gen", sequenceName = "TEST_VRIJDAG", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Size(max = 100)
    @Column(name = "VOORNAAM", length = 100)
    private String voornaam;

    @Size(max = 100)
    @Column(name = "STRAAT", length = 100)
    private String straat;

    @Size(max = 20)
    @Column(name = "HUISNUMMER", length = 20)
    private String huisnummer;

    @Size(max = 100)
    @Column(name = "WOONPLAATS", length = 100)
    private String woonplaats;

    @Size(max = 100)
    @Column(name = "NAAM", length = 100)
    private String naam;
}