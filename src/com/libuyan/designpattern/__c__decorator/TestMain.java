package com.libuyan.designpattern.__c__decorator;

import com.libuyan.designpattern.__c__decorator.beverage_decorator.Beverage;
import com.libuyan.designpattern.__c__decorator.beverage_decorator.Coffee;
import com.libuyan.designpattern.__c__decorator.beverage_decorator.condiment.Mocha;
import com.libuyan.designpattern.__c__decorator.test_io_decorator.MyInputStream;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author libuyan
 * @date 2021/5/7 19:11
 */
public class TestMain {
    public static void main(String[] args) {
        //来一杯不需要调料的咖啡
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        //双倍摩卡咖啡
        Beverage doubleMochaCoffee = new Mocha(new Mocha(new Coffee()));
        System.out.println(doubleMochaCoffee.getDescription());
        System.out.println(doubleMochaCoffee.cost());
    }

    @Test
    public void testMyInputStream() throws IOException {
        InputStream inputStream = new MyInputStream(new FileInputStream("d:\\a.txt"));
        int read;
        while((read = inputStream.read()) >= 0) {
            System.out.println((char)read);
        }
    }
}
