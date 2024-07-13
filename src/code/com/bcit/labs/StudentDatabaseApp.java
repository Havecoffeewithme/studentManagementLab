/**
 * The main class.
 *
 * @Author : Percy Ratheko.
 */

package com.bcit.labs;

import java.util.Scanner;

public class StudentDatabaseApp
{
    public static void main(String[] args)
    {

        System.out.println("How many students do you wish to enroll?: ");
        Scanner in = new Scanner(System.in);
        int totalStudents = in.nextInt();
        Student[] students = new Student[totalStudents];

        for(int n=0 ; n < totalStudents ; n++)
        {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }



    }
}
