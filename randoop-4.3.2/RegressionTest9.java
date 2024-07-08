import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 1);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (-1));
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (-1));
        java.lang.Class<?> wildcardClass30 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray13, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass30 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = MaxMin2.maxMin2(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray13, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (-1));
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 0);
        java.lang.Class<?> wildcardClass30 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray18 = MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = MaxMin2.maxMin2(intArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 10]");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 1);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray15, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (int) (short) -1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray20 = MaxMin2.maxMin2(intArray12, 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = MaxMin2.maxMin2(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 10]");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) 1);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, 0);
        int[] intArray35 = MaxMin2.maxMin2(intArray31, (int) (short) -1);
        java.lang.Class<?> wildcardClass36 = intArray35.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray20 = MaxMin2.maxMin2(intArray18, (-1));
        int[] intArray22 = MaxMin2.maxMin2(intArray18, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray13, 0);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) -1);
        int[] intArray31 = MaxMin2.maxMin2(intArray27, 0);
        java.lang.Class<?> wildcardClass32 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (byte) 1);
        int[] intArray33 = MaxMin2.maxMin2(intArray29, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray31 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray8, 0);
        int[] intArray16 = MaxMin2.maxMin2(intArray8, 1);
        int[] intArray18 = MaxMin2.maxMin2(intArray8, 1);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) -1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray27, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 10]");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) -1);
        int[] intArray31 = MaxMin2.maxMin2(intArray27, (-1));
        java.lang.Class<?> wildcardClass32 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray31 = MaxMin2.maxMin2(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray9, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (byte) -1);
        java.lang.Class<?> wildcardClass32 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (-1));
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (byte) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (short) 0);
        int[] intArray35 = MaxMin2.maxMin2(intArray31, (-1));
        java.lang.Class<?> wildcardClass36 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 1);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) -1);
        int[] intArray31 = MaxMin2.maxMin2(intArray27, 0);
        java.lang.Class<?> wildcardClass32 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (-1));
        int[] intArray29 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        java.lang.Class<?> wildcardClass30 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) -1);
        int[] intArray31 = MaxMin2.maxMin2(intArray27, (int) (short) -1);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, 0);
        int[] intArray35 = MaxMin2.maxMin2(intArray33, (int) (byte) 1);
        int[] intArray37 = MaxMin2.maxMin2(intArray33, 0);
        int[] intArray39 = MaxMin2.maxMin2(intArray37, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1]");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (byte) -1);
        int[] intArray35 = MaxMin2.maxMin2(intArray33, (int) (short) 1);
        int[] intArray37 = MaxMin2.maxMin2(intArray33, 0);
        java.lang.Class<?> wildcardClass38 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray19, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray17, (-1));
        java.lang.Class<?> wildcardClass26 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray27, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, 1);
        int[] intArray16 = MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray18 = MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 10]");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray25, 0);
        java.lang.Class<?> wildcardClass32 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        java.lang.Class<?> wildcardClass32 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = MaxMin2.maxMin2(intArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = MaxMin2.maxMin2(intArray10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray19, 0);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray31 = MaxMin2.maxMin2(intArray25, 0);
        java.lang.Class<?> wildcardClass32 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray27 = MaxMin2.maxMin2(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = MaxMin2.maxMin2(intArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray25, (int) (byte) 1);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, 0);
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (byte) -1);
        int[] intArray35 = MaxMin2.maxMin2(intArray33, (int) (short) 1);
        int[] intArray37 = MaxMin2.maxMin2(intArray35, (int) (byte) 1);
        int[] intArray39 = MaxMin2.maxMin2(intArray37, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1]");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray31 = MaxMin2.maxMin2(intArray25, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 10]");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray25, (int) (byte) 1);
        int[] intArray35 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, 1);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) -1);
        java.lang.Class<?> wildcardClass32 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, 0);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 97]");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = MaxMin2.maxMin2(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = MaxMin2.maxMin2(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray19, (-1));
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray4, (int) (byte) 1);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray27, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray13, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (byte) -1);
        int[] intArray35 = MaxMin2.maxMin2(intArray33, (int) (short) 1);
        int[] intArray37 = MaxMin2.maxMin2(intArray33, 0);
        int[] intArray39 = MaxMin2.maxMin2(intArray37, 1);
        int[] intArray41 = MaxMin2.maxMin2(intArray37, (int) (short) 0);
        java.lang.Class<?> wildcardClass42 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray7, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = MaxMin2.maxMin2(intArray7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 97]");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (-1));
        int[] intArray35 = MaxMin2.maxMin2(intArray31, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = MaxMin2.maxMin2(intArray31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (byte) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (short) 0);
        int[] intArray35 = MaxMin2.maxMin2(intArray31, 0);
        java.lang.Class<?> wildcardClass36 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) -1);
        int[] intArray33 = MaxMin2.maxMin2(intArray29, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (-1));
        int[] intArray33 = MaxMin2.maxMin2(intArray29, (int) (byte) 0);
        java.lang.Class<?> wildcardClass34 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray17, 1);
        java.lang.Class<?> wildcardClass26 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray25, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (byte) 1);
        int[] intArray33 = MaxMin2.maxMin2(intArray29, (int) (byte) 1);
        int[] intArray35 = MaxMin2.maxMin2(intArray33, 0);
        int[] intArray37 = MaxMin2.maxMin2(intArray35, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray19, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = MaxMin2.maxMin2(intArray23, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray23, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = MaxMin2.maxMin2(intArray16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray19, (-1));
        java.lang.Class<?> wildcardClass28 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (short) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (byte) -1);
        int[] intArray35 = MaxMin2.maxMin2(intArray33, (int) (short) 1);
        int[] intArray37 = MaxMin2.maxMin2(intArray33, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = MaxMin2.maxMin2(intArray33, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray14 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray21, (-1));
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray27 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (byte) 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray29, (int) (byte) 0);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (short) 0);
        java.lang.Class<?> wildcardClass34 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 1);
        int[] intArray31 = MaxMin2.maxMin2(intArray27, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 1);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray17 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray14 = MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = MaxMin2.maxMin2(intArray25, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray21, 0);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (-1));
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = MaxMin2.maxMin2(intArray25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = MaxMin2.maxMin2(intArray1, (int) (short) 1);
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 35]");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray12, 1);
        int[] intArray16 = MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray22 = MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray24 = MaxMin2.maxMin2(intArray14, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 10]");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, 0);
        java.lang.Class<?> wildcardClass30 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray15, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 0);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, (int) (byte) -1);
        int[] intArray29 = MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        int[] intArray31 = MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray23 = MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray25 = MaxMin2.maxMin2(intArray9, (-1));
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97]");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray23, 1);
        int[] intArray27 = MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray29 = MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        int[] intArray31 = MaxMin2.maxMin2(intArray23, 1);
        int[] intArray33 = MaxMin2.maxMin2(intArray31, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 10]");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        int[] intArray4 = new int[] { 0, 100, (byte) 0, 'a' };
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = MaxMin2.maxMin2(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray5, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray17 = MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = MaxMin2.maxMin2(intArray19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
        int[] intArray7 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray19 = MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray21 = MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray25 = MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray27 = MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = MaxMin2.maxMin2(intArray27, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray9 = MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = MaxMin2.maxMin2(intArray9, 1);
        int[] intArray15 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray23 = MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }
}

