package com.darwin.cicdtestje.controller;

import com.darwin.cicdtestje.dto.VraTestVrijdagDTO;
import com.darwin.cicdtestje.service.VraTestVrijdagService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class testVrijdagController {

    @Mock
    private VraTestVrijdagService service;

    @InjectMocks
    private VraTestVrijdagController controller;

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        objectMapper = new ObjectMapper();
    }

//    @Test
//    void testGetVraTestVrijdag() throws Exception {
//        Long id = 1L;
//        VraTestVrijdagDTO dto = new VraTestVrijdagDTO(); // set properties
//
//        given(service.findById(id)).willReturn(dto);
//
//        mockMvc.perform(get("/vraTestVrijdag/{id}", id))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(id));
//    }
//
//    @Test
//    void testCreateVraTestVrijdag() throws Exception {
//        VraTestVrijdagDTO dto = new VraTestVrijdagDTO(); // set properties
//        VraTestVrijdagDTO returnDto = new VraTestVrijdagDTO(); // set properties, including id
//
//        given(service.create(dto)).willReturn(returnDto);
//
//        mockMvc.perform(post("/vraTestVrijdag")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(dto)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").isNotEmpty());
//    }

}
