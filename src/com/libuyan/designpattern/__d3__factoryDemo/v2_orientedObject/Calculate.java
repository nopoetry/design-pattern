package com.libuyan.designpattern.__d3__factoryDemo.v2_orientedObject;

import com.libuyan.designpattern.__d3__factoryDemo.v2_orientedObject.operation.Add;
import com.libuyan.designpattern.__d3__factoryDemo.v2_orientedObject.operation.Operation;

import java.util.Scanner;

/**
 * @author libuyan
 * @date 2021/5/8 20:54
 */
public class Calculate {
    public static void main(String[] args) {
        // 1、先接受数据的输入
        // 2、进行计算
        // 3、返回计算结果
        System.out.println("********计算器********\n 请输入第一个数：");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();

        System.out.println("请输入运算符：");
        String operation = scanner.nextLine();

        System.out.println("请输入第二个数：");
        String num2 = scanner.nextLine();

        System.out.println("开始计算。。。。。。");
        double result = 0;

        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        if ("+".equals(operation)) {
            Operation op = new Add();
            op.setNum1(a);
            op.setNum2(b);
            result = op.getResult();
        } else if ("-".equals(operation)) {
            result = Double.parseDouble(num1) - Double.parseDouble(num2);
        } else if ("*".equals(operation)) {
            result = Double.parseDouble(num1) * Double.parseDouble(num2);
        } else if ("/".equals(operation)) {
            if (Double.parseDouble(num2) != 0) {
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
            } else {
                System.out.println("除数不能为0！");
                return;
            }
        }

        System.out.println(num1 + operation + num2 + " = " + result);
    }
}
