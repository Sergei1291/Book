package com.epam.book.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FileDataAcquirerTest {

    private final static String DATA = "src/test/resources/dataFileDataAcquirerTest.txt";
    private final static String FILE_NOT_EXIST = "src/test/resources/doesNotExist.txt";

    private final static String FIRST_LINE = "aaa aaa aaa";
    private final static String SECOND_LINE = "aaa";
    private final static String THIRD_LINE = "asd";
    private final static List<String> LINES = Arrays.asList(FIRST_LINE, SECOND_LINE, THIRD_LINE);

    @Test
    public void testReadShouldReadFile() throws DataException {
        //given
        FileDataAcquirer dataAcquirer = new FileDataAcquirer(DATA);
        //when
        List<String> actual = dataAcquirer.read();
        //then
        Assert.assertEquals(LINES, actual);
    }

    @Test(expected = DataException.class)//then
    public void testCreateShouldThrewDataExceptionWhenFileNotExist() throws DataException {
        //given
        FileDataAcquirer dataAcquirer = new FileDataAcquirer(FILE_NOT_EXIST);
        //when
        dataAcquirer.read();
    }

}