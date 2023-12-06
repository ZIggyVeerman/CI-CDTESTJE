package com.darwin.cicdtestje.repository;

import com.darwin.cicdtestje.model.VraTestVrijdag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VraTestVrijdagRepository extends JpaRepository<VraTestVrijdag, Long> {

}
