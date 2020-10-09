package com.epam.book.dao.comparator;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class TitleBookComparatorTest {

    private final static Book BOOK_ONE = new Book("a", null, null, 0, 0);
    private final static Book BOOK_TWO = new Book("b", null, null, 0, 0);
    private final static Book BOOK_THREE = new Book("a", null, null, 0, 0);
    private final static Book BOOK_TITLE_NULL = new Book(null, null, null, 0, 0);

    private final TitleBookComparator comparator = new TitleBookComparator();

    @Test
    public void testCompareShouldReturnNegativeWhenTitleNullTitleNotNull() {
        //when
        int actual = comparator.compare(BOOK_TITLE_NULL, BOOK_ONE);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenTitleNotNullTitleNull() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_TITLE_NULL);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenTitleNullTitleNull() {
        //when
        int actual = comparator.compare(BOOK_TITLE_NULL, BOOK_TITLE_NULL);
        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void testCompareShouldReturnNegativeWhenTitleOneLessTitleTwo() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_TWO);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenTitleOneLessTitleTwo() {
        //when
        int actual = comparator.compare(BOOK_TWO, BOOK_ONE);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenTitleOneEqualTitleThree() {
        //when
        int actual = comparator.compare(BOOK_THREE, BOOK_ONE);
        //then
        Assert.assertTrue(actual == 0);
    }

}