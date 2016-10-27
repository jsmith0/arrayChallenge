package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        //this is not dynamic code

        /*
        int grades [] = {90, 95, 100};
            int sum = grades[0] + grades [1] + grades [2];
            double avg = sum/3;
        System.out.println(avg);
        */


        //this is dynamic code
        System.out.println("Enter your grades... type -1 to break it");
        Scanner kb = new Scanner(System.in);
        int grade = kb.nextInt();
        int i = 0;
        int sum = 0;
        int count = 0;
        int grades[] = new int[1000];


        while (true) {
            if (grade == -1) {
                break;
            }
            grades[i] = grade;
            sum = sum + grades[i];
            i++;
            double average = sum / grades.length;
                System.out.println(average);
        }
    }
}