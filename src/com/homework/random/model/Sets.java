package com.homework.random.model;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public  class Sets {

    public  Object min(TreeSet treeSet) {

        return treeSet.first();
    }

    public Object max(TreeSet treeSet) {

        return treeSet.last();
    }

    public TreeSet randomSet(TreeSet treeSet) {

        Random random = new Random();

        for (int i = 0; i <= 50; i++) {


            treeSet.add(random.nextInt(1001));

        }
        return treeSet;
    }

    public Integer average(TreeSet treeSet) {

        Integer average = 0;
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()) {

            Integer sum = 0;

            for (Object secik : treeSet) {
                sum = sum + it.next();

            }
            average = (sum / treeSet.size());
        }
        return average;

    }


    }






