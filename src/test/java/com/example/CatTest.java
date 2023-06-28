package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private Cat cat;
    @Mock
    private Feline felineMock;

    @Test
    public void getSoundTest() {//Функциональный тест метода getSound()
        String expected = "Мяу";
        cat = new Cat(new Feline());
       assertEquals(expected, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {//Функциональный тест метода getFood()
        cat = new Cat(new Feline());
        assertTrue(cat.getFood().containsAll(List.of("Животные", "Птицы", "Рыба")));
    }

    @Test
    public void getFoodMockTest() throws Exception {//Мок тест метода getFood() с использованием стаба
        List<String> expected = List.of("Бургер", "Кола");
        cat = new Cat(felineMock);
        Mockito.when(felineMock.eatMeat()).thenReturn(expected);
        assertEquals(expected, cat.getFood());
    }

}