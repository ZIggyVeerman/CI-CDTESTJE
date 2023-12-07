package com.darwin.cicdtestje.service;

import com.darwin.cicdtestje.dto.VraTestVrijdagDTO;
import com.darwin.cicdtestje.mapper.VraTestVrijdagMapper;
import com.darwin.cicdtestje.model.VraTestVrijdag;
import com.darwin.cicdtestje.repository.VraTestVrijdagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VraTestVrijdagService {
    @Autowired
    private VraTestVrijdagRepository repository;

    @Autowired
    private VraTestVrijdagMapper mapper;

    // CRUD-methoden
    public List<VraTestVrijdagDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    public VraTestVrijdagDTO findById(Long id) {
        return repository.findById(id).map(mapper::toDTO).orElse(null);
    }

    public VraTestVrijdagDTO create(VraTestVrijdagDTO dto) {
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    public VraTestVrijdagDTO update(Long id, VraTestVrijdagDTO dto) {
        VraTestVrijdag entity = mapper.toEntity(dto);
        entity.setId(id); // Zorg ervoor dat de ID behouden blijft
        return mapper.toDTO(repository.save(entity));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}
