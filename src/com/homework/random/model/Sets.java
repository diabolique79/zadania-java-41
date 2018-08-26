package com.homework.random.model;

import java.util.*;

public class Sets {

    public Integer min(TreeSet<Integer> treeSet) {

        return treeSet.first();
    }

    public Integer max(TreeSet<Integer> treeSet) {

        return treeSet.last();
    }

    public TreeSet<Integer> randomSet(TreeSet<Integer> treeSet) {

        Random random = new Random();
        int a;

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            a = random.nextInt(1001);
            list.add(a);
        }
        Collections.sort(list);

        for (int i = 0; treeSet.size() < 50; i++) {
            treeSet.add(list.get(i));
        }

        return treeSet;
    }


    //metoda, którą sprawdzam sobie wielkość listy.
    public void rand(TreeSet<Integer> treeSet) {

        Random random = new Random();
        int a;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            a = random.nextInt(1001);
            list.add(a);
        }
        Collections.sort(list);

        int i = 0;
        while (treeSet.size() == 50) {
            treeSet.add(list.get(i));
        }
        System.out.println(list.size());

    }

    public Integer average(TreeSet<Integer> treeSet) {

        Integer average = 0;
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()) {

            Integer sum = 0;

            for (Integer secik : treeSet) {
                sum = sum + it.next();

            }
            average = (sum / treeSet.size());
        }
        return average;

    }


}






