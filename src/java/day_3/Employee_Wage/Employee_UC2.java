package src.java.day_3.Employee_Wage;

import java.util.Scanner;

public class Employee_UC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee");
        Scanner sc = new Scanner(System.in);
        int isFullTime = 1;
        System.out.println("Enter the employee rate per hour");
        int empRatePerHour = sc.nextInt();
        System.out.println("Enter the employee working hour per day");
        int empHour = sc.nextInt();
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == isFullTime){
            empHour = 8;
            empWage = empHour * empRatePerHour;
            System.out.println("Employee Wage is "+empWage);
        } else  {
            System.out.println("Employee is absent");
        }

    }
}
