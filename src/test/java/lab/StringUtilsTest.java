package lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("", StringUtils.reverse(""));
        assertEquals(null, StringUtils.reverse(null));
        assertEquals("аба", StringUtils.reverse("аба"));
    }
}