package com.epam.book.dao.comparator;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class PublisherBookComparatorTest {

    private final static Book BOOK_ONE = new Book(null, null, "a", 0, 0);
    private final static Book BOOK_TWO = new Book(null, null, "b", 0, 0);
    private final static Book BOOK_THREE = new Book(null, null, "a", 0, 0);
    private final static Book BOOK_PUBLISHER_NULL = new Book(null, null, null, 0, 0);

    private final PublisherBookComparator comparator = new PublisherBookComparator();

    @Test
    public void testCompareShouldReturnNegativeWhenPublisherNullPublisherNotNull() {
        //when
        int actual = comparator.compare(BOOK_PUBLISHER_NULL, BOOK_ONE);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenPublisherNotNullPublisherNull() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_PUBLISHER_NULL);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenPublisherNullPublisherNull() {
        //when
        int actual = comparator.compare(BOOK_PUBLISHER_NULL, BOOK_PUBLISHER_NULL);
        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void testCompareShouldReturnNegativeWhenPublisherOneLessPublisherTwo() {
        //when
        int actual = comparator.compare(BOOK_ONE, BOOK_TWO);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenPublisherOneLessPublisherTwo() {
        //when
        int actual = comparator.compare(BOOK_TWO, BOOK_ONE);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenPublisherOneEqualPublisherThree() {
        //when
        int actual = comparator.compare(BOOK_THREE, BOOK_ONE);
        //then
        Assert.assertTrue(actual == 0);
    }

}