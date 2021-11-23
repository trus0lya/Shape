package com.shape.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.shape.exception.BallException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;


public class BallReader {
    private static final Logger logger = LogManager.getLogger(BallReader.class);
    public static List<String> readFromFile(String path) throws BallException {
        if(path == null || path.isEmpty() || path.isBlank()){
            logger.log(Level.WARN,"Reading isn't successful");
            throw new BallException("String is null or empty or blank");
        }
        List<String> arrayList;
        Path dataFile = Paths.get(path);
        try (Stream<String> dataStream = Files.lines(dataFile)) {
            arrayList = dataStream.collect(Collectors.toList());
            logger.log(Level.INFO, "Reading is successful");
        } catch (IOException e) {
            logger.log(Level.WARN,"Reading isn't successful");
            throw new BallException(e.getMessage());
        }
        return arrayList;
    }
}
