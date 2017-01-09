package com.ngocnv.auctionme.main;

import com.ngocnv.auctionme.config.RootConfig;
import com.ngocnv.auctionme.config.SpringConfiguration;
import com.ngocnv.auctionme.model.Address;
import com.ngocnv.auctionme.model.Item;
import com.ngocnv.auctionme.model.User;
import com.ngocnv.auctionme.service.AuctionMeService;
import com.ngocnv.auctionme.web.HomeController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

/**
 * Created by framgia on 22/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        AuctionMeService auctionMeService = (AuctionMeService) context.getBean("auctionMeService");
//        List<Item> items = auctionMeService.getAllItems();
//        items.forEach(item -> {
//            System.out.println(item.getName() + " " + item.getCode());
//        });

        Address homeAddress = new Address("Ha Noi", "Lang", "0084");
        //Address billingAddress = new Address("Ha Noi", "Ung Hoa", "Noi Xa");
        User user = new User();
        user.setName("ngocnv1");;
        user.setAge("18");
        user.setHomeAddress(homeAddress);
        //user.setBillingAddress(billingAddress);
        auctionMeService.createUser(user);

        context.close();

    }
}
