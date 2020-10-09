package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean matchesField(Book book, T value) throws DaoException;

    @Override
    public List<Book> find(List<Book> books, T value) throws DaoException {

        List<Book> searchedBooks = new ArrayList<Book>();

        for (Book book : books) {

            if (matchesField(book, value)) {
                searchedBooks.add(book);
            }

        }

        return searchedBooks;
    }

}