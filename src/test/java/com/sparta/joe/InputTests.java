package com.sparta.joe;

import com.sparta.joe.start.InputHandler;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTests {
    @Test
    void sortSelectTestValid() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(1, InputHandler.searchSelect());
    }

    @Test
    void sortSelectTestWrongDataType() {
        String input = "test";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(0, InputHandler.searchSelect());
    }

    //The OutOfBoundsHigh and OutOfBoundsLow Tests are handled in the starter method,
    //however need to return the previously entered values in order to be handled correctly
    @Test
    void sortSelectTestOutOfBoundsHigh() {
        String input = "500";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(500, InputHandler.searchSelect());
    }

    @Test
    void sortSelectTestOutOfBoundsLow() {
        String input = "-500";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(-500, InputHandler.searchSelect());
    }

    @Test
    void sizeSelectTestValid() {
        String input = "20";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(20, InputHandler.arraySize());
    }

    @Test
    void sizeSelectTestWrongDataType() {
        String input = "test";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(0, InputHandler.arraySize());
    }


    //Once again, the OutOfBounds test is handled in the starter method,
    //however need to return the previously entered values in order to be handled correctly
    @Test
    void sizeSelectTestOutOfBounds() {
        String input = "-500";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(-500, InputHandler.arraySize());
    }
}
