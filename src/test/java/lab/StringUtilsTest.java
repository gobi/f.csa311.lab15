package lab;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

	@Test
	@DisplayName("reverse: empty string")
	void reverse_empty() {
		assertEquals("", StringUtils.reverse(""));
	}

	@Test
	@DisplayName("reverse: single character")
	void reverse_singleChar() {
		assertEquals("A", StringUtils.reverse("A"));
	}

	@Test
	@DisplayName("reverse: ASCII and Unicode strings")
	void reverse_asciiAndUnicode() {
		// ASCII
		assertEquals("olleh", StringUtils.reverse("hello"));

		// Unicode (multibyte / non-Latin)
		assertEquals("はちにんこ", StringUtils.reverse("こんにちは"));
	}

}
