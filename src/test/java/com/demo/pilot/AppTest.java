package com.demo.pilot;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

 
    @Test
    public void testfunc1(){
        assertEquals(4, com.demo.pilot.App.func1(2));
    }
}
