package com.ngocnv.auctionme.dao;

import com.ngocnv.auctionme.model.BlogPost;
import com.ngocnv.auctionme.model.Book;
import com.ngocnv.auctionme.model.Publication;

import java.util.List;

/**
 * Created by framgia on 18/01/2017.
 */
public interface PublicationDAO {
    List<Book> getAllBooks();
    List<BlogPost> getAllBlogPosts();
    List<Publication> getAllPublications();
    Book createBook(Book book);
    BlogPost createBlogPost(BlogPost blogPost);
    Publication createPublication(Publication publication);
}
