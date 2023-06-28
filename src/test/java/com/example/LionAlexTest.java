package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Spy
    private LionAlex lionAlexsSpy;
    @Spy
    private LionAlex lionAlexMock;

    @Test
    public void getKittensTest() throws Exception {
        assertEquals(0, new LionAlex().getKittens());
    }

    @Test
    public void getFriendsTest() {
        List<String> expectedFriendList = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriendList, lionAlexsSpy.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        Mockito.when(lionAlexMock.getPlaceOfLiving()).thenReturn("Нью-Йоркский зоопарк");
        assertEquals(lionAlexMock.getPlaceOfLiving(), lionAlexsSpy.getPlaceOfLiving());
        Mockito.verify(lionAlexMock, Mockito.times(1)).getPlaceOfLiving();

    }

}