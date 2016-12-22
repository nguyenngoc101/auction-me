package com.ngocnv.auctionme.daoiplm;

import com.ngocnv.auctionme.dao.ItemDAO;
import com.ngocnv.auctionme.model.Item;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by framgia on 22/12/2016.
 */

@Repository
@Transactional
public class ItemDAOImpl implements ItemDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Item> getAllItems() {

        String query = "select a from ";
        List<Item> items = entityManager.createQuery(query, Item.class).getResultList();
        return null;
    }
}
