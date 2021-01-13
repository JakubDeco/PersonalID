package sk.kosickaakademia.deco.totest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void sum() {
        Task task=new Task();
        assertEquals(0, task.sum(5,-5));
        assertEquals(0, task.sum(9999999,-9999999));
        assertEquals(10, task.sum(5,5));
        assertEquals(-2, task.sum(3,-5));

    }

    @Test
    void isPrimeNum() {
        Task task=new Task();
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
        Task task=new Task();
        assertTrue(task.isRectangular(3,4,5));
        assertTrue(task.isRectangular(4,5,3));
        assertTrue(task.isRectangular(20,40,52));

        assertFalse(task.isRectangular(0,0,0));
        assertFalse(task.isRectangular(-1,2,3));
        assertFalse(task.isRectangular(4,5,6));
    }

    @Test
    void reverse() {
        Task task=new Task();
        assertNull(task.reverse(null));
        assertEquals("",task.reverse(""));
        assertEquals(" ",task.reverse(" "));
        assertEquals("god",task.reverse("dog"));
        assertEquals("a",task.reverse("a"));
        assertEquals("",task.reverse(""));
        assertEquals("  trIs",task.reverse("sIrt  "));
        assertEquals("",task.reverse(""));
    }
}