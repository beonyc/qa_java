package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Spy
    private Animal animal;

    @Test
    public void exceptionTest() {

        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        try {
            assertEquals(new ArrayList<>(List.of()), new Animal().getFood("Тестировщик"));
        } catch (Exception e) {
            assertEquals(expected, e.getMessage());

        }
    }

    @Test
    public void getFamilyTest() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());

    }
}