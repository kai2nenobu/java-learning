package learning.java.util.regex;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class PatternLearning {
    Pattern printable = Pattern.compile("[\\p{Print}]*");
    Pattern unicodePrintable = Pattern.compile("[\\p{Print}]*", Pattern.UNICODE_CHARACTER_CLASS);

    @Test
    public void aはprintableである() {
        assertTrue(printable.matcher("a").matches());
    }

    @Test
    public void あはprintableではない() {
        assertFalse(printable.matcher("あ").matches());
    }

    @Test
    public void aはUnicodePrinatbleである() {
        assertTrue(unicodePrintable.matcher("a").matches());
    }

    @Test
    public void あはUnicodePrinatbleである() {
        assertTrue(unicodePrintable.matcher("あ").matches());
    }
}
