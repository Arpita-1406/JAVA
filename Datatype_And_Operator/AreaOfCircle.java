package Datatype_And_Operator;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double r = sc.nextDouble();

        double area = 3.14*r*r;
        System.out.println("Area Of Circle: " + area);
    }
}
