package com.epam.book.main;

import com.epam.book.dao.BookDao;
import com.epam.book.dao.DaoException;
import com.epam.book.data.*;
import com.epam.book.dao.factory.BookField;
import com.epam.book.model.Book;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    private final static String FILE_DATA = "data.txt";

    public static void main(String[] args) {

        try {
            process();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    private static void process() throws DataException, DaoException {

        LOGGER.info("start Main");

        LOGGER.info("read data from file");
        FileDataAcquirer dataAcquirer = new FileDataAcquirer(FILE_DATA);
        List<String> data = dataAcquirer.read();

        LOGGER.info("create list Book");
        BookParser bookParser = new BookParser();
        BookCreator bookCreator = new BookCreator(bookParser);
        List<Book> dataBooks = bookCreator.createBooks(data);

        LOGGER.info("create BookDao and put list Book there");
        BookDao bookDao = new BookDao();
        bookDao.add(dataBooks);

        LOGGER.info("sort BookDao by authors");
        bookDao.sortByTag(BookField.AUTHORS);

        LOGGER.info("find books by year");
        List<Book> searchedBooks = bookDao.findByTag(BookField.YEAR, 2019);

        LOGGER.info("finish Main");

    }

}