/**
 * The following class represents the Student class and its attributes and performs various methods.
 * @Author : Percy Ratheko
 *
 */

package com.bcit.labs;

import java.util.Scanner;


public class Student
{
    private final String firstName;

    private final String lastName;

    private final int yearOfStudy;

    private String studentID;
    private String courses = null;
    private int tuitionBalance;

    private final static int COST_PER_COURSE_IN_USD;
    private static int id ;

    static
    {
        COST_PER_COURSE_IN_USD = 500;
        id = 2000;
    }


    /**
     * Constructor.

     * Prompts the user for their first name, last name and year of study.
     */
    public Student()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter year of study : enter a number\n1-freshman\n2-sophmore\n3-senior\n4-postgrad");
        this.yearOfStudy = in.nextInt();

        setStudentID();

    }


    /**
     * sets the student number.
     */
    private void setStudentID()
    {
        id++;
        this.studentID = yearOfStudy + " " + id;
    }


    /**
     * To enroll for a course.
     */
    public void enroll()
    {
        do
        {
            System.out.println("Enter a course to Enroll (Q to Quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + COST_PER_COURSE_IN_USD;
            }
            else{
                break;
            }

        }while(1 != 0);

        System.out.println("Enrolled in: " + courses);
        System.out.println("\nTUITION BALANCE: " + tuitionBalance);

    }


    /**
     * The method to view balance.
     */
    public void viewBalance()
    {
        System.out.println("YOUR BALANCE IS: "  + tuitionBalance);
    }


    /**
     * the method for paying tuition.

     * Prompts the user enter payment amount in dollars.
     */
    public void payTuition()
    {
        System.out.println("Please enter your payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance + payment;
        System.out.println("Thank you for your payment of: " + payment);
        viewBalance();
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "firstName=' " + firstName + '\'' +
                ", lastName=' " + lastName + '\'' +
                ", yearOfStudy= " + yearOfStudy +
                ", studentID='" + studentID + '\'' +
                ", courses=' " + courses + '\'' +
                ", tuitionBalance= " + tuitionBalance +
                '}';
    }


}
