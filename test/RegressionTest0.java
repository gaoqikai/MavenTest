import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setAnswer("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.minus(42);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.setResult((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult((-48));
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        java.lang.String str3 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus((int) 'a');
        yes1.setResult(10);
        yes1.minus(0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        int int8 = yes1.getResult();
        yes1.setResult((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-48) + "'", int8 == (-48));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.minus((-1));
        yes1.minus((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.add((-48));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) ' ');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.minus((-1));
        java.lang.String str5 = yes1.getAnswer();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.add((int) 'a');
        int int16 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.add((-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        yes1.setResult((int) (byte) 1);
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        int int8 = yes1.getResult();
        yes1.setAnswer("hi!");
        int int11 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) ' ');
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.String str9 = yes1.getAnswer();
        yes1.add(10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        yes yes1 = new yes("hi!");
        int int2 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.String str7 = yes1.getAnswer();
        yes1.setResult((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        yes1.setResult((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.minus(10);
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.minus((-48));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.minus((-1));
        java.lang.String str5 = yes1.getAnswer();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setResult((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(62);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        yes1.minus((int) (short) 100);
        yes1.add(10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        yes1.setResult(52);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.setResult((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.add((int) (short) -1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(1);
        yes1.setResult((int) (short) 100);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((-1));
        yes1.setResult(0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.minus(52);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.add((-47));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("");
        yes1.setResult((-48));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.String str7 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.minus((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.add(33);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.minus(100);
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.setResult(1);
        yes1.minus((int) (byte) 100);
        yes1.add((int) '#');
        yes1.setResult((int) (byte) 10);
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.add(0);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        yes1.add((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        int int17 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-31) + "'", int17 == (-31));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.minus((int) '4');
        int int15 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(90);
        java.lang.String str12 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) '#');
        java.lang.String str12 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) '#');
        yes1.add(0);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.minus((int) (byte) 10);
        yes1.add(42);
        yes1.add((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        yes1.minus((int) (short) 100);
        int int10 = yes1.getResult();
        yes1.setResult((int) ' ');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-48) + "'", int10 == (-48));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.setResult(51);
        yes1.add((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.minus((int) '4');
        int int10 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        yes1.setResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        int int10 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (short) 100);
        yes1.setResult((int) (short) -1);
        yes1.setResult((int) (short) 0);
        yes1.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult((int) '4');
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((int) (byte) -1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.setAnswer("");
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        java.lang.String str10 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult(0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.add(1);
        int int17 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        yes1.minus(90);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("");
        yes1.setResult((int) (short) 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(90);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.minus(54);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (byte) 1);
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        yes1.minus((-48));
        yes1.setAnswer("hi!");
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        yes1.add((int) ' ');
        yes1.add((-31));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setResult(52);
        yes1.setAnswer("");
        yes1.add(0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.String str12 = yes1.getAnswer();
        yes1.minus(62);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult(2);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        yes1.add(100);
        int int10 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus(98);
        yes1.minus((int) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        yes1.setAnswer("hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(1);
        int int11 = yes1.getResult();
        yes1.add((-47));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setAnswer("hi!");
        java.lang.String str11 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        yes1.setResult((int) (byte) 1);
        yes1.add(100);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setAnswer("hi!");
        yes1.setResult((int) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.add(90);
        yes1.setResult((int) (byte) 10);
        yes1.setAnswer("");
        yes1.setResult(42);
        yes1.add((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setResult(0);
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        int int8 = yes1.getResult();
        yes1.setAnswer("hi!");
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus((int) 'a');
        yes1.setResult(10);
        yes1.minus(62);
        yes1.setResult((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("hi!");
        yes1.setResult((int) '4');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        java.lang.String str12 = yes1.getAnswer();
        yes1.setResult((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.setResult((int) (byte) 1);
        yes1.setAnswer("");
        yes1.minus((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        java.lang.String str11 = yes1.getAnswer();
        yes1.add((-10));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((-1));
        yes1.setResult((int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.String str7 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.minus(42);
        yes1.setAnswer("");
        yes1.setResult(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        yes1.add((int) ' ');
        java.lang.String str18 = yes1.getAnswer();
        yes1.minus(90);
        int int21 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-89) + "'", int21 == (-89));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult(2);
        yes1.setResult(1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.minus(33);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        yes1.setResult((int) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        int int10 = yes1.getResult();
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        java.lang.String str7 = yes1.getAnswer();
        yes1.setResult(90);
        int int10 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 90 + "'", int10 == 90);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        yes1.setResult((int) (byte) 10);
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.minus((-1));
        java.lang.String str5 = yes1.getAnswer();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus((-1));
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        yes1.setResult(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.minus((int) '4');
        java.lang.String str10 = yes1.getAnswer();
        int int11 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.add((int) (byte) -1);
        int int10 = yes1.getResult();
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.setResult((int) (short) 100);
        yes1.add((int) (byte) 1);
        yes1.setAnswer("");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) (short) 10);
        yes1.setAnswer("hi!");
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10) + "'", int11 == (-10));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        yes1.minus((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus(43);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.add(1);
        java.lang.Class<?> wildcardClass17 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.add((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setResult(0);
        yes1.setResult((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setResult(17);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setResult((int) (short) 100);
        yes1.add((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.minus((int) (byte) 10);
        yes1.add(42);
        java.lang.Class<?> wildcardClass17 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (byte) 1);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.add(0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.minus(0);
        int int13 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.add((-48));
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        yes1.minus(0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.minus(1);
        java.lang.String str8 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus(0);
        yes1.setResult(100);
        java.lang.String str14 = yes1.getAnswer();
        yes1.setResult((int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setResult((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 10);
        yes1.setAnswer("");
        yes1.setResult((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) (short) 1);
        yes1.setResult((int) ' ');
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        int int9 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(43);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.minus(2);
        java.lang.String str8 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setResult(52);
        int int6 = yes1.getResult();
        yes1.add(17);
        yes1.minus((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setResult(0);
        yes1.minus(62);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus((int) (byte) 1);
        yes1.minus((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.add((int) (byte) -1);
        int int10 = yes1.getResult();
        yes1.minus((-89));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        yes1.setResult((int) (byte) 0);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) '#');
        yes1.add(0);
        yes1.setResult(90);
        int int16 = yes1.getResult();
        yes1.setResult((int) 'a');
        java.lang.String str19 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 90 + "'", int16 == 90);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(52);
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setAnswer("");
        int int8 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        int int8 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.add((-47));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.add((int) (byte) -1);
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        java.lang.String str12 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str15 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        java.lang.String str13 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.add(90);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        yes1.setResult(0);
        int int10 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        int int8 = yes1.getResult();
        yes1.add(0);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-48) + "'", int8 == (-48));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass15 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.add((-48));
        yes1.add(52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(90);
        yes1.minus((int) (short) 0);
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus((int) (byte) 1);
        yes1.setResult((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) ' ');
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.String str6 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.String str8 = yes1.getAnswer();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        int int9 = yes1.getResult();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.minus((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setResult(52);
        int int6 = yes1.getResult();
        yes1.add(17);
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult((int) '4');
        yes1.minus((int) (byte) -1);
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add(10);
        yes1.add(54);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.add((-1));
        yes1.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.String str7 = yes1.getAnswer();
        yes1.add(62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        int int4 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setAnswer("hi!");
        int int12 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.minus(100);
        yes1.setAnswer("");
        yes1.add((-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        yes1.setResult(138);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.minus((-89));
        yes1.add(33);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add(43);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.add(0);
        yes1.setResult(90);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        yes1.setResult((-31));
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((int) (byte) 10);
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(1);
        int int11 = yes1.getResult();
        yes1.add(43);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus((-10));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.add((int) (short) -1);
        yes1.minus(0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        int int15 = yes1.getResult();
        yes1.setResult(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.minus(0);
        yes1.setResult(53);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        int int12 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        yes1.add((int) ' ');
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.add((-1));
        yes1.setAnswer("hi!");
        yes1.setResult((int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        int int8 = yes1.getResult();
        yes1.minus(2);
        yes1.minus(33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-48) + "'", int8 == (-48));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.String str6 = yes1.getAnswer();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.minus((-1));
        java.lang.String str5 = yes1.getAnswer();
        yes1.add(100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.String str12 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.add((int) (byte) -1);
        yes1.minus(1);
        java.lang.String str12 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        java.lang.String str10 = yes1.getAnswer();
        yes1.minus(0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setResult(52);
        yes1.setAnswer("");
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        int int5 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.setResult((-90));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) '#');
        yes1.add(0);
        yes1.setResult(90);
        int int16 = yes1.getResult();
        java.lang.Class<?> wildcardClass17 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 90 + "'", int16 == 90);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) (short) 1);
        java.lang.String str12 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        yes1.minus((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        yes1.add((int) (byte) 0);
        int int9 = yes1.getResult();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setResult(52);
        int int12 = yes1.getResult();
        yes1.minus(90);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.add((-10));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        int int5 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.minus((int) (byte) 100);
        yes1.minus((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.add(1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus(0);
        yes1.setResult(100);
        java.lang.String str14 = yes1.getAnswer();
        yes1.setResult((int) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.add((int) (byte) -1);
        yes1.minus(1);
        int int12 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        int int14 = yes1.getResult();
        java.lang.String str15 = yes1.getAnswer();
        yes1.minus(42);
        java.lang.Class<?> wildcardClass18 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-90) + "'", int14 == (-90));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.add((int) (byte) -1);
        java.lang.String str8 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.minus((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setResult(50);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        int int11 = yes1.getResult();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        int int14 = yes1.getResult();
        yes1.setResult(52);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 136 + "'", int14 == 136);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (byte) 1);
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        yes1.minus((-48));
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        int int12 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        yes1.setResult((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult(90);
        yes1.add(52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        yes1.add((int) ' ');
        java.lang.String str18 = yes1.getAnswer();
        int int19 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) -1);
        yes1.minus(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) '#');
        int int12 = yes1.getResult();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.minus((int) '4');
        yes1.minus((int) (short) 0);
        yes1.setResult((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) (byte) 100);
        yes1.setResult((-48));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((-1));
        yes1.setResult((int) (short) 10);
        yes1.add(17);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult(90);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        yes1.add(51);
        yes1.setResult((int) (byte) 0);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        yes1.setResult((int) (short) 10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        int int8 = yes1.getResult();
        yes1.add(0);
        int int11 = yes1.getResult();
        yes1.add((-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-48) + "'", int8 == (-48));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-48) + "'", int11 == (-48));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        int int10 = yes1.getResult();
        yes1.add(62);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.add((int) ' ');
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (byte) 1);
        int int7 = yes1.getResult();
        yes1.minus((-47));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        yes1.add(51);
        yes1.setResult((-1));
        int int13 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.String str11 = yes1.getAnswer();
        yes1.minus((-48));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.minus(51);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        yes1.setResult((-10));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) 'a');
        yes1.setResult((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        java.lang.String str7 = yes1.getAnswer();
        yes1.minus(50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.String str11 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.minus((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) '4');
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        int int10 = yes1.getResult();
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.minus(10);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus((int) 'a');
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        int int11 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult(90);
        yes1.setResult(90);
        int int13 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 90 + "'", int13 == 90);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.add((-48));
        int int14 = yes1.getResult();
        java.lang.Class<?> wildcardClass15 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-47) + "'", int14 == (-47));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.minus(0);
        yes1.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.setResult(0);
        java.lang.String str13 = yes1.getAnswer();
        yes1.add((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setAnswer("");
        yes1.setResult(9);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        yes1.minus(10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((-48));
        yes1.add((int) (short) 0);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.String str9 = yes1.getAnswer();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult((-48));
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.minus(1);
        yes1.setAnswer("hi!");
        yes1.minus(42);
        yes1.minus((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.add(100);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setResult(0);
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        int int11 = yes1.getResult();
        yes1.setResult(98);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        int int14 = yes1.getResult();
        yes1.minus((-47));
        yes1.setResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-90) + "'", int14 == (-90));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.minus((int) '4');
        yes1.minus((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = yes1.getClass();
        yes1.setResult((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.setResult((int) (byte) 1);
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.String str6 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setResult((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setAnswer("hi!");
        java.lang.String str11 = yes1.getAnswer();
        java.lang.String str12 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        yes1.add((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.String str6 = yes1.getAnswer();
        yes1.minus(0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.minus((int) '4');
        yes1.setResult(62);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        java.lang.String str8 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.String str6 = yes1.getAnswer();
        yes1.minus((-47));
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        yes1.setResult((int) (short) 1);
        yes1.setResult(136);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setResult(98);
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.setResult(138);
        yes1.add(2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.minus((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.minus((int) '4');
        java.lang.String str10 = yes1.getAnswer();
        java.lang.String str11 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        int int14 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        yes1.add((int) ' ');
        java.lang.String str18 = yes1.getAnswer();
        yes1.minus((int) ' ');
        yes1.minus((int) '4');
        yes1.setResult((int) (byte) 0);
        yes1.add((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((-1));
        yes1.minus(50);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.minus((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add(52);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 104 + "'", int7 == 104);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus(0);
        yes1.minus(43);
        int int14 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-44) + "'", int14 == (-44));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        java.lang.String str7 = yes1.getAnswer();
        yes1.setResult(90);
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        int int12 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(9);
        yes1.minus(53);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.setResult(138);
        java.lang.String str18 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(1);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        int int14 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 54 + "'", int14 == 54);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        yes1.add((int) ' ');
        java.lang.Class<?> wildcardClass18 = yes1.getClass();
        int int19 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setAnswer("");
        int int11 = yes1.getResult();
        yes1.add(10);
        int int14 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) (short) 10);
        yes1.setAnswer("hi!");
        yes1.minus(62);
        yes1.add((-5));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        yes1.add(51);
        yes1.minus(104);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        yes1.setResult((-47));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (byte) 1);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setResult((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus(52);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(1);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        yes1.minus((int) '#');
        yes1.minus((-47));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.String str7 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.minus(42);
        yes1.setAnswer("");
        yes1.add((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        yes1.minus((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        int int14 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 137 + "'", int14 == 137);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(1);
        yes1.setResult((int) (short) 100);
        java.lang.String str13 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult((-48));
        int int12 = yes1.getResult();
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-48) + "'", int12 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setResult(52);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(90);
        yes1.setResult(10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.minus((-44));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        int int8 = yes1.getResult();
        java.lang.String str9 = yes1.getAnswer();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult(2);
        int int11 = yes1.getResult();
        java.lang.String str12 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        yes1.setResult((int) (byte) 1);
        yes1.setResult((int) (byte) 100);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) '4');
        yes1.add(104);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.add(90);
        yes1.setResult((int) (byte) 10);
        yes1.setAnswer("");
        yes1.setResult(42);
        java.lang.String str11 = yes1.getAnswer();
        yes1.setResult((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        java.lang.String str7 = yes1.getAnswer();
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult((-1));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.minus((int) (byte) 10);
        yes1.minus((int) (short) 1);
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.add(1);
        java.lang.String str17 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.minus((int) (short) -1);
        yes1.add(98);
        yes1.add(10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        yes1.setAnswer("");
        java.lang.String str13 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        int int15 = yes1.getResult();
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 90 + "'", int15 == 90);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus((int) 'a');
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        int int9 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-45) + "'", int9 == (-45));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.minus((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus((-31));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("hi!");
        yes1.setResult((-5));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        yes1.add(100);
        yes1.setResult(51);
        java.lang.String str13 = yes1.getAnswer();
        yes1.add(10);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) 'a');
        yes1.add(43);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) (short) 10);
        int int8 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add(90);
        yes1.minus((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(1);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.String str7 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.setAnswer("");
        yes1.setResult(42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        int int14 = yes1.getResult();
        yes1.setResult(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-90) + "'", int14 == (-90));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.minus(1);
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.minus((int) 'a');
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setAnswer("hi!");
        yes1.setResult(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.minus(0);
        yes1.add((-5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(90);
        yes1.minus((int) (short) 0);
        yes1.add((-45));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        yes1.minus((int) (byte) 1);
        java.lang.String str15 = yes1.getAnswer();
        yes1.minus((-45));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.setResult(1);
        yes1.minus((int) (byte) 100);
        yes1.add((int) '#');
        yes1.setResult((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        yes1.minus((int) (byte) 1);
        java.lang.String str15 = yes1.getAnswer();
        int int16 = yes1.getResult();
        yes1.setAnswer("");
        int int19 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((-48));
        yes1.minus(3);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setResult((-90));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.String str7 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.minus(42);
        yes1.setAnswer("");
        yes1.setResult(53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        yes1.minus((int) (byte) 1);
        java.lang.String str15 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.String str7 = yes1.getAnswer();
        yes1.setResult(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        int int4 = yes1.getResult();
        int int5 = yes1.getResult();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult(2);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setAnswer("");
        int int12 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.minus((-1));
        java.lang.String str5 = yes1.getAnswer();
        int int6 = yes1.getResult();
        yes1.setAnswer("");
        yes1.setResult((int) (byte) 0);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        int int7 = yes1.getResult();
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus(0);
        java.lang.String str8 = yes1.getAnswer();
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus(53);
        yes1.setResult((-2));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        yes1.minus(3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setResult((int) (short) 10);
        yes1.setResult((-2));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        yes1.minus((-47));
        yes1.minus((-44));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setAnswer("");
        yes1.add((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        int int4 = yes1.getResult();
        int int5 = yes1.getResult();
        yes1.add(43);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        int int5 = yes1.getResult();
        yes1.setAnswer("");
        yes1.add((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.add(0);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        yes1.setAnswer("");
        int int16 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        int int8 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.minus(54);
        yes1.setAnswer("");
        yes1.setResult(0);
        yes1.minus(52);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.add(138);
        yes1.minus(3);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus((int) 'a');
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) (short) 10);
        yes1.minus(54);
        yes1.setResult(43);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.minus((int) (byte) 1);
        yes1.add(136);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setResult(52);
        yes1.add((-48));
        java.lang.String str8 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.add(0);
        yes1.add(104);
        int int15 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.minus(136);
        yes1.setResult((-47));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(104);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("hi!");
        yes1.setResult((int) (short) 1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(90);
        yes1.add((-45));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        yes1.setResult(98);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        int int10 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("hi!");
        java.lang.String str6 = yes1.getAnswer();
        yes1.minus((-47));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        yes1.minus((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.setResult(10);
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        int int8 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-48) + "'", int8 == (-48));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.add((-1));
        int int6 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.add((int) ' ');
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult((-31));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.String str7 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setResult(52);
        int int6 = yes1.getResult();
        yes1.add(17);
        int int9 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.minus(2);
        int int8 = yes1.getResult();
        int int9 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.add(90);
        yes1.setResult((int) (byte) 10);
        yes1.setAnswer("");
        yes1.setResult(42);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        yes1.minus(51);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.minus((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.minus(100);
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        int int17 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.minus(1);
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        int int12 = yes1.getResult();
        yes1.setAnswer("hi!");
        int int15 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        int int9 = yes1.getResult();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.minus(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-48) + "'", int9 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        yes1.setResult((int) (byte) 10);
        yes1.setAnswer("");
        java.lang.String str16 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        yes1.setResult((-31));
        yes1.setAnswer("");
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.add((-1));
        yes1.setResult((int) (short) -1);
        yes1.add((-2));
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.setResult(10);
        java.lang.String str10 = yes1.getAnswer();
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.setResult((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.String str7 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        int int10 = yes1.getResult();
        yes1.minus(69);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        int int14 = yes1.getResult();
        yes1.minus((-47));
        int int17 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-90) + "'", int14 == (-90));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-43) + "'", int17 == (-43));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.String str6 = yes1.getAnswer();
        yes1.minus((-47));
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.setResult(54);
        java.lang.String str20 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        java.lang.String str14 = yes1.getAnswer();
        yes1.minus((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.minus(41);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.minus((-89));
        java.lang.String str15 = yes1.getAnswer();
        yes1.add((-47));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.minus((-1));
        java.lang.String str5 = yes1.getAnswer();
        int int6 = yes1.getResult();
        yes1.setAnswer("");
        yes1.setResult((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.minus((int) (byte) 10);
        yes1.minus((int) (short) 1);
        yes1.setAnswer("hi!");
        yes1.add((-2));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        yes1.minus((int) (byte) 0);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.add((-1));
        yes1.setResult((int) (short) -1);
        yes1.setAnswer("");
        yes1.add(41);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.minus(54);
        int int15 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.minus(43);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setResult((int) (short) -1);
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        yes1.minus(62);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setResult(52);
        yes1.minus((-1));
        yes1.add(136);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.minus((int) (byte) 1);
        yes1.minus(33);
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.minus((int) 'a');
        yes1.setResult((int) (short) 100);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("hi!");
        java.lang.String str6 = yes1.getAnswer();
        int int7 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.add((-1));
        yes1.setResult((int) (short) -1);
        yes1.setAnswer("");
        yes1.minus(10);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        int int8 = yes1.getResult();
        yes1.minus(2);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-48) + "'", int8 == (-48));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        int int10 = yes1.getResult();
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.setResult(136);
        yes1.add(33);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        java.lang.String str6 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        java.lang.String str11 = yes1.getAnswer();
        yes1.setResult(98);
        yes1.add(1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (byte) 1);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.minus(8);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.setResult(104);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-47));
        yes1.minus((-5));
        yes1.setResult((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) '#');
        int int12 = yes1.getResult();
        yes1.minus(9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        yes1.add(42);
        yes1.add((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        yes1.minus((int) (byte) 1);
        java.lang.String str15 = yes1.getAnswer();
        int int16 = yes1.getResult();
        yes1.setAnswer("hi!");
        int int19 = yes1.getResult();
        yes1.add((-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setResult(98);
        int int9 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setResult((int) (short) 10);
        yes1.add((int) (byte) -1);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        yes1.minus((int) (byte) 1);
        java.lang.String str15 = yes1.getAnswer();
        int int16 = yes1.getResult();
        int int17 = yes1.getResult();
        java.lang.String str18 = yes1.getAnswer();
        yes1.minus(0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.setResult((-43));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setAnswer("hi!");
        java.lang.String str11 = yes1.getAnswer();
        yes1.setResult((-10));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.String str7 = yes1.getAnswer();
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.add((-31));
        yes1.setResult(136);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.add((-48));
        int int14 = yes1.getResult();
        yes1.minus((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-47) + "'", int14 == (-47));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setAnswer("hi!");
        yes1.add((-89));
        yes1.add(98);
        java.lang.String str15 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str9 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.minus((-47));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.minus((-31));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setAnswer("hi!");
        yes1.add((-89));
        yes1.setResult(3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setResult(0);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add(10);
        int int13 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 72 + "'", int13 == 72);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((-1));
        yes1.setResult((int) (short) 10);
        java.lang.String str18 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add(43);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        int int6 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.minus((int) (byte) 10);
        yes1.minus((int) (short) 1);
        yes1.setAnswer("hi!");
        yes1.add((int) 'a');
        int int14 = yes1.getResult();
        int int15 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 138 + "'", int14 == 138);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 138 + "'", int15 == 138);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.setResult(43);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        yes1.setResult((int) (byte) 0);
        yes1.minus((-5));
        yes1.minus((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        int int10 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        yes1.minus((int) (short) 0);
        yes1.minus(43);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.minus(42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) (byte) 0);
        yes1.setResult(69);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        yes1.add((int) (byte) 0);
        yes1.setResult((-89));
        int int11 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-89) + "'", int11 == (-89));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        java.lang.String str10 = yes1.getAnswer();
        int int11 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((int) ' ');
        yes1.add((int) ' ');
        yes1.add((int) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (short) 100);
        yes1.setResult((int) (short) -1);
        yes1.setResult((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        java.lang.String str14 = yes1.getAnswer();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        yes1.setAnswer("");
        yes1.setResult((-31));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        yes yes1 = new yes("");
        yes1.minus((int) (byte) -1);
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        yes1.minus(17);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.minus(9);
        yes1.setResult((-96));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        yes1.setAnswer("");
        yes1.add(54);
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        yes1.minus((int) (byte) 0);
        yes1.setAnswer("hi!");
        int int13 = yes1.getResult();
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        java.lang.String str7 = yes1.getAnswer();
        yes1.setResult((int) (short) 100);
        yes1.setResult(43);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((-1));
        yes1.setAnswer("");
        yes1.setResult(0);
        java.lang.String str15 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.setResult(1);
        yes1.minus((int) (byte) 100);
        java.lang.String str9 = yes1.getAnswer();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.minus((int) 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        java.lang.String str7 = yes1.getAnswer();
        yes1.add((int) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.minus((-47));
        yes1.add(72);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        java.lang.String str13 = yes1.getAnswer();
        yes1.add(51);
        java.lang.String str16 = yes1.getAnswer();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) (short) 10);
        yes1.setAnswer("hi!");
        yes1.minus((-31));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        java.lang.String str7 = yes1.getAnswer();
        yes1.setResult(90);
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        yes1.setAnswer("");
        int int9 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        yes1.minus((int) (byte) 0);
        java.lang.String str13 = yes1.getAnswer();
        yes1.minus((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        java.lang.String str10 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        int int12 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) (short) 10);
        yes1.setAnswer("hi!");
        int int10 = yes1.getResult();
        yes1.minus((-89));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus(0);
        yes1.setResult(100);
        java.lang.String str14 = yes1.getAnswer();
        java.lang.String str15 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus((-44));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (short) 100);
        yes1.setResult((int) (short) -1);
        yes1.setResult((int) (byte) 1);
        yes1.setResult((-5));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.add(100);
        yes1.add(2);
        int int13 = yes1.getResult();
        yes1.add(50);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 154 + "'", int13 == 154);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setResult((-1));
        java.lang.String str13 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.add(98);
        int int18 = yes1.getResult();
        yes1.setResult(42);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.String str6 = yes1.getAnswer();
        yes1.setResult(154);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        int int11 = yes1.getResult();
        yes1.add((-48));
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        yes1.add((int) (short) -1);
        yes1.setResult((-48));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        yes1.minus((-1));
        yes1.setResult((int) (short) 10);
        java.lang.Class<?> wildcardClass18 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.minus(1);
        yes1.setResult((-10));
        yes1.add(9);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.setResult((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        int int10 = yes1.getResult();
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.add((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.String str7 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.minus(33);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        java.lang.String str13 = yes1.getAnswer();
        yes1.add(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        yes1.setResult((int) (short) 0);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }
}

