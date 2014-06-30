package com.joshmahony.tenpointone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by josh on 30/06/14.
 */
public class StackTest {

    Stack stack;

    @Before
    public void setup() {
        stack = new Stack(5);
    }

    @Test
    public void testEmpty() {
        assertTrue(stack.empty());
    }

    @Test
    public void testPush() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testFillAndEmpty() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }

    @Test(expected = RuntimeException.class)
    public void testUnderflowException() {
        stack.pop();
    }

}
