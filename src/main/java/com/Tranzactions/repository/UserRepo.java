package com.Tranzactions.repository;

import org.springframework.stereotype.Repository;
import com.Tranzactions.Entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserRepo {
    @PersistenceContext
    EntityManager entityManager;
    public void update(User u)
    {
        entityManager.merge(u);
    }
}
