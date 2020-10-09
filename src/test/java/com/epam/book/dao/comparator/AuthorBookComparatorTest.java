package com.epam.book.dao.comparator;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class AuthorBookComparatorTest {

    private final static Book BOOK_ONE = new Book(null, "a", null, 0, 0);
    private final static Book BOOK_TWO = new Book(null, "b", null, 0, 0);
    private final static Book BOOK_THREE = new Book(null, "a", null, 0, 0);
    private final static Book BOOK_AUTHOR_NULL = new Book(null, null, null, 0, 0);

    private final AuthorBookComparator comparator = new AuthorBookComparator();

    @Test
    public void testCompareShouldReturnNegativeWhenAuthorNullAuthorNotNull() {
        //when
        int actual = comparator.compare(BOOK_AUTHOR_NULL, BOOK_ONE);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenAuthorNotNullAuthorNull() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_AUTHOR_NULL);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenAuthorNullAuthorNull() {
        //when
        int actual = comparator.compare(BOOK_AUTHOR_NULL, BOOK_AUTHOR_NULL);
        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void testCompareShouldReturnNegativeWhenAuthorOneLessAuthorTwo() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_TWO);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenAuthorOneLessAuthorTwo() {
        //when
        int actual = comparator.compare(BOOK_TWO, BOOK_ONE);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenAuthorOneEqualAuthorThree() {
        //when
        int actual = comparator.compare(BOOK_THREE, BOOK_ONE);
        //then
        Assert.assertTrue(actual == 0);
    }

}