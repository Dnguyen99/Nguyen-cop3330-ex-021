package com.company;
import java.util.*;

class NumToName {
    public String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "You have entered an invalid input.";
        }
    }
}

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    NumToName ntn = new NumToName();
        System.out.print("Please enter the number of the month: ");
        int month = scan.nextInt();
        String result = ntn.getMonth(month);
        if(month > 0 && month < 13) {
            System.out.println("The name of the month is " +result+ ".");
        }
        else {
            System.out.println(result+ "Please enter correct month number.");
        }
    }
}
