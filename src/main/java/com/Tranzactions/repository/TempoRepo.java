package com.Tranzactions.repository;


import com.Tranzactions.Entity.Tempo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class TempoRepo {
    @PersistenceContext
    EntityManager entityManager;
    public void update(Tempo s)
    {
        entityManager.merge(s);
    }

}
