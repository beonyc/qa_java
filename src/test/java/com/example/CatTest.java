package com.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


class CatTest {



    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getSoundTest()  {
        String expected = "Мяу";
        Cat cat = new Cat(new Feline());
        assertEquals(expected, cat.getSound());

    }
    @Test
    public  void getFoodTest() throws Exception{
        Cat cat = new Cat(new Feline());
        assertTrue(cat.getFood().containsAll(List.of("Животные", "Птицы", "Рыба")));
    }


}