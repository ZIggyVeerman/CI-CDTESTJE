package com.darwin.cicdtestje.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VraTestVrijdagDTO {
    private Long id;
    private String voornaam;
    private String straat;
    private String huisnummer;
    private String woonplaats;
    private String naam;
}
