package com.epam.book.dao;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BookDaoTest {

    public final static Book BOOK_ONE = new Book("title1", "author1", "publisher1", 100, 2001);
    public final static Book BOOK_TWO = new Book("title2", "author2", "publisher2", 100, 2001);
    public final static Book BOOK_REMOVED = new Book("title", "author", "publisher", 100, 2001);

    private final static List<Book> BOOKS = Arrays.asList(BOOK_ONE, BOOK_TWO);

    @Test
    public void testAddShouldAddBook() throws DaoException {
        //given
        BookDao bookDao = new BookDao();
        int initialSize = bookDao.size();
        //when
        bookDao.add(BOOK_ONE);
        int endSize = bookDao.size();
        //then
        Assert.assertTrue(initialSize != endSize);
    }

    @Test
    public void testAddShouldAddListBook() throws DaoException {
        //given
        BookDao bookDao = new BookDao();
        int initialSize = bookDao.size();
        //when
        bookDao.add(BOOKS);
        int endSize = bookDao.size();
        //then
        Assert.assertTrue(initialSize != endSize);
    }

    @Test(expected = DaoException.class)//then
    public void testAddShouldThrewExceptionWhenBookDaoContainsAppendedBook() throws DaoException {
        //given
        BookDao bookDao = new BookDao();
        bookDao.add(BOOK_ONE);
        //when
        bookDao.add(BOOK_ONE);
    }

    @Test(expected = DaoException.class)//then
    public void testAddShouldThrewExceptionWhenBookDaoContainsAppendedBookFromList() throws DaoException {
        //given
        BookDao bookDao = new BookDao();
        bookDao.add(BOOK_ONE);
        //when
        bookDao.add(BOOKS);
    }

    @Test
    public void testRemoveShouldRemoveBook() throws DaoException {
        //given
        BookDao bookDao = new BookDao();
        bookDao.add(BOOKS);
        int initialSize = bookDao.size();
        //when
        bookDao.remove(BOOK_ONE);
        int endSize = bookDao.size();
        //then
        Assert.assertTrue(initialSize != endSize);
    }

    @Test(expected = DaoException.class)//then
    public void testRemoveShouldThrewExceptionWhenBookDaoNotContainRemovedBook() throws DaoException {
        //given
        BookDao bookDao = new BookDao();
        bookDao.add(BOOKS);
        //when
        bookDao.remove(BOOK_REMOVED);
    }

}