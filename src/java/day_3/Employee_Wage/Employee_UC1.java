package src.java.day_3.Employee_Wage;

public class Employee_UC1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee");
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == isFullTime){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is Absent");
        }
    }

}
