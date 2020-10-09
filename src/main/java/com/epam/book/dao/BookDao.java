package com.epam.book.dao;

import com.epam.book.dao.factory.BookField;
import com.epam.book.dao.factory.ComparatorFactory;
import com.epam.book.dao.factory.SpecificationFactory;
import com.epam.book.dao.specification.AbstractSpecification;
import com.epam.book.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookDao implements Dao {

    private final SpecificationFactory specificationFactory = new SpecificationFactory();
    private final ComparatorFactory comparatorfactory = new ComparatorFactory();
    private final List<Book> books = new ArrayList<Book>();

    @Override
    public void add(Book book) throws DaoException {

        if (books.contains(book)) {
            throw new DaoException("list of books has book");
        }

        books.add(book);

    }

    @Override
    public void add(List<Book> books) throws DaoException {

        for (Book currentBook : books) {
            add(currentBook);
        }

    }

    @Override
    public void remove(Book book) throws DaoException {

        if (!books.contains(book)) {
            throw new DaoException("list of books has not book");
        }

        books.remove(book);

    }

    @Override
    public <T> List<Book> findByTag(BookField field, T name) throws DaoException {

        AbstractSpecification specification = specificationFactory.create(field);

        return specification.find(books, name);
    }

    @Override
    public List<Book> sortByTag(BookField field) {

        List<Book> sortedBooks = new ArrayList<>();
        sortedBooks.addAll(books);

        Comparator comparator = comparatorfactory.create(field);
        Collections.sort(sortedBooks, comparator);

        return sortedBooks;
    }

    public int size() {

        return books.size();
    }

}