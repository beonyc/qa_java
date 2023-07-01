package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline felineSpy;

    @Test
    public void eatMeatSpyTest() throws Exception {//проверка метода eatMeat() с помощью spy
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,felineSpy.eatMeat());

    }

    @Test
    public void getFamilySpyTest() {//тест метода getFamily() с помощью spy
        String expected = "Кошачьи";
        assertEquals(expected, felineSpy.getFamily());
        Mockito.verify(felineSpy, Mockito.times(1)).getFamily();

    }

    @Test
    public void getKittensWithNoParamTest() {//функциональный тест метода getKittens() без параметров
        assertEquals(1, new Feline().getKittens());
    }
}