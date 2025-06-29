


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private StringUtils utils;

    @BeforeEach
    void setUp() {
        utils = new StringUtils();
        System.out.println("BeforeEach - Setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach - Teardown");
    }

    @Test
    void testConcatenateStrings() {
        // Arrange
        String a = "Hello";
        String b = "World";

        // Act
        String result = utils.concatenate(a, b);

        // Assert
        assertEquals("HelloWorld", result);
    }

    @Test
    void testUpperCase() {
        String input = "monish";
        String result = utils.toUpperCase(input);
        assertEquals("MONISH", result);
    }
}
