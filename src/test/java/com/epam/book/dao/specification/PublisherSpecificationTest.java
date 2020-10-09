package com.epam.book.dao.specification;

import com.epam.book.dao.DaoException;
import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class PublisherSpecificationTest {

    private final static Book BOOK = new Book("title", "author", "publisher", 10, 2020);
    private final PublisherSpecification specification = new PublisherSpecification();

    @Test
    public void testMatchesFieldShouldTrueWhenBookFieldPublisherEqualIgnoreCaseValue() throws DaoException {
        //given
        String value = "Publisher";
        //when
        boolean actual = specification.matchesField(BOOK, value);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testMatchesFieldShouldFalseWhenBookFieldPublisherNotEqualValue() throws DaoException {
        //given
        String value = "A";
        //when
        boolean actual = specification.matchesField(BOOK, value);
        //then
        Assert.assertFalse(actual);
    }

    @Test(expected = DaoException.class)//then
    public void testMatchesFieldShouldThrewDaoExceptionWhenValueTypeNotInstanceOfBookFieldPublisherType() throws DaoException {
        //given
        Integer value = 0;
        //when
        specification.matchesField(BOOK, value);
    }

}