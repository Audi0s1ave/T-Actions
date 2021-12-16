package com.Tranzactions.services;

import com.Tranzactions.Entity.Tempo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempoService{
    public void addTempo(Tempo s);
}
