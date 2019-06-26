import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.minus((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        calculator calculator0 = new calculator();
        int int1 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        int int2 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 10);
        calculator0.minus((int) '#');
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (short) 10);
        calculator0.minus((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.setResult((int) ' ');
        calculator0.add((int) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        calculator0.setResult((int) (byte) 1);
        calculator0.minus((int) (byte) 100);
        calculator0.minus((-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        calculator calculator0 = new calculator();
        calculator0.add((int) (short) -1);
        calculator0.setResult(10);
        calculator0.setResult((int) ' ');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.minus((int) (byte) 1);
        calculator0.setResult((int) '4');
        calculator0.add((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.minus((int) (byte) 1);
        calculator0.setResult((int) '4');
        calculator0.add((int) (short) -1);
        int int8 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        calculator calculator0 = new calculator();
        calculator0.setResult((int) (byte) -1);
        calculator0.setResult((int) (byte) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (byte) 100);
        calculator0.minus((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        calculator0.setResult((int) (byte) 1);
        calculator0.add((int) (byte) -1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        calculator calculator0 = new calculator();
        calculator0.add((int) (short) -1);
        calculator0.setResult(10);
        calculator0.setResult((int) 'a');
        calculator0.minus((int) '4');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.add((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        calculator calculator0 = new calculator();
        calculator0.minus((int) ' ');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (byte) 100);
        calculator0.minus(0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        calculator0.add((int) ' ');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.minus((int) (byte) 1);
        calculator0.setResult((int) '4');
        calculator0.add((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        int int9 = calculator0.getResult();
        calculator0.setResult((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        calculator calculator0 = new calculator();
        calculator0.add((int) (short) -1);
        calculator0.setResult(10);
        int int5 = calculator0.getResult();
        calculator0.minus((int) (byte) -1);
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (byte) 100);
        int int4 = calculator0.getResult();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.minus((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (short) 10);
        calculator0.add((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.minus((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.minus((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 10);
        calculator0.setResult((int) (short) 100);
        calculator0.add(100);
        calculator0.add(10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.minus((int) (byte) 1);
        calculator0.setResult((int) '4');
        calculator0.setResult((int) (short) 0);
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.minus((int) (byte) 1);
        calculator0.setResult((int) '4');
        calculator0.add((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.minus((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) 1);
        calculator0.minus((int) '4');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult(100);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (byte) 100);
        int int4 = calculator0.getResult();
        calculator0.minus(100);
        calculator0.minus(100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        calculator calculator0 = new calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        calculator0.setResult((int) (short) 10);
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.setResult((int) ' ');
        calculator0.setResult((int) (short) 100);
        calculator0.minus((int) ' ');
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        calculator0.setResult((int) (byte) 1);
        calculator0.add(100);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 10);
        calculator0.minus((int) '#');
        calculator0.setResult((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        calculator0.setResult((int) (byte) 1);
        calculator0.minus((int) (byte) 100);
        calculator0.add(0);
        calculator0.setResult((int) (byte) 1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.add(0);
        int int5 = calculator0.getResult();
        calculator0.minus((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        calculator calculator0 = new calculator();
        calculator0.add((int) (short) -1);
        calculator0.setResult(10);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 10);
        calculator0.minus((int) '#');
        calculator0.setResult((int) (byte) 1);
        calculator0.minus((int) (short) 1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        calculator calculator0 = new calculator();
        calculator0.minus((int) (byte) -1);
        calculator0.minus((int) (short) 1);
        calculator0.setResult((int) (byte) 1);
        calculator0.minus((int) (byte) 100);
        calculator0.add(0);
        calculator0.minus((int) '#');
    }
}

