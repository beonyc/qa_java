package com.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalParamTest {
    private final String animalKind;
    private final List<String> animalKindExpectedList;
    @Spy
    private Animal animal;

    public AnimalParamTest(String animalKind, List<String> animalKindExpectedList) {
        this.animalKind = animalKind;
        this.animalKindExpectedList = animalKindExpectedList;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getFoodTest() throws Exception {
        assertEquals(animalKindExpectedList, animal.getFood(animalKind));
    }
}