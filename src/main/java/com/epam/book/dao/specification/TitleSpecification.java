package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;

public class TitleSpecification<T> extends AbstractSpecification<T> {

    @Override
    public boolean matchesField(Book book, T value) throws DaoException {

        String title = book.getTitle();
        String comparableValue;

        if (value instanceof String) {
            comparableValue = (String) value;
        } else {
            throw new DaoException("Incorrect type value" + value);
        }

        return title.equalsIgnoreCase(comparableValue);
    }

}