package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion(Feline feline) {
        super(feline);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глории", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
