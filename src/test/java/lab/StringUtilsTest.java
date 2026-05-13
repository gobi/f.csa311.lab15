package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("Хоосон string буцааx")
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    @DisplayName("Нэг тэмдэгт")
    void reverse_singleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    @DisplayName("ASCII тэмдэгтүүд")
    void reverse_ascii() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("Юникод тэмдэгт")
    void reverse_unicode() {
        assertEquals("аблав", StringUtils.reverse("валба"));
    }

    @Test
    @DisplayName("null буцаах")
    void reverse_null() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    @DisplayName("isBlank — null үнэн")
    void isBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    @DisplayName("isBlank — хоосон үнэн")
    void isBlank_empty() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    @DisplayName("capitalize — эхний үсэг том болох")
    void capitalize_simple() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }
}
