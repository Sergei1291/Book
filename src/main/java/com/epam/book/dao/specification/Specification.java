package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;

import java.util.List;

public interface Specification<T> {

    List<Book> find(List<Book> books, T value) throws DaoException;

}