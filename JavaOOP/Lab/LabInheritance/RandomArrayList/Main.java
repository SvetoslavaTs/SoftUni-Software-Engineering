package LabInheritance.RandomArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArrayList = new RandomArrayList(new Random());

        randomArrayList.add(50);
        randomArrayList.add(43);
        randomArrayList.add(12);
        randomArrayList.add(78);

        System.out.println(randomArrayList.getRandomElement());


    }
}
