package src.java.day_3.Practice;

import java.util.Scanner;

public class UC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X co-ordinates of line 1");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.println("Enter Y co-ordinates of line 1");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter X co-ordinates of line 2");
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        System.out.println("Enter Y co-ordinates of line 2");
        int y3 = sc.nextInt();
        int y4 = sc.nextInt();
        double length1 = Math.sqrt(Math.pow(x2, x1) + Math.pow(y2, y1));
        double length2 = Math.sqrt(Math.pow(x4, x3) + Math.pow(y4, y3));
        if (length1 == length2) {
            System.out.println("line 1 and 2 is equal");
        }else if (length1 > length2){
            System.out.println("line 1 is greater than line 2");
        } else {
            System.out.println("line 1 is less than line 2");
        }
    }
}
