package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class TitleSpecificationTest {

    private final static Book BOOK = new Book("title", "author", "publisher", 10, 2020);
    private final TitleSpecification specification = new TitleSpecification();

    @Test
    public void testMatchesFieldShouldTrueWhenBookFieldTitleEqualIgnoreCaseValue() throws DaoException {
        //given
        String value = "title";
        //when
        boolean actual = specification.matchesField(BOOK, value);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testMatchesFieldShouldFalseWhenBookFieldTitleNotEqualValue() throws DaoException {
        //given
        String value = "A";
        //when
        boolean actual = specification.matchesField(BOOK, value);
        //then
        Assert.assertFalse(actual);
    }

    @Test(expected = DaoException.class)//then
    public void testMatchesFieldShouldThrewDaoExceptionWhenValueTypeNotInstanceOfBookFieldTitleType() throws DaoException {
        //given
        Integer value = 0;
        //when
        specification.matchesField(BOOK, value);
    }

}