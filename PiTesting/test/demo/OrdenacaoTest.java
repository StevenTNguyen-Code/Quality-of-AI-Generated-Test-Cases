/*Here is the JUnit test class for the `Ordenacao` class:
        ``` */
        package demo;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class OrdenacaoTest {

    private int[] v;
    private int n;

    @Before
    public void setup() {
        v = new int[] {5, 2, 8, 3, 1};
        n = v.length;
    }

    @Test(timeout=1000)
    public void testOrdena_DefaultConstructor() {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testOrdena_NegativeValues() throws Exception {
        v = new int[] {-5, -2, -8, -3, -1};
        n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {-8, -5, -3, -2, -1};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdena_PositiveValues() throws Exception {
        v = new int[] {5, 2, 8, 3, 1};
        n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdena_BoundaryValues() throws Exception {
        v = new int[] {0, 0, 0, 0, 0};
        n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdena_EmptyArray() throws Exception {
        v = new int[] {};
        n = v.length;
        Ordenacao.ordena(v, n);
        int[] expected = {};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000, expected=ArrayIndexOutOfBoundsException.class)
    public void testOrdena_ArrayIndexOutOfBoundsException() throws Exception {
        v = new int[] {5, 2, 8, 3, 1};
        n = v.length + 1;
        Ordenacao.ordena(v, n);
    }
}
/*```
Note:

        * I've added a `@Before` method to setup the test data, which is reused across multiple test methods.
        * I've added test methods to cover different scenarios, including:
        + `testOrdena_DefaultConstructor`: Verifies that the default constructor works as expected.
        + `testOrdena_NegativeValues`: Tests the method with an array of negative values.
	+ `testOrdena_PositiveValues`: Tests the method with an array of positive values.
	+ `testOrdena_BoundaryValues`: Tests the method with an array of boundary values (all zeros).
        + `testOrdena_EmptyArray`: Tests the method with an empty array.
	+ `testOrdena_ArrayIndexOutOfBoundsException`: Tests the method with an array index out of bounds exception.
* I've used the `throws Exception` clause in each test method to satisfy the requirement.
        * I've used the `timeout=1000` annotation to set a timeout of 1 second for each test method.
        * I've used the `expected` annotation to specify the expected exception in one of the test methods. */