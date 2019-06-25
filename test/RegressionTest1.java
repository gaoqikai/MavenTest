import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus((-1));
        int int11 = yes1.getResult();
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 43 + "'", int11 == 43);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.setResult(3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.add((int) (short) 10);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        int int10 = yes1.getResult();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        yes1.setResult((int) (byte) 0);
        yes1.setResult(1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((-48));
        yes1.minus((int) (byte) -1);
        int int14 = yes1.getResult();
        yes1.add((int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5) + "'", int14 == (-5));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setResult((-89));
        yes1.minus((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        yes1.add((-31));
        yes1.setResult((-44));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        yes1.minus(17);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-48) + "'", int12 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (byte) 100);
        int int8 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (short) 100);
        yes1.setResult((int) (short) -1);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        yes1.add(100);
        yes1.setResult(51);
        java.lang.String str13 = yes1.getAnswer();
        int int14 = yes1.getResult();
        yes1.minus(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add(10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("");
        java.lang.String str6 = yes1.getAnswer();
        java.lang.String str7 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        yes1.setAnswer("hi!");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.setAnswer("hi!");
        yes1.add(72);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.setResult(51);
        yes1.setResult((-47));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add(97);
        yes1.minus(72);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        yes1.add(51);
        yes1.setResult((-1));
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.setResult((-90));
        int int14 = yes1.getResult();
        java.lang.String str15 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-90) + "'", int14 == (-90));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        yes1.setAnswer("hi!");
        java.lang.String str17 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) (short) 10);
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.add(54);
        yes1.setResult(104);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        yes1.setResult(0);
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        yes1.minus(8);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setAnswer("hi!");
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        java.lang.String str16 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.setResult((-44));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        yes1.add(2);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.setAnswer("hi!");
        yes1.minus(43);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult(2);
        yes1.minus(0);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        yes1.minus((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        yes1.minus(42);
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        yes1.add(0);
        java.lang.Class<?> wildcardClass17 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        int int3 = yes1.getResult();
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setResult(52);
        yes1.setResult((int) '#');
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        int int10 = yes1.getResult();
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.add((int) '4');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        int int5 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        yes1.minus(0);
        yes1.setResult(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setResult((-48));
        int int8 = yes1.getResult();
        int int9 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-48) + "'", int8 == (-48));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-48) + "'", int9 == (-48));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.minus(54);
        java.lang.String str15 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass18 = yes1.getClass();
        java.lang.String str19 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("");
        java.lang.String str6 = yes1.getAnswer();
        yes1.add(69);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.setResult(1);
        yes1.minus((int) (byte) 100);
        java.lang.String str9 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) (byte) 10);
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.setResult(1);
        yes1.minus((int) (byte) 100);
        java.lang.String str9 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        int int11 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-99) + "'", int11 == (-99));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.minus(54);
        int int11 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-53) + "'", int11 == (-53));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        java.lang.String str10 = yes1.getAnswer();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.add(2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setResult(52);
        java.lang.String str6 = yes1.getAnswer();
        java.lang.String str7 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.setAnswer("hi!");
        yes1.add((-89));
        java.lang.Class<?> wildcardClass16 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        yes1.setResult(1);
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        yes1.setResult((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.add((-1));
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.add((int) (byte) 100);
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        int int9 = yes1.getResult();
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult(2);
        yes1.minus(0);
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.String str10 = yes1.getAnswer();
        java.lang.String str11 = yes1.getAnswer();
        int int12 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        yes yes1 = new yes("hi!");
        java.lang.Class<?> wildcardClass2 = yes1.getClass();
        yes1.add((int) (short) 10);
        java.lang.String str5 = yes1.getAnswer();
        int int6 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.minus((int) (short) -1);
        yes1.add((-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.add(10);
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        int int3 = yes1.getResult();
        yes1.setResult((int) (byte) 0);
        yes1.minus((int) (short) 10);
        yes1.setAnswer("hi!");
        java.lang.String str10 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        int int7 = yes1.getResult();
        int int8 = yes1.getResult();
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        java.lang.Class<?> wildcardClass21 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.add(51);
        int int13 = yes1.getResult();
        yes1.setResult(54);
        java.lang.String str16 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.minus((int) (byte) 10);
        yes1.minus((int) (short) 1);
        yes1.setResult((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (byte) -1);
        java.lang.String str9 = yes1.getAnswer();
        yes1.minus(0);
        yes1.minus(43);
        yes1.minus(0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.add((-43));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.add((-1));
        yes1.setAnswer("hi!");
        yes1.setResult((-31));
        java.lang.String str16 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        int int5 = yes1.getResult();
        yes1.minus(154);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.add((-1));
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        java.lang.String str13 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.setResult((int) (short) 1);
        int int14 = yes1.getResult();
        yes1.setResult(90);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        yes1.setAnswer("hi!");
        yes1.add(2);
        yes1.minus(8);
        yes1.add(10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.setResult((-44));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.minus(100);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        int int8 = yes1.getResult();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        yes1.add((int) (byte) 0);
        yes1.setResult((-89));
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        java.lang.String str7 = yes1.getAnswer();
        yes1.minus(52);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        int int8 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add(10);
        java.lang.String str12 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.setAnswer("");
        yes1.add((-90));
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass19 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setAnswer("");
        yes1.add((int) ' ');
        yes1.minus(62);
        yes1.add((-44));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        int int7 = yes1.getResult();
        yes1.minus((int) (short) 0);
        int int10 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.minus((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.add(52);
        yes1.add(72);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        int int5 = yes1.getResult();
        java.lang.String str6 = yes1.getAnswer();
        java.lang.String str7 = yes1.getAnswer();
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        yes1.setAnswer("");
        yes1.minus((-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        yes yes1 = new yes("");
        yes1.minus((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        int int8 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.minus(54);
        yes1.setAnswer("");
        int int15 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.minus((-45));
        yes1.setResult(98);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        yes1.minus(41);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        yes1.setResult(10);
        yes1.add((int) (short) -1);
        int int15 = yes1.getResult();
        int int16 = yes1.getResult();
        yes1.setResult((-53));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setResult(0);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.String str8 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        yes1.add((-1));
        yes1.minus((int) '#');
        int int14 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setResult(52);
        yes1.add((-48));
        int int8 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("");
        java.lang.String str6 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.add((int) (short) 100);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("");
        yes1.setAnswer("");
        yes1.add((int) (short) -1);
        yes1.setAnswer("hi!");
        yes1.minus(0);
        int int14 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 41 + "'", int14 == 41);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.add((int) (short) 1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        java.lang.String str12 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        int int7 = yes1.getResult();
        yes1.add((int) '4');
        int int10 = yes1.getResult();
        yes1.minus((-44));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-48) + "'", int7 == (-48));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        yes1.add((-31));
        yes1.minus((-96));
        java.lang.String str11 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setAnswer("hi!");
        yes1.add(17);
        java.lang.Class<?> wildcardClass15 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        yes1.add((int) (short) -1);
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 41 + "'", int13 == 41);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        yes1.add(4);
        java.lang.Class<?> wildcardClass20 = yes1.getClass();
        java.lang.String str21 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.String str12 = yes1.getAnswer();
        int int13 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 42 + "'", int13 == 42);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        int int11 = yes1.getResult();
        yes1.add((int) '#');
        yes1.setResult((int) '4');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add(52);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.add((-99));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setResult((-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        yes1.minus((-31));
        java.lang.String str15 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        yes yes1 = new yes("hi!");
        yes1.setAnswer("hi!");
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        int int9 = yes1.getResult();
        yes1.add(50);
        int int12 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        int int6 = yes1.getResult();
        yes1.setResult(62);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.add((int) (byte) -1);
        yes1.minus(1);
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        yes1.minus(51);
        yes1.add((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus(9);
        yes1.setAnswer("");
        yes1.add((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        yes1.setResult(98);
        yes1.minus(52);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add(53);
        yes1.add((-44));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.setResult(136);
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.setResult((int) (short) 100);
        yes1.setResult((int) (short) -1);
        yes1.setResult((int) (byte) 1);
        yes1.setResult(42);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        yes yes1 = new yes("");
        yes1.setAnswer("");
        yes1.setResult((int) '#');
        yes1.minus(2);
        yes1.setAnswer("hi!");
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        yes yes1 = new yes("hi!");
        yes1.add(42);
        yes1.setAnswer("");
        yes1.setAnswer("");
        yes1.add((int) (short) -1);
        yes1.setAnswer("hi!");
        java.lang.String str12 = yes1.getAnswer();
        java.lang.String str13 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        yes1.minus((int) (byte) 0);
        yes1.setAnswer("hi!");
        yes1.setResult(9);
        yes1.setResult((-48));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus((int) 'a');
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        java.lang.String str11 = yes1.getAnswer();
        yes1.setResult(2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        int int6 = yes1.getResult();
        yes1.minus((-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        int int5 = yes1.getResult();
        yes1.minus((int) 'a');
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        yes1.add((-53));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.add((-1));
        yes1.setResult((int) (short) -1);
        java.lang.String str8 = yes1.getAnswer();
        yes1.setResult((-45));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) ' ');
        yes1.minus(41);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        yes1.setAnswer("hi!");
        yes1.setResult(0);
        yes1.add((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.add((int) (short) -1);
        yes1.setAnswer("");
        yes1.setResult(136);
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.minus(10);
        int int11 = yes1.getResult();
        int int12 = yes1.getResult();
        yes1.setResult(54);
        java.lang.String str15 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 90 + "'", int11 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        java.lang.String str7 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        yes1.add((-2));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.minus((int) 'a');
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.setResult(52);
        yes1.setAnswer("");
        yes1.minus(1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.add(8);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.minus((int) 'a');
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        int int11 = yes1.getResult();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        java.lang.String str13 = yes1.getAnswer();
        int int14 = yes1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-96) + "'", int11 == (-96));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-96) + "'", int14 == (-96));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((-1));
        yes1.minus(62);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        yes1.minus((-48));
        yes1.minus(17);
        yes1.minus(136);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        java.lang.String str11 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.setAnswer("");
        java.lang.String str5 = yes1.getAnswer();
        java.lang.String str6 = yes1.getAnswer();
        yes1.add((int) 'a');
        yes1.setAnswer("hi!");
        yes1.setResult(52);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.minus((int) 'a');
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        int int11 = yes1.getResult();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        java.lang.String str13 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-96) + "'", int11 == (-96));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add(52);
        java.lang.String str7 = yes1.getAnswer();
        int int8 = yes1.getResult();
        yes1.minus(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 104 + "'", int8 == 104);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        yes1.add((int) '#');
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        java.lang.String str9 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) (short) 1);
        yes1.setResult((-45));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        java.lang.String str5 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (short) 100);
        yes1.minus(51);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.minus((int) (byte) 100);
        int int6 = yes1.getResult();
        java.lang.Class<?> wildcardClass7 = yes1.getClass();
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.add(51);
        int int13 = yes1.getResult();
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-48) + "'", int6 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setResult(54);
        yes1.setAnswer("");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.String str6 = yes1.getAnswer();
        yes1.add(98);
        yes1.setResult((-47));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.setResult((int) (byte) 1);
        yes1.setResult((-2));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult(10);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.minus((int) (short) 100);
        yes1.setAnswer("hi!");
        yes1.setAnswer("hi!");
        java.lang.String str16 = yes1.getAnswer();
        java.lang.String str17 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        yes1.add((int) '4');
        yes1.minus(0);
        int int18 = yes1.getResult();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 93 + "'", int18 == 93);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.add((int) (byte) -1);
        yes1.setResult((int) (byte) 100);
        yes1.setResult((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        yes1.minus((-47));
        java.lang.String str14 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        yes1.setAnswer("");
        java.lang.String str8 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        yes1.add((int) (byte) 100);
        yes1.minus(136);
        yes1.add((int) (byte) -1);
        java.lang.String str16 = yes1.getAnswer();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        int int7 = yes1.getResult();
        java.lang.Class<?> wildcardClass8 = yes1.getClass();
        yes1.setAnswer("");
        yes1.setAnswer("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        yes1.add((int) ' ');
        java.lang.String str8 = yes1.getAnswer();
        yes1.add(52);
        java.lang.Class<?> wildcardClass11 = yes1.getClass();
        java.lang.String str12 = yes1.getAnswer();
        yes1.add((int) (byte) 10);
        yes1.minus((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        yes yes1 = new yes("");
        yes1.minus((int) (short) -1);
        yes1.setAnswer("");
        yes1.setAnswer("hi!");
        yes1.minus((int) 'a');
        java.lang.Class<?> wildcardClass10 = yes1.getClass();
        yes1.setResult((int) (short) -1);
        yes1.setResult(138);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass5 = yes1.getClass();
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.setResult(0);
        java.lang.Class<?> wildcardClass9 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.String str4 = yes1.getAnswer();
        yes1.minus((int) (short) 10);
        yes1.minus((int) (short) 0);
        yes1.minus((int) (short) 10);
        yes1.setAnswer("");
        java.lang.String str13 = yes1.getAnswer();
        java.lang.Class<?> wildcardClass14 = yes1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        yes1.setResult((int) (short) 10);
        int int11 = yes1.getResult();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        yes1.setAnswer("");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = yes1.getClass();
        yes1.setResult(0);
        yes1.add(1);
        int int9 = yes1.getResult();
        yes1.setAnswer("");
        yes1.add((-48));
        java.lang.String str14 = yes1.getAnswer();
        yes1.setResult(104);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        yes1.setAnswer("hi!");
        java.lang.Class<?> wildcardClass6 = yes1.getClass();
        yes1.add((int) (byte) 10);
        java.lang.String str9 = yes1.getAnswer();
        int int10 = yes1.getResult();
        int int11 = yes1.getResult();
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        yes yes1 = new yes("hi!");
        java.lang.String str2 = yes1.getAnswer();
        yes1.minus((int) (short) -1);
        yes1.setResult((int) (byte) 1);
        int int7 = yes1.getResult();
        yes1.setAnswer("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        yes yes1 = new yes("hi!");
        yes1.add((int) '4');
        int int4 = yes1.getResult();
        int int5 = yes1.getResult();
        yes1.setAnswer("hi!");
        yes1.minus((int) (byte) 100);
        yes1.add((int) '#');
        java.lang.Class<?> wildcardClass12 = yes1.getClass();
        yes1.setResult((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

