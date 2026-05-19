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
}