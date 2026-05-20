package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testReverseEmpty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testReverseSingleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void testReverseNormal() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }
}
