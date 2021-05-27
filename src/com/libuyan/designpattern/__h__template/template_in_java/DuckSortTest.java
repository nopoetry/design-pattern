package com.libuyan.designpattern.__h__template.template_in_java;

import java.util.Arrays;

/**
 * @author libuyan
 * @date 2021/5/11 9:38
 */
public class DuckSortTest {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[3];
        ducks[0] = new Duck("tom", 2);
        ducks[1] = new Duck("jack", 1);
        ducks[2] = new Duck("rose", 3);

        Arrays.sort(ducks);
        System.out.println(Arrays.toString(ducks));
    }
}

