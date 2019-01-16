package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double dimOne, dimTwo;                    //declaring dimensions
        double dimOneInch, dimTwoInch;
        double InchRain;                         //Ask Inches of rainfall
        double cubInch;                          //calculate cubic inches of water
        double runOffAmt;

        Scanner n = new Scanner(System.in);
        System.out.println("Enter the Dimension 1 ");
        dimOne = n.nextDouble();
        System.out.println("Enter the Dimension 2 ");
        dimTwo = n.nextDouble();

        dimOneInch = dimOne * 12;
        dimTwoInch = dimTwo * 12;

        System.out.println("Enter Inches of Rainfall");
        InchRain = n.nextDouble();

        cubInch = dimOneInch * dimTwoInch *InchRain;

        runOffAmt = cubInch / 231;

        System.out.println("Amount of Run Off Water" +runOffAmt);

    }
}
