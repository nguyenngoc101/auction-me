package com.ngocnv.auctionme.main;

import com.ngocnv.auctionme.config.SpringConfiguration;
import com.ngocnv.auctionme.model.Item;
import com.ngocnv.auctionme.service.AuctionMeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

/**
 * Created by framgia on 22/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AuctionMeService auctionMeService = (AuctionMeService) context.getBean("auctionMeService");
        List<Item> items = auctionMeService.getAllItems();
//        auctionMeService.forEach(item -> {
//            System.out.println(item.getName() + " " + item.getCode());
//        });

        for (Item item: items) {
            System.out.println(item.getName() + " " + item.getCode());
        }
        context.close();

    }
}
