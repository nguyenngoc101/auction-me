package com.ngocnv.auctionme.daoiplm;

import com.ngocnv.auctionme.dao.PublicationDAO;
import com.ngocnv.auctionme.model.BlogPost;
import com.ngocnv.auctionme.model.Book;
import com.ngocnv.auctionme.model.Publication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by framgia on 18/01/2017.
 */

@Service
@Transactional
public class PublicationDaoImpl implements PublicationDAO {

    @PersistenceContext EntityManager entityManager;

    @Override
    public List<Book> getAllBooks() {
        return entityManager.createQuery("SELECT b from Book b").getResultList();
    }

    @Override
    public List<BlogPost> getAllBlogPosts() {
        return entityManager.createQuery("SELECT b from BlogPost b").getResultList();
    }

    @Override
    public List<Publication> getAllPublications() {
        return entityManager.createQuery("SELECT p from Publication p").getResultList();
    }

    @Override
    public Book createBook(Book book) {
        if(book.getId() != null) {
            Book existedBook = entityManager.find(Book.class, book.getId());
            if (existedBook != null) {
                return existedBook;
            }
        }

        entityManager.persist(book);
        entityManager.close();
        return book;
    }

    @Override
    public BlogPost createBlogPost(BlogPost blogPost) {
        if (blogPost.getId() != null) {
            BlogPost existedBlogPost = entityManager.find(BlogPost.class, blogPost.getId());
            if (existedBlogPost != null) {
                return existedBlogPost;
            }
        }

        entityManager.persist(blogPost);
        entityManager.close();
        return blogPost;
    }

    @Override
    public Publication createPublication(Publication publication) {
        if (publication.getId() != null) {
            Publication existedPublication = entityManager.find(Publication.class, publication.getId());
            if (existedPublication != null) {
                return existedPublication;
            }
        }

        entityManager.persist(publication);
        entityManager.close();
        return publication;
    }

}
