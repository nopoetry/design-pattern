package com.libuyan.designpattern.__k__state;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author libuyan
 * @date 2021/5/12 16:30
 */
public class TestMain {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.turnCrank();
        gumballMachine.returnQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.returnQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        int dayInWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        if(dayInWeek == 1) {
            calendar.add(Calendar.DAY_OF_YEAR, -6);
        } else {
            calendar.add(Calendar.DAY_OF_YEAR, -dayInWeek + 2);
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
