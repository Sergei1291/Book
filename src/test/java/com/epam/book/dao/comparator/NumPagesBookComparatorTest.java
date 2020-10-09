package com.epam.book.dao.comparator;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class NumPagesBookComparatorTest {

    private final static Book BOOK_ONE = new Book(null, null, null, 0, 10);
    private final static Book BOOK_TWO = new Book(null, null, null, 0, 20);
    private final static Book BOOK_THREE = new Book(null, null, null, 0, 10);

    private final NumPagesBookComparator comparator = new NumPagesBookComparator();

    @Test
    public void testCompareShouldReturnNegativeWhenNumPagesOneLessNumPagesTwo() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_TWO);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenNumPagesOneLessNumPagesTwo() {
        //when
        int actual = comparator.compare(BOOK_TWO, BOOK_ONE);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenNumPagesOneEqualNumPagesThree() {
        //when
        int actual = comparator.compare(BOOK_THREE, BOOK_ONE);
        //then
        Assert.assertTrue(actual == 0);
    }

}