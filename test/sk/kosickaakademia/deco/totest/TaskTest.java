package sk.kosickaakademia.deco.totest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task task;

    @BeforeEach
    void setUp() {
        task=new Task();
    }

    @AfterEach
    void tearDown() {
        task=null;
    }

    @Test
    void sum() {
        assertEquals(0, task.sum(5,-5));
        assertEquals(0, task.sum(9999999,-9999999));
        assertEquals(10, task.sum(5,5));
        assertEquals(-2, task.sum(3,-5));

    }

    @Test
    void isPrimeNum() {
        assertTrue(task.isPrimeNum(11));
        assertTrue(task.isPrimeNum(7));
        assertTrue(task.isPrimeNum(997));
        assertTrue(task.isPrimeNum(2));
        assertTrue(task.isPrimeNum(3));
        assertFalse(task.isPrimeNum(1000000));
        assertFalse(task.isPrimeNum(1));
        assertFalse(task.isPrimeNum(1000000));
        assertFalse(task.isPrimeNum(0));

    }

    @Test
    void isRectangular() {
        assertTrue(task.isRectangular(3,4,5));
        assertTrue(task.isRectangular(4,5,3));

        assertFalse(task.isRectangular(20,40,52));
        assertFalse(task.isRectangular(0,0,0));
        assertFalse(task.isRectangular(-1,2,3));
        assertFalse(task.isRectangular(4,5,6));
    }

    @Test
    void reverse() {
        assertNull(task.reverse(null));
        assertEquals("",task.reverse(""));
        assertEquals(" ",task.reverse(" "));
        assertEquals("god",task.reverse("dog"));
        assertEquals("a",task.reverse("a"));
        assertEquals("",task.reverse(""));
        assertEquals("  trIs",task.reverse("sIrt  "));
        assertEquals("",task.reverse(""));
    }

    @Test
    void findIt() {
        int[] arr1={1,2,2,1,2,1,1};
        assertEquals(2,task.findIt(arr1));
        int[] arr2={0,6,-99,6,0};
        assertEquals(-99,task.findIt(arr2));
        int[] arr3={80,80,-365,78,1234567890,78,-365};
        assertEquals(1234567890,task.findIt(arr3));
    }

    @Test
    void maskify() {
        assertEquals("",task.maskify(""));
        assertEquals("#9327",task.maskify("09327"));
        assertEquals("",task.maskify(""));
        assertEquals("KLmO",task.maskify("KLmO"));
        assertEquals("########pets",task.maskify("ante/*{]pets"));
        assertEquals("abc",task.maskify("abc"));
        assertNull(task.maskify(null));
    }

    @Test
    void getMiddle() {
        assertEquals("",task.maskify(""));
        assertNull(task.maskify(null));
        assertEquals("t",task.getMiddle("matka"));
        assertEquals("h",task.getMiddle("  hot"));
        assertEquals("Ue",task.getMiddle("TrUest"));

    }

    @Test
    void terminovanyVklad() {
        assertEquals(1000,task.terminovanyVklad(1000,0,23,false));
        assertEquals(1800,task.terminovanyVklad(1000,1,80,false));

        assertEquals(1080,task.terminovanyVklad(1000,1,10,true));
        assertEquals(0,task.terminovanyVklad(-1080,1,10,true));

        assertEquals(1000,task.terminovanyVklad(1000,1,0,true));
        assertEquals(1728,task.terminovanyVklad(1000,3,20,false));

        assertEquals(0,task.terminovanyVklad(1000,-1,20,false));
        assertEquals(1728,task.terminovanyVklad(1000,3,20,false));
    }

    @Test
    void calcTripPrice() {
        assertEquals(0,task.calcTripPrice(0,8.5,1.21));
        assertEquals(0,task.calcTripPrice(-0.1,8.5,1.21));

        assertEquals(98.11,task.calcTripPrice(0.1,399.89,245.33));
        assertEquals(12.35,task.calcTripPrice(200,5.67,1.089));

        assertEquals(0,task.calcTripPrice(200,-1,1.089));
        assertEquals(0,task.calcTripPrice(200,5.67,-1));

        assertEquals(0,task.calcTripPrice(200,5.67,0));
        assertEquals(1879.43,task.calcTripPrice(5784,10.11,3.214));
    }

    @Test
    void max() {
        int[] arr1={};
        assertEquals(0,task.max(arr1));
        int[] arr2={-99};
        assertEquals(-99,task.max(arr2));
        int[] arr3={1,2,3,4,5,6,7,8,9,8,125,-329,248,10,26,-68,0};
        assertEquals(248,task.max(arr3));
    }

    @Test
    void isPalindrom() {
        assertTrue(task.isPalindrom(121));
        assertTrue(task.isPalindrom(0));
        assertTrue(task.isPalindrom(95159));

        assertFalse(task.isPalindrom(789981));
        assertFalse(task.isPalindrom(29));
        assertFalse(task.isPalindrom(36789124));
        assertFalse(task.isPalindrom(-121));
    }

    @Test
    void breakCamelCase() {
        assertEquals("camel Case",task.breakCamelCase("camelCase"));
        assertEquals("Camel Case",task.breakCamelCase("CamelCase"));
        assertEquals("Camelcase",task.breakCamelCase("Camelcase"));
        assertEquals("camelcase",task.breakCamelCase("camelcase"));
        assertEquals("camel Case Is Working Breaking",task.breakCamelCase("camelCaseIsWorkingBreaking"));
        assertEquals("",task.breakCamelCase(""));
        assertEquals("a",task.breakCamelCase("a"));
        assertEquals("A",task.breakCamelCase("A"));
        assertEquals("A B",task.breakCamelCase("AB"));
        assertNull(task.breakCamelCase(null));

        assertEquals("camel Casing", task.breakCamelCase("camelCasing"));
        assertEquals("camel Casing Test", task.breakCamelCase("camelCasingTest"));
        assertEquals("camelcasingtest", task.breakCamelCase("camelcasingtest"));
    }
}