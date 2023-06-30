package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String sex="Самец";
    @Mock
    private Feline feline;
    @Spy
    private Feline felineSpy;

    @Test
    public void LionExceptionTest() {
        String expected = "Используйте допустимые значения пола животного - самей или самка";
        try {
            assertFalse(new Lion(feline, "Тестировщик").hasMane);
        } catch (Exception e) {
            assertEquals(expected, e.getMessage());
        }
    }

    @Test
    public void getKittensTest() throws Exception {
        new Lion(feline, sex).getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Mockito.when(new Lion(feline, sex).getKittens()).thenReturn(20);
        assertEquals(20, new Lion(feline, sex).getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(foodList, new Lion(felineSpy, sex).getFood());
    }


}