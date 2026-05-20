package lab;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverse_singleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverse_asciiText() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("Юникод тэмдэгттэй string-ийг урвуулна")
    void reverse_unicodeText() {
        assertEquals("авйаС", StringUtils.reverse("Сайва"));
    }

    @Test
    void reverse_nullString() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void isBlank_handlesNullAndWhitespace() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank("  \t"));
        assertFalse(StringUtils.isBlank("lab"));
    }

    @Test
    void capitalize_keepsBlankInput() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("  ", StringUtils.capitalize("  "));
    }

    @Test
    void capitalize_uppercasesFirstLetterOnly() {
        assertEquals("Lab", StringUtils.capitalize("lab"));
        assertEquals("Lab15", StringUtils.capitalize("Lab15"));
    }
}
