package com.epam.book.dao.factory;

import com.epam.book.dao.comparator.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class ComparatorFactoryTest {

    private final ComparatorFactory factory = new ComparatorFactory();

    @Test
    public void testCreateShouldReturnAuthorBookComparatorWhenBookFieldAuthor() {
        //when
        Comparator comparator = factory.create(BookField.AUTHORS);
        Class actualComparatorClass = comparator.getClass();
        //then
        Assert.assertEquals(AuthorBookComparator.class, actualComparatorClass);
    }

    @Test
    public void testCreateShouldReturnPublisherBookComparatorWhenBookFieldPublisher() {
        //when
        Comparator comparator = factory.create(BookField.PUBLISHER);
        Class actualComparatorClass = comparator.getClass();
        //then
        Assert.assertEquals(PublisherBookComparator.class, actualComparatorClass);
    }

    @Test
    public void testCreateShouldReturnTitleBookComparatorWhenBookFieldTitle() {
        //when
        Comparator comparator = factory.create(BookField.TITLE);
        Class actualComparatorClass = comparator.getClass();
        //then
        Assert.assertEquals(TitleBookComparator.class, actualComparatorClass);
    }

    @Test
    public void testCreateShouldReturnNumPagesBookComparatorWhenBookFieldNumPages() {
        //when
        Comparator comparator = factory.create(BookField.NUM_PAGES);
        Class actualComparatorClass = comparator.getClass();
        //then
        Assert.assertEquals(NumPagesBookComparator.class, actualComparatorClass);
    }

    @Test
    public void testCreateShouldReturnYearBookComparatorWhenBookFieldYear() {
        //when
        Comparator comparator = factory.create(BookField.YEAR);
        Class actualComparatorClass = comparator.getClass();
        //then
        Assert.assertEquals(YearBookComparator.class, actualComparatorClass);
    }

}