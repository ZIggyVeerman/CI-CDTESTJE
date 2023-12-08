package com.darwin.cicdtestje.controller;

import com.darwin.cicdtestje.dto.VraTestVrijdagDTO;
import com.darwin.cicdtestje.service.VraTestVrijdagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/VraTest")
public class VraTestVrijdagController {
    @Autowired
    private VraTestVrijdagService service;

    @GetMapping
    public ResponseEntity<List<VraTestVrijdagDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VraTestVrijdagDTO> findById(@PathVariable Long id) {
        VraTestVrijdagDTO dto = service.findById(id);
        if (dto != null) {
            return ResponseEntity.ok(dto);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<VraTestVrijdagDTO> create(@RequestBody VraTestVrijdagDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VraTestVrijdagDTO> update(@PathVariable Long id, @RequestBody VraTestVrijdagDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
