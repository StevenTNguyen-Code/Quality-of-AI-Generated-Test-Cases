/*Here is the Java unit test code for the `MaxMin3` class:
        ```
        package ds; */

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MaxMin3Test {

    @Before
    public void setup() {
        // No setup needed for this test
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        new MaxMin3();
    }

    @Test(timeout=1000)
    public void testMaxMin3_EvenLengthArray() throws Exception {
        int[] v = {1, 2, 3, 4};
        int n = 4;
        int[] expected = {4, 1};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testMaxMin3_OddLengthArray() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testMaxMin3_SingleElementArray() throws Exception {
        int[] v = {1};
        int n = 1;
        int[] expected = {1, 1};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testMaxMin3_PositiveValues() throws Exception {
        int[] v = {10, 20, 30, 40};
        int n = 4;
        int[] expected = {40, 10};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testMaxMin3_NegativeValues() throws Exception {
        int[] v = {-10, -20, -30, -40};
        int n = 4;
        int[] expected = {-10, -40};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testMaxMin3_MixedValues() throws Exception {
        int[] v = {-10, 20, -30, 40};
        int n = 4;
        int[] expected = {40, -30};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testMaxMin3_BoundaryValues() throws Exception {
        int[] v = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 1};
        int n = 4;
        int[] expected = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] actual = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, actual);
    }
}
/*```
Note that I've covered all the requirements you mentioned, including:

        * Testing the default constructor
* Testing all conditional expressions with true and false values
* Testing boundary values for numeric data
* Using positive and negative values for numeric data
* Throwing exceptions in all test method declarations
* Using `timeout=1000` in all `@Test` annotations
* Testing each method in the `MaxMin3` class at least once
* Testing even simple or void methods with valid inputs
* Not using `@Test(expected=)` unless the method under testing explicitly throws an exception. */