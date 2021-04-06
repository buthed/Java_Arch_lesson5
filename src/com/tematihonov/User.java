package com.tematihonov;

public abstract class User {
    String kind;
    String name;
    int age;
    int lvl;
    String ability;

    public String showPicture() {
        //вывод карточки с персонажем
        return "Вид: " + kind + "\n" + "Имя: " + name + "\n" + "Возраст: " + age + "\n" + "Уровень: " + lvl + "\n" + "Главный талант: " + ability;

    }

    public void upgrade(String name) {
        lvl+=1;
    }

    abstract void showAbility(String ability);

    abstract void lifeCycle(String kind);


}
