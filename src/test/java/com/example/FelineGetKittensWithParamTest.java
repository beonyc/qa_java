package com.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineGetKittensWithParamTest {
    @Mock
    private Feline felineSub;
    private final int kittensCount;

    public FelineGetKittensWithParamTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static Object[] getKittensCount() {
        return new Object[]{1, 2, 3, 4, 5, 6, 7};
    }

    @Test
    public void getKittensWithParamTest() {//параметизированный тест для метода getKittens(int kittensCount) с помощью стабов
        Mockito.when(felineSub.getKittens(Mockito.anyInt())).thenReturn(kittensCount);
        assertEquals(kittensCount, felineSub.getKittens(kittensCount));
    }
}