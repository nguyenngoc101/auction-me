package com.ngocnv.auctionme.service;

import com.ngocnv.auctionme.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by framgia on 22/12/2016.
 */

@Service
public interface ItemService {

    List<Item> getAllItems();
}
