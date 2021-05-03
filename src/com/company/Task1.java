package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write radius");
        double radius = scanner.nextDouble();


        for (; ;){
            System.out.println("write 1 or 2 or 3");
            String i = scanner.next();
            if (i.equals("1")){
                double perimeter = 2*3.14*radius;
                System.out.println("perimeter = "+ perimeter);
                continue;
            }
            if (i.equals("2")){
                double area = 3.14*radius*radius;
                System.out.println("area = "+ area );
                continue;
            }
            if (i.equals("3")){
                break;
            }else{
                System.out.println("write normal tiv");
                continue;
            }
        }
    }
}
