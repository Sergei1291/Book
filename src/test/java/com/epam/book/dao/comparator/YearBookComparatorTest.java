package com.epam.book.dao.comparator;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class YearBookComparatorTest {

    private final static Book BOOK_ONE = new Book(null, null, null, 2000, 0);
    private final static Book BOOK_TWO = new Book(null, null, null, 2020, 0);
    private final static Book BOOK_THREE = new Book(null, null, null, 2000, 0);

    private final YearBookComparator comparator = new YearBookComparator();

    @Test
    public void testCompareShouldReturnNegativeWhenYearOneLessYearTwo() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_TWO);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenYearOneLessYearTwo() {
        //when
        int actual = comparator.compare(BOOK_TWO, BOOK_ONE);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenYearOneEqualYearThree() {
        //when
        int actual = comparator.compare(BOOK_THREE, BOOK_ONE);
        //then
        Assert.assertTrue(actual == 0);
    }

}