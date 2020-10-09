package com.epam.book.data;

import com.epam.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BookCreatorTest {

    private final static String LINE_ONE = "title1 Ivanov Moscow 150 2010";
    private final static String LINE_TWO = "title2 Petrov Moscow 100 2000";
    private final static List<String> LINES = Arrays.asList(LINE_ONE, LINE_TWO);

    private final static Book BOOK_ONE = new Book("title1", "Ivanov", "Moscow", 150, 2010);
    private final static Book BOOK_TWO = new Book("title2", "Petrov", "Moscow", 100, 2000);
    private final static List<Book> BOOKS = Arrays.asList(BOOK_ONE, BOOK_TWO);

    private final BookParser bookParser = new BookParser();
    private final BookCreator bookCreator = new BookCreator(bookParser);

    @Test
    public void testCreateBooksShouldCreateListWhenLines() {
        //when
        List<Book> actual = bookCreator.createBooks(LINES);
        //then
        Assert.assertEquals(BOOKS, actual);
    }

}