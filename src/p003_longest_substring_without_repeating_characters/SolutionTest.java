package p003_longest_substring_without_repeating_characters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void emptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void singleCharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void allCharactersAreUnique() {
        assertEquals(6, solution.lengthOfLongestSubstring("abcdef"));
    }

    @Test
    void allCharactersAreTheSame() {
        assertEquals(1, solution.lengthOfLongestSubstring("aaaaaa"));
    }

    @Test
    void repeatingSequence() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void duplicateCharactersNextToEachOther() {
        assertEquals(2, solution.lengthOfLongestSubstring("abbc"));
    }

    @Test
    void longestSubstringStartsInTheMiddle() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void repeatedCharacterIsNotAtTheBeginning() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void spacesAreCharacters() {
        assertEquals(3, solution.lengthOfLongestSubstring("a b a"));
    }

    @Test
    void caseSensitiveCharacters() {
        assertEquals(4, solution.lengthOfLongestSubstring("aAbB"));
    }
}
