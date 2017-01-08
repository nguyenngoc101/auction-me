package com.ngocnv.auctionme.service;

import com.ngocnv.auctionme.model.Item;
import com.ngocnv.auctionme.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by framgia on 22/12/2016.
 * Mostly used as a facade so all controllers have a single point of entry
 */

@Service
public interface AuctionMeService {

    List<Item> getAllItems();
    User createUser(User user);
}
