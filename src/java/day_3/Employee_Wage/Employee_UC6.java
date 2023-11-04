package src.java.day_3.Employee_Wage;

import java.util.Scanner;

public class Employee_UC6 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee");
        Scanner sc = new Scanner(System.in);
        final int isFullTime = 1;
        final int isPartTime = 2;
        System.out.println("Enter the employee rate per hour");
        int empRatePerHour = sc.nextInt();
        System.out.println("Enter the working days");
        int workingDays = sc.nextInt();
        System.out.println("Enter the total working hours");
        int workingHours = sc.nextInt();
        int maxHours = 8*30;
        int totalWorkingDays = 26;
        int empHour = 0;
        int empWage = 0 ;
        int totalEmpWage = 0;
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
        while (workingHours > 0 && workingDays > 0
                && workingHours <= maxHours &&
                workingDays <= totalWorkingDays) {
            switch (empCheck) {
                case isFullTime:
                    empHour = 8;
                    break;
                case isPartTime:
                    empHour = 4;
                    break;
            }
            workingHours -= empHour;
            workingDays--;
            empWage = empHour * empRatePerHour;
            totalEmpWage += empWage;
        }
        if (totalEmpWage == 0){
            System.out.println("Employee is absent");
        }
        else{
            if(empCheck == 2){
                System.out.println("Part time Employee Wage is " + totalEmpWage);
            }else {
                System.out.println("Employee Wage is " + totalEmpWage);
            }
        }
    }

}
