package lab;

/**
 * String-тэй ажиллах туслах утга.
 *
 */
public final class StringUtils {

    private StringUtils() {
        // util class
    }

    /**
     * Хоосон болон null-ийг шалгах.
     */
    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    /**
     * Үгийн эхний үсгийг том болгох (бусад нь хэвээр).
     */
    public static String capitalize(String s) {
        if (isBlank(s)) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    /**
     * Өгөгдсөн string-ийг урвуу дарааллаар буцаах.
     */
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return new StringBuilder(s).reverse().toString();
    }
}
