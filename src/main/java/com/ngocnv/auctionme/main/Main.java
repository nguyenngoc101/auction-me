package com.ngocnv.auctionme.main;

import com.ngocnv.auctionme.config.SpringConfiguration;
import com.ngocnv.auctionme.model.Item;
import com.ngocnv.auctionme.service.ItemService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

/**
 * Created by framgia on 22/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ItemService itemService = (ItemService) context.getBean("itemService");
        List<Item> items = itemService.getAllItems();
        items.forEach(item -> {
            System.out.print(item.getName() + " " + item.getCode());
        });

    }
}
