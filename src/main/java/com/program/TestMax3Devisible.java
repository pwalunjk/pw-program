package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestMax3Devisible {
    public static void main(String[] args) {
        // new TestMax3Devisible().test();
        new TestMax3Devisible().testPW();
        System.out.println(Math.pow(10, 0));
        System.out.println(Math.pow(10, 1));

        System.out.println(Math.pow(10, 2));
    }

    public void testPW() {
        // Integer[] intArray = { 8, 1, 6, 0, 4, 1, 1, 2 };
        // Integer intArray[] = { 1, 2, 4, 5, 6, 1, 0, 9, 2, 0 };
        // Integer intArray[] = { 1, 2, 0, 1 };
        Integer intArray[] = { 1, 2, 3, 4, 5, 7, 0 };
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(intArray));
        Collections.sort(list);

        System.out.println(list);

        while (true) {
            long number = list.get(0);
            int pow = 1;
            for (int i = 1; i < list.size(); i++) {
                number += (long) (list.get(i) * Math.pow(10, pow++));
            }

            if (number % 3 == 0) {
                System.out.println(number);
                break;
            } else {
                int removeIndex = 0;
                if (list.get(0) == 0) {
                    removeIndex++;
                }
                list.remove(removeIndex);
                Collections.sort(list);
                System.out.println(list);
            }
        }
    }


    public void test() {
        // Integer[] intArray = { 4, 2 };
        Integer[] intArray = { 1, 0, 4, 2 };

        List<Integer> asList = new ArrayList<Integer>(Arrays.asList(intArray));
        Collections.sort(asList);

        System.out.println(asList);

        if (asList.size() == 0) {
            System.out.println("Please provide numbers");
        }

        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(intArray));
        ArrayList<Long> max = new ArrayList<Long>();
        Collections.sort(list);
        if (list.get(0) != 0) {
            System.out.println("Can not find such number!!!");
            return;
        }
        int k = 1;
        int nocosiderDigit = -1;
        boolean remove = false;
        while (true) {

            long number = list.get(0);
            int pow = 1;
            for (int i = 1; i < list.size(); i++) {
                if (nocosiderDigit == i) {
                    continue;
                }
                number += (long) (list.get(i) * Math.pow(10, pow++));
            }
            if (number % 3 == 0) {
                max.add(number);

            }
            while (true) {
                if (list.get(k) % 3 != 0) {
                    if (!remove) {
                        nocosiderDigit = list.indexOf(list.get(k));
                    } else {
                        list.remove(k);
                    }
                    k++;
                    break;
                }
                k++;

                if (k >= list.size()) {
                    break;
                }

            }
            if (k >= list.size()) {
                if (max.size() == 0 && !remove) {
                    k = 1;
                    remove = true;
                } else {
                    break;
                }

            }

        }
        if (max.size() > 0) {
            Collections.sort(max);
            System.out.println(max.get(max.size() - 1));
            System.out.println(" NUMBER" + max.toString());
        } else {
            System.out.println("Can not find such number!!!");
        }

    }

}
