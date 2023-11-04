package src.java.day_3.Practice;

import java.util.Scanner;

public class UC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X co-ordinates");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.println("Enter Y co-ordinates");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        double length = Math.sqrt(Math.pow(x2,x1) + Math.pow(y2,y1));
        System.out.println(length);

    }
}
