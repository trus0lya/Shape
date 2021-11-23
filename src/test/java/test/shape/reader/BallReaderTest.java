package test.shape.reader;

import com.shape.exception.BallException;
import org.junit.jupiter.api.Test;
import com.shape.reader.BallReader;


import java.util.List;

import static org.testng.Assert.*;

public class BallReaderTest {

    @Test
    public void testReadFromFile() throws BallException {
        List<String> arrayList = List.of("1 2 3 4", "1 2", "2s 3 4 5", "3 4 5 3 1 3", "4 38 0 -9", "3 4 2 1", "2 3 4", "8 9 7 0");
        assertEquals(BallReader.readFromFile("D:\\Shape\\test.txt"), arrayList);
    }

}
