package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {
    @Mock
    Lion lionMock;
    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getKittens() {
        Feline feline=new Feline();
        Lion lion=new Lion(feline);
        System.out.println(lion.getKittens());
    }

    @Test
    void doesHaveMane() {
    }

    @ParameterizedTest
    @CsvSource({
            "true,Самец",
            "false,Самка",

    })
    void getFood(boolean expected, String sex) throws Exception {
            lionMock= new Lion(sex);
            assertEquals(expected, lionMock.doesHaveMane());

    }
}