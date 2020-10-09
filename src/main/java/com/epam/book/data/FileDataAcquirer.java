package com.epam.book.data;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer {

    private final static Logger LOGGER = Logger.getLogger(FileDataAcquirer.class);

    private final String fileName;

    public FileDataAcquirer(String fileName) {

        this.fileName = fileName;
    }

    public List<String> read() throws DataException {

        BufferedReader reader = null;
        List<String> lines = new ArrayList<>();

        try {

            reader = new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            throw new DataException(e);
        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), e);
                }
            }

        }

        return lines;
    }

}