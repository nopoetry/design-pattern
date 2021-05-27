package com.libuyan.designpattern.__d3__factoryDemo.v3_simlpleFactory;

import com.libuyan.designpattern.__d3__factoryDemo.v2_orientedObject.operation.Add;
import com.libuyan.designpattern.__d3__factoryDemo.v3_simlpleFactory.operation.Operation;

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
        OperationFactory operationFactory = new OperationFactory();
        Operation op = operationFactory.getOperation(operation);
        op.setNum1(a);
        op.setNum2(b);
        System.out.println(op.getResult());

        System.out.println(num1 + operation + num2 + " = " + result);
    }
}
