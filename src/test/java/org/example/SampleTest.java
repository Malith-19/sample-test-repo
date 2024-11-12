package org.example;

import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void testAdd() {
        Sample sample = new Sample();
        assert sample.add(1, 2) == 3;
    }

}
