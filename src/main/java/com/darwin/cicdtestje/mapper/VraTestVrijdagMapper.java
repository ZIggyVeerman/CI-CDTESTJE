package com.darwin.cicdtestje.mapper;

import com.darwin.cicdtestje.dto.VraTestVrijdagDTO;
import com.darwin.cicdtestje.model.VraTestVrijdag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VraTestVrijdagMapper {
    VraTestVrijdagDTO toDTO(VraTestVrijdag vraTestVrijdag);

    VraTestVrijdag toEntity(VraTestVrijdagDTO vraTestVrijdagDTO);
}
