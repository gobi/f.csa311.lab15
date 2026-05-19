package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

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
    @DisplayName("isBlank — утгатай худал")
    void isBlank_notBlank() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    @Test
    @DisplayName("capitalize — эхний үсэг том болох")
    void capitalize_simple() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    @DisplayName("capitalize — хоосон буцаах")
    void capitalize_blank() {
        assertNull(StringUtils.capitalize(null));
    }
}
