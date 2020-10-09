package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class NumPagesSpecificationTest {

    private final static Book BOOK = new Book("title", "author", "publisher", 10, 2020);
    private final NumPagesSpecification specification = new NumPagesSpecification();

    @Test
    public void testMatchesFieldShouldTrueWhenBookFieldNumPagesEqualValue() throws DaoException {
        //given
        int value = 2020;
        //when
        boolean actual = specification.matchesField(BOOK, value);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testMatchesFieldShouldFalseWhenBookFieldNumPagesNotEqualValue() throws DaoException {
        //given
        int value = 0;
        //when
        boolean actual = specification.matchesField(BOOK, value);
        //then
        Assert.assertFalse(actual);
    }

    @Test(expected = DaoException.class)//then
    public void testMatchesFieldShouldThrewDaoExceptionWhenValueTypeNotInstanceOfBookFieldNumPagesType() throws DaoException {
        //given
        String value = "";
        //when
        specification.matchesField(BOOK, value);
    }

}