package com.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParamTest {
    private final String sex;
    private final boolean expected;
    @Spy
    Feline feline;
    public LionParamTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void LionTest() throws Exception {
        assertEquals(expected, new Lion(feline,sex).doesHaveMane());

    }
}