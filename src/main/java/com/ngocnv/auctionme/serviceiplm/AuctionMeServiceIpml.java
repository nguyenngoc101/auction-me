package com.ngocnv.auctionme.serviceiplm;

import com.ngocnv.auctionme.dao.ItemDAO;
import com.ngocnv.auctionme.dao.PublicationDAO;
import com.ngocnv.auctionme.dao.UserDao;
import com.ngocnv.auctionme.model.*;
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

    @Autowired
    PublicationDAO publicationDAO;

    @Override public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    @Override
    public User createUser(User user) {
        return userDao.createUser(user);
    }

    @Override
    public List<Book> getAllBooks() {
        return publicationDAO.getAllBooks();
    }

    @Override public Book createBook(Book book) {
        return publicationDAO.createBook(book);
    }

    @Override public BlogPost createBlogPost(BlogPost blogPost) {
        return publicationDAO.createBlogPost(blogPost);
    }

    @Override public Publication createPublication(Publication publication) {
        return publicationDAO.createPublication(publication);
    }
}
