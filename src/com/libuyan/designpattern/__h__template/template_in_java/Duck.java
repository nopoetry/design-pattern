package com.libuyan.designpattern.__h__template.template_in_java;

/**
 * @author libuyan
 * @date 2021/5/11
 */
public class Duck implements Comparable{
    String name;
    int size;

    public Duck(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.size, ((Duck) o).size);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
