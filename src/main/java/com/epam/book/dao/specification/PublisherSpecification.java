package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;

public class PublisherSpecification<T> extends AbstractSpecification<T> {

    @Override
    public boolean matchesField(Book book, T value) throws DaoException {

        String publisher = book.getPublisher();
        String comparableValue;

        if (value instanceof String) {
            comparableValue = (String) value;
        } else {
            throw new DaoException("Incorrect type value" + value);
        }

        return publisher.equalsIgnoreCase(comparableValue);
    }

}