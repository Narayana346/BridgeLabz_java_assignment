package src.java.day_3.Employee_Wage;

import java.util.Scanner;

public class Employee_UC4 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee");
        Scanner sc = new Scanner(System.in);
        final int isFullTime = 1;
        final int isPartTime = 2;
        System.out.println("Enter the employee rate per hour");
        int empRatePerHour = sc.nextInt();
        int empHour = 0;
        int empWage = 0;
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
        switch (empCheck){
            case isFullTime:
            empHour = 8;
            empWage = empHour * empRatePerHour;
            System.out.println("Employee Wage is "+empWage);
            break;
            case isPartTime:
            empHour = 4;
            empWage = empHour * empRatePerHour;
            System.out.println("PartTime Employee Wage is "+empWage);
            break;
            default:
            if(empHour == 0) {
                System.out.println("Employee is absent");
            }
        }
    }

}
