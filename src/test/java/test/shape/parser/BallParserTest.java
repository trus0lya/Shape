package test.shape.parser;

import com.shape.exception.BallException;
import org.junit.jupiter.api.Test;
import com.shape.parser.BallParser;


import java.util.List;

import static org.testng.Assert.*;

public class BallParserTest {
    @Test
    public void testParse() throws BallException {
        List<String> arrayList = List.of("1 2 3 4", "1 2", "2s 3 4 5", "3 4 5 3 1 3", "4 38 0 -9","3 4 2 1","2 3 4","8 9 7 0");
        List<double[]> doubleList = List.of(
                new double[]{1,2,3,4},
                new double[]{4, 3, 2, 1});
        assertEquals(doubleList, BallParser.parse(arrayList));
    }

}