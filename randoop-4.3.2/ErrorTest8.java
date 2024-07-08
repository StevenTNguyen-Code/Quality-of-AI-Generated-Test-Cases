import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4001");
        int[] intArray3 = new int[] { (byte) -1, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (-1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4002");
        int[] intArray4 = new int[] { (short) 0, (short) 0, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, 0);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4003");
        int[] intArray4 = new int[] { ' ', 0, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) 0);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4004");
        int[] intArray3 = new int[] { ' ', 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4005");
        int[] intArray3 = new int[] { (byte) -1, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (-1));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4006");
        int[] intArray6 = new int[] { 'a', 'a', 1, 10, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 1);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4007");
        int[] intArray2 = new int[] { '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (int) (short) -1);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4008");
        int[] intArray4 = new int[] { (-1), (short) 10, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, 0);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4009");
        int[] intArray6 = new int[] { '#', (short) 100, (byte) 10, (byte) -1, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (-1));
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4010");
        int[] intArray4 = new int[] { (byte) -1, (short) 0, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) 0);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4011");
        int[] intArray2 = new int[] { (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, 1);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4012");
        int[] intArray6 = new int[] { 100, (byte) 1, (byte) 0, 1, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4013");
        int[] intArray5 = new int[] { (byte) -1, ' ', 'a', (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 0);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4014");
        int[] intArray5 = new int[] { 100, (byte) 10, 1, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (short) 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4015");
        int[] intArray6 = new int[] { ' ', (byte) 1, (byte) 0, 100, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4016");
        int[] intArray6 = new int[] { 10, (short) 0, (short) 1, (-1), (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (byte) 1);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4017");
        int[] intArray2 = new int[] { (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (int) (short) 1);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4018");
        int[] intArray5 = new int[] { (short) 1, (short) 10, '#', (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray7 = MaxMin2.maxMin2(intArray5, (int) (byte) 1);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4019");
        int[] intArray3 = new int[] { (byte) -1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (-1));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4020");
        int[] intArray3 = new int[] { 100, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (int) (short) 0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4021");
        int[] intArray3 = new int[] { (short) 0, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (-1));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4022");
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, (byte) 10, (-1), 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) -1);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4023");
        int[] intArray4 = new int[] { (short) 10, 0, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) -1);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4024");
        int[] intArray3 = new int[] { (byte) 10, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (int) (short) -1);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4025");
        int[] intArray6 = new int[] { (short) 100, (short) 1, (byte) 0, (byte) 10, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) 1);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4026");
        int[] intArray3 = new int[] { (-1), (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (int) (short) 0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4027");
        int[] intArray2 = new int[] { (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (-1));
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4028");
        int[] intArray2 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (int) (byte) 1);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4029");
        int[] intArray2 = new int[] { (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (int) (short) -1);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4030");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, ' ', (byte) 1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) -1);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4031");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (short) 100, (byte) 1, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) 0);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4032");
        int[] intArray4 = new int[] { ' ', (byte) 100, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (-1));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4033");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, 0, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 1);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4034");
        int[] intArray4 = new int[] { (short) -1, (short) -1, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) 1);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4035");
        int[] intArray4 = new int[] { '4', (byte) 1, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (short) 1);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4036");
        int[] intArray3 = new int[] { '4', (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4037");
        int[] intArray6 = new int[] { (short) -1, '4', (short) 1, 10, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) 0);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4038");
        int[] intArray6 = new int[] { 1, '4', 'a', 'a', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (int) (short) 1);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4039");
        int[] intArray6 = new int[] { (byte) 1, 100, (byte) 10, '4', (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4040");
        int[] intArray3 = new int[] { (byte) 10, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (int) (byte) -1);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4041");
        int[] intArray6 = new int[] { 10, '4', (byte) -1, 1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, (-1));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4042");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (-1));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4043");
        int[] intArray6 = new int[] { 100, (short) 0, (short) -1, (byte) 1, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = MaxMin2.maxMin2(intArray6, 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4044");
        int[] intArray3 = new int[] { 'a', 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4045");
        int[] intArray4 = new int[] { (byte) 100, ' ', ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, 1);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4046");
        int[] intArray3 = new int[] { (byte) -1, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, 0);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4047");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, (short) -1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray7 = MaxMin2.maxMin2(intArray5, 0);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4048");
        int[] intArray3 = new int[] { (short) 1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (int) (short) -1);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4049");
        int[] intArray2 = new int[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (int) (short) 0);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4050");
        int[] intArray3 = new int[] { (short) 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (int) (short) 1);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4051");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (int) (byte) -1);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4052");
        int[] intArray2 = new int[] { (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = MaxMin2.maxMin2(intArray2, (int) (short) 1);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4053");
        int[] intArray4 = new int[] { (short) 10, (byte) 0, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = MaxMin2.maxMin2(intArray4, (int) (byte) 1);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4054");
        int[] intArray3 = new int[] { '4', 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = MaxMin2.maxMin2(intArray3, (-1));
    }
}

