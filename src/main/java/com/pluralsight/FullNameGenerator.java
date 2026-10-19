package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner (System.in);
        System.out.println("what is your first name?");
        String firstName =myScanner.nextLine();
        System.out.println("what is your middle name?");
        String middleName = myScanner.nextLine();
        System.out.println("what is your last name?");
        String lastNAme= myScanner.nextLine();
        System.out.println("enter suffix");
        String Suffix = myScanner.nextLine();
        nameList(firstName,middleName,lastNAme,Suffix);
        String fullName = nameList(firstName,middleName,lastNAme,Suffix);
        System.out.println( fullName);


    } public static String nameList(String name, String mname, String lname,String suffix) {
        return  name + " " + (mname.isEmpty() ? "" : mname ) + lname + (suffix.isEmpty() ? " " : ", " + suffix);
    }

}
