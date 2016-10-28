package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int grades[] = new int[1000];
        Scanner input = new Scanner(System.in);
        int grade;
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Enter a grade or \"-1\" to see your grade.");
            grade = input.nextInt();
            if (grade == -1)
                break;
            grades[count] = grade;

            sum = sum + grades[count];
            count++;
        }

        int average = sum / count;
        System.out.println("Your average is: " + average);

        String names[] = new String [1000];
        Scanner input2 = new Scanner(System.in);
        String name;
        int count2 = 0;
        int sum2 = 0;
        while(true) {
            System.out.println("Enter a Name or \"-1\" to link to grades.");
            name = input2.nextLine();
            if (name.equals("-1")){
                break;
            }
            names[count2] = name;
            count2++;
        }
        for(int e = 0; e < count2 || e < count; e++) {
            System.out.println(grades[e] + " : " + names[e]);
        }
    }
}
