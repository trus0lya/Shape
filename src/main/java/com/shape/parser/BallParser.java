package com.shape.parser;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.shape.exception.BallException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import com.shape.validator.BallValidator;

public class BallParser {
    private static final Logger logger = LogManager.getLogger(BallParser.class);
    public static List<double[]> parse(List<String> list) throws BallException {
        if (list == null || list.isEmpty()) {
            logger.log(Level.WARN,"Parsing isn't successful");
            throw new BallException("List is null or empty");
        }
        List<double[]> doubleList;
        try {
            doubleList = list.stream()
                    .map(String::trim)
                    .filter(BallValidator::isValidString)
                    .map(line -> line.split(" "))
                    .map(array -> Stream.of(array)
                            .mapToDouble(Double::parseDouble)
                            .toArray())
                    .collect(Collectors.toList());
            logger.log(Level.INFO,"Parsing is successful");
        } catch (Exception e){
            logger.log(Level.WARN,"Parsing isn't successful");
            throw new BallException(e.getMessage());
        }
        return doubleList;
    }
}

