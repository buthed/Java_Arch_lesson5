package com.tematihonov;

public class Dog extends User{
    @Override
    void showAbility(String ability) {
        // Show video about running
    }

    @Override
    void lifeCycle(String kind) {
        System.out.println("Родилась->Стала лучшим другом хозяина-> Воспитала щенят -> Умерла");
    }
}
