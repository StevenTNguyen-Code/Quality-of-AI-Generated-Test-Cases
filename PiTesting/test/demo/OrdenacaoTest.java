//```java
        package demo;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
//import ds.*;

public class OrdenacaoTest {

    private Ordenacao ordenacao;

    @Before
    public void setUp() {
        ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testMergeSort_withSingleElementArray() throws Exception {
        int[] array = {5};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{5}, array);
    }

    @Test(timeout=1000)
    public void testMergeSort_withPositiveElements() throws Exception {
        int[] array = {5, 2, 9, 1, 3};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9}, array);
    }

    @Test(timeout=1000)
    public void testMergeSort_withNegativeElements() throws Exception {
        int[] array = {-3, -1, -2, -4, -5};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, array);
    }

    @Test(timeout=1000)
    public void testMergeSort_withMixedElements() throws Exception {
        int[] array = {3, -1, 2, -4, 0};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{-4, -1, 0, 2, 3}, array);
    }

    @Test(timeout=1000)
    public void testMergeSort_withDuplicateElements() throws Exception {
        int[] array = {4, 5, 4, 2, 2, 3, 1};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 4, 5}, array);
    }

    @Test(timeout=1000)
    public void testMergeSort_withBoundaryValues() throws Exception {
        int[] array = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, array);
    }

    @Test(timeout=1000)
    public void testMergeSort_withEmptyArray() throws Exception {
        int[] array = {};
        Ordenacao.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{}, array);
    }
}
/*```

        ### Explanation:

        1. **Test for Default Constructor**: In this specific case, we have set up the `Ordenacao` object in the `setUp()` method using the default constructor. This implicitly tests it, as the default constructor is used to create an object of the class.

        2. **Boundary Values**: Tests with boundary values like an empty array, single-element array, and an array that includes `Integer.MIN_VALUE` and `Integer.MAX_VALUE` are included.

        3. **Positive and Negative Values**: Separate test cases have been provided for arrays with all positive numbers, all negative numbers, and a mix of positive and negative numbers.

        4. **Duplicate Values**: A test case is included for an array with duplicate values to ensure the sorting algorithm handles duplicates correctly.

5. **All test methods** come with `@Test(timeout=1000)` annotation as required.

### Note:

Since `merge` is a private method, we cannot directly test it. However, all functionalities of `merge` will be implicitly tested through `mergeSort` because `mergeSort` calls `merge`.

You can run the above tests in any JUnit 4 compatible environment, and they should pass and compile successfully, covering various scenarios as described. */