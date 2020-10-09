package com.epam.book.data;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookParserTest {

    private final static String LINE = "titleBook Ivanov Moscow 100 2020";

    private final static String TITLE = "titleBook";
    private final static String AUTHOR = "Ivanov";
    private final static String PUBLISHER = "Moscow";
    private final static int NUM_PAGES = 100;
    private final static int YEAR = 2020;

    private final static Book BOOK = new Book(TITLE, AUTHOR, PUBLISHER, NUM_PAGES, YEAR);

    private final BookParser bookParser = new BookParser();

    @Test
    public void testParseShouldReturnBookWhenLine() {
        //when
        Book actual = bookParser.parse(LINE);
        //then
        Assert.assertEquals(BOOK, actual);
    }

}