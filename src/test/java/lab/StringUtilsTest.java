package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testReverseNormalString() {
        assertEquals("gfedcba", StringUtils.reverse("abcdefg"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverseSingleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    public void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }
}