package com.ngocnv.auctionme.serviceiplm;

import com.ngocnv.auctionme.dao.ItemDAO;
import com.ngocnv.auctionme.dao.UserDao;
import com.ngocnv.auctionme.model.Item;
import com.ngocnv.auctionme.model.User;
import com.ngocnv.auctionme.service.AuctionMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by framgia on 22/12/2016.
 */

@Service("auctionMeService")
class AuctionMeServiceIpml implements AuctionMeService {

    @Autowired
    private ItemDAO itemDao;

    @Autowired
    UserDao userDao;

    @Override public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    @Override
    public User createUser(User user) {
        return userDao.createUser(user);
    }
}
