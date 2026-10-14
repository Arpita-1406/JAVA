package Datatype_And_Operator;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter a radius: ");
        double r = sc.nextDouble();

        double volume = 4/3*(3.14*r*r*r);
        System.out.println("Volume of sphere: " + volume);

    }
    
}
