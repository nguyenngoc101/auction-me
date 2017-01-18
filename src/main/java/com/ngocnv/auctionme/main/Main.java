package com.ngocnv.auctionme.main;

import com.ngocnv.auctionme.config.RootConfig;
import com.ngocnv.auctionme.config.SpringConfiguration;
import com.ngocnv.auctionme.model.*;
import com.ngocnv.auctionme.service.AuctionMeService;
import com.ngocnv.auctionme.web.HomeController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Date;
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

//        Address homeAddress = new Address("Ha Noi", "Lang", "0084");
//        //Address billingAddress = new Address("Ha Noi", "Ung Hoa", "Noi Xa");
//        User user = new User();
//        user.setName("ngocnv1");;
//        user.setAge("18");
//        user.setHomeAddress(homeAddress);
        //user.setBillingAddress(billingAddress);
//        auctionMeService.createUser(user);

        Book book = new Book();
        book.setPages(12);
        book.setPublishingDate(new Date());
        book.setTitle("Design Pattern");
        book.setVersion(1);

        Book book1 = new Book();
        book1.setPages(25);
        book1.setPublishingDate(new Date());
        book1.setTitle("Data Structure and Algorithms");
        book1.setVersion(1);

        auctionMeService.createBook(book);
        auctionMeService.createBook(book1);

//        BlogPost post1 = new BlogPost();
//        post1.setVersion(1);
//        post1.setTitle("Learn Java");
//        post1.setPublishingDate(new Date());
//        post1.setUrl("http://www.vnexpress.net");
//
//        BlogPost post2 = new BlogPost();
//        post2.setVersion(1);
//        post2.setTitle("Why to be a coder");
//        post2.setPublishingDate(new Date());
//        post2.setUrl("http://www.stackoverflow.com");
//
//        auctionMeService.createBlogPost(post1);
//        auctionMeService.createBlogPost(post2);
        context.close();

    }
}
