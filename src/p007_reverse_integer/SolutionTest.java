package p007_reverse_integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution s = new Solution();

    @Test
    void leetCodeExamples() {
        assertEquals(321, s.reverse(123));
        assertEquals(-321, s.reverse(-123));
        assertEquals(21, s.reverse(120));
    }

    @Test
    void singleDigitNumbers() {
        assertEquals(0, s.reverse(0));
        assertEquals(7, s.reverse(7));
        assertEquals(-7, s.reverse(-7));
    }

    @Test
    void removesTrailingZeros() {
        assertEquals(1, s.reverse(10));
        assertEquals(-1, s.reverse(-10));
        assertEquals(21, s.reverse(1200));
        assertEquals(-21, s.reverse(-1200));
    }

    @Test
    void normalPositiveNumbers() {
        assertEquals(4321, s.reverse(1234));
        assertEquals(987654321, s.reverse(123456789));
    }

    @Test
    void normalNegativeNumbers() {
        assertEquals(-4321, s.reverse(-1234));
        assertEquals(-987654321, s.reverse(-123456789));
    }

    @Test
    void returnsZero_whenPositiveOverflowWouldHappen() {
        assertEquals(0, s.reverse(1534236469));
        assertEquals(0, s.reverse(1563847412));
        assertEquals(0, s.reverse(2147483647));
    }

    @Test
    void returnsZero_whenNegativeOverflowWouldHappen() {
        assertEquals(0, s.reverse(-1534236469));
        assertEquals(0, s.reverse(-1563847412));
        assertEquals(0, s.reverse(-2147483648));
    }

    @Test
    void handlesValuesNearIntegerBoundsWithoutOverflow() {
        assertEquals(1463847412, s.reverse(2147483641));
        assertEquals(-1463847412, s.reverse(-2147483641));
    }

    @Test
    void handlesPalindromicNumbers() {
        assertEquals(1221, s.reverse(1221));
        assertEquals(-1221, s.reverse(-1221));
    }
}
