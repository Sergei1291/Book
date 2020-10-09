package com.epam.book.dao;

import com.epam.book.dao.factory.BookField;
import com.epam.book.model.Book;

import java.util.List;

public interface Dao {

    void add(Book book) throws DaoException;

    void add(List<Book> books) throws DaoException;

    void remove(Book book) throws DaoException;

    <T> List<Book> findByTag(BookField field, T name) throws DaoException;

    List<Book> sortByTag(BookField field);

}