package tiho.boss;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    StringUtil utils = new StringUtil();

    @Test
    @DisplayName("Переворачивание текста")
    void reverseSimple(){
        assertEquals("abc", utils.reverse("cba"));
    }
    @Test
    void reverseSingleChar(){
        assertEquals("a", utils.reverse("a"));
    }
    @Test
    void reverseEmpty(){
        assertEquals("", utils.reverse(""));
    }
    @Test
    void reversePalindrome(){assertEquals("abba", utils.reverse("abba"));}
    @Test
    void reverseNull(){
        assertNull(utils.reverse(null));
    }

    @Test
    void palindromeTrue() {
        assertTrue(utils.isPalindrome("level"));
    }

    @Test
    void palindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void palindromeCaseInsensitive() {
        assertTrue(utils.isPalindrome("Level"));
    }

    @Test
    void palindromeSingleChar() {
        assertTrue(utils.isPalindrome("a"));
    }

    @Test
    void palindromeNull() {
        assertFalse(utils.isPalindrome(null));
    }


    @Test
    void countVowelsNormal() {
        assertEquals(2, utils.countVowels("hello"));
    }

    @Test
    void countVowelsNone() {
        assertEquals(0, utils.countVowels("rhythm"));
    }

    @Test
    void countVowelsUpperCase() {
        assertEquals(5, utils.countVowels("AEIOU"));
    }

    @Test
    void countVowelsEmpty() {
        assertEquals(0, utils.countVowels(""));
    }

    @Test
    void countVowelsNull() {
        assertEquals(0, utils.countVowels(null));
    }
}
