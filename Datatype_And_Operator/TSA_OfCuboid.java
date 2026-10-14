package Datatype_And_Operator;

import java.util.Scanner;

public class TSA_OfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a length: ");
        double l = sc.nextDouble();

        System.out.println("Enter a breadth: ");
        double b = sc.nextDouble();

        System.out.println("Enter a height: ");
        double h = sc.nextDouble();

        double TSA = 2*(l*b + b*h + h*l);
        System.out.println("Total Surface Area of Cuboid : " + TSA);

    }
}
