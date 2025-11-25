package com.demo.pilot;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


public class CycleTest {

 
    @Test
    public void testCycle(){

        Cycle cycle = new Cycle();
        assertEquals(0, cycle.Wheels());
    }
     @Test
     public void testUniCycle(){

        Cycle cycle = new Unicycle();        
        assertEquals(1, cycle.Wheels());
    }
     @Test
     public void testBiCycle(){

        Cycle cycle = new Bicycle();
        assertEquals(2, cycle.Wheels());
    }
}
