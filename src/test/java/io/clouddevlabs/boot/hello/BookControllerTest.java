package io.clouddevlabs.boot.hello;

import io.clouddevlabs.boot.hello.model.Book;
import io.clouddevlabs.boot.hello.repositories.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookControllerTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testCreateAndFindAllBooks() {
        bookRepository.save(new Book("test"));

        Iterable<Book> all = bookRepository.findAll();

        int count = 0;
        boolean hasTest = false;
        for (Book b : all) {
            count++;
            if (b.name.equals("test")) {
                hasTest = true;
            }
        }

        Assert.assertEquals(4, count);
        Assert.assertTrue(hasTest);
    }

    @Test
    public void testFindByName() {
        bookRepository.save(new Book("test2"));
        List<Book> res = bookRepository.findByName("test2");
        Assert.assertEquals(1, res.size());
    }
}