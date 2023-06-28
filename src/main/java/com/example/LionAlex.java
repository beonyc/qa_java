package com.example;

import java.util.ArrayList;
import java.util.List;

public class LionAlex extends Lion {
    private final int kittensCount;

    public LionAlex() throws Exception {
        super("Самец");
        this.kittensCount = 0;
    }

    public List<String> getFriends() {
        return new ArrayList<>(List.of("Марти", "Глория", "Мелман"));
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return this.kittensCount;
    }
}
