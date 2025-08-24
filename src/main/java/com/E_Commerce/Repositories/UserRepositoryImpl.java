package com.E_Commerce.Repositories;

import com.E_Commerce.Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom  {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Optional<User> findByUserPhone(String phone) {
        TypedQuery<User> query = em.createQuery("SELECT u FROM User where u.phone = :phone", User.class);
        query.setParameter("phone", phone);
        return query.getResultList().stream().findFirst();
    }
}
