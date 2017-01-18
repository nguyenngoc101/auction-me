package com.ngocnv.auctionme.daoiplm;

import com.ngocnv.auctionme.dao.UserDao;
import com.ngocnv.auctionme.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by ngocnv on 08/01/2017.
 */

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User createUser(User user) {
        User u = entityManager.find(User.class, user);
        if (u != null) return u;

        entityManager.persist(user);
        entityManager.close();

        return user;
    }
}
