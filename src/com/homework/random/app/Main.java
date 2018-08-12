package com.homework.random.app;

import com.homework.random.model.Sets;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<>();
        Sets sets = new Sets();

        System.out.println("Zbiór wynosi: " + sets.randomSet(treeSet));
        System.out.println("Minimalna wartość ze zbioru wynosi: " + sets.min(treeSet));
        System.out.println("Maksymalna wartość ze zbioru wynosi: " + sets.max(treeSet));

        System.out.println("Srednia arytmetyczna wynosi: "+sets.average(treeSet));

        Integer srednia = sets.average(treeSet);
        System.out.println("Wartości powyżej średniej arytmetycznej ze zbioru wynoszą: " + treeSet.subSet(srednia, treeSet.last()));


    }


}
