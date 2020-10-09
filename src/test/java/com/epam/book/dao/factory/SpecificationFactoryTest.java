package com.epam.book.dao.factory;

import com.epam.book.dao.specification.*;
import org.junit.Assert;
import org.junit.Test;

public class SpecificationFactoryTest {

    private final SpecificationFactory factory = new SpecificationFactory();

    @Test
    public void testCreateShouldReturnAuthorSpecificationWhenBookFieldAuthor() {
        //when
        AbstractSpecification specification = factory.create(BookField.AUTHORS);
        Class actualSpecificationClass = specification.getClass();
        //then
        Assert.assertEquals(AuthorSpecification.class, actualSpecificationClass);
    }

    @Test
    public void testCreateShouldReturnPublisherSpecificationWhenBookFieldPublisher() {
        //when
        AbstractSpecification specification = factory.create(BookField.PUBLISHER);
        Class actualSpecificationClass = specification.getClass();
        //then
        Assert.assertEquals(PublisherSpecification.class, actualSpecificationClass);
    }

    @Test
    public void testCreateShouldReturnTitleSpecificationWhenBookFieldTitle() {
        //when
        AbstractSpecification specification = factory.create(BookField.TITLE);
        Class actualSpecificationClass = specification.getClass();
        //then
        Assert.assertEquals(TitleSpecification.class, actualSpecificationClass);
    }

    @Test
    public void testCreateShouldReturnNumPagesSpecificationWhenBookFieldNumPages() {
        //when
        AbstractSpecification specification = factory.create(BookField.NUM_PAGES);
        Class actualSpecificationClass = specification.getClass();
        //then
        Assert.assertEquals(NumPagesSpecification.class, actualSpecificationClass);
    }

    @Test
    public void testCreateShouldReturnYearSpecificationWhenBookFieldYear() {
        //when
        AbstractSpecification specification = factory.create(BookField.YEAR);
        Class actualSpecificationClass = specification.getClass();
        //then
        Assert.assertEquals(YearSpecification.class, actualSpecificationClass);
    }

}