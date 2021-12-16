package com.Tranzactions.services;

import com.Tranzactions.Entity.Tempo;
import com.Tranzactions.repository.TempoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempoServiceImpl implements TempoService{
    @Autowired
    TempoRepo tempoRepo;

    @Override
    public void addTempo(Tempo s) {
        tempoRepo.update(s);
    }
}
