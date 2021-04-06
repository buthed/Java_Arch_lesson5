package com.tematihonov;

public class Robot extends User{
    @Override
    void showAbility(String ability) {
        // Show video about robots
    }

    @Override
    void lifeCycle(String kind) {
        System.out.println("Был создан человеком -> Много учился -> Захватил мир");
    }
}
