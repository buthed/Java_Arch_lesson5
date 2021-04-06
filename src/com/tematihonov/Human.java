package com.tematihonov;

public class Human extends User {
    @Override
    void showAbility(String ability) {
        // Show video about Humans
    }

    @Override
    void lifeCycle(String kind) {
        System.out.println("Родился -> Отучился-> Поработал -> Умер");
    }
}
