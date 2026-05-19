package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testReverseSingleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void testReverseASCII() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void testReverseUnicode() {
        assertEquals("ноМ", StringUtils.reverse("Мон"));
    }

    @Test
    void testIsBlankNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void testIsBlankEmpty() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    void testIsBlankFalse() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    @Test
    void testCapitalize() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    void testCapitalizeBlank() {
        assertEquals("", StringUtils.capitalize(""));
    }
}