package com.darwin.cicdtestje.service;

import com.darwin.cicdtestje.dto.VraTestVrijdagDTO;
import com.darwin.cicdtestje.mapper.VraTestVrijdagMapper;
import com.darwin.cicdtestje.model.VraTestVrijdag;
import com.darwin.cicdtestje.repository.VraTestVrijdagRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

class VraTestVrijdagServiceTest {

    @Mock
    private VraTestVrijdagRepository repository;

    @Mock
    private VraTestVrijdagMapper mapper;

    @InjectMocks
    private VraTestVrijdagService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateVraTestVrijdag() {
        VraTestVrijdagDTO dto = new VraTestVrijdagDTO(); // set properties
        VraTestVrijdag entity = new VraTestVrijdag(); // set properties

        when(mapper.toEntity(dto)).thenReturn(entity);
        when(repository.save(entity)).thenReturn(entity);
        when(mapper.toDTO(entity)).thenReturn(dto);

        VraTestVrijdagDTO result = service.create(dto);

        assertNotNull(result);
        // Additional assertions
    }

    @Test
    void testFindById() {
        Long id = 1L;
        VraTestVrijdag entity = new VraTestVrijdag(); // set properties
        VraTestVrijdagDTO dto = new VraTestVrijdagDTO(); // set properties

        when(repository.findById(id)).thenReturn(Optional.of(entity));
        when(mapper.toDTO(entity)).thenReturn(dto);

        VraTestVrijdagDTO result = service.findById(id);

        assertNotNull(result);
        // Additional assertions
    }
}
