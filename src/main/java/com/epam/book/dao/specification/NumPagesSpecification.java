package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;

public class NumPagesSpecification<T> extends AbstractSpecification<T> {

    @Override
    public boolean matchesField(Book book, T value) throws DaoException {

        int numPages = book.getNumPages();
        int comparableValue;

        if (value instanceof Integer) {
            comparableValue = (Integer) value;
        } else {
            throw new DaoException("Incorrect type value" + value);
        }

        return numPages == comparableValue;
    }

}