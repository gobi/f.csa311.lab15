package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void reverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverseSingleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverseNormalString() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void reverseUnicode() {
        assertEquals("оллоо", StringUtils.reverse("оолло"));
    }
}