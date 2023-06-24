/*
Student Database Program
@author Dhruvi
* */

package com.StudentDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Main {

    public static void add() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String StudentName;
        String StudentCity;
        String StudentPhone;
        System.out.println("Enter Name : ");
        StudentName = br.readLine();
        System.out.println("Enter City : ");
        StudentCity = br.readLine();
        System.out.println("Enter Phone Number");
        StudentPhone = br.readLine();

        Details details = new Details(StudentName, StudentCity, StudentPhone);
        boolean check = Query.insertQuery(details);
        if (check) {
            System.out.println("Successfully Added");
        } else {
            System.out.println("Something went wrong. Please try again later.");
        }
        System.out.println(details);
    }

    public static void remove() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Student Id : ");
        int id = Integer.parseInt(br.readLine());

        boolean check = Query.deleteQuery(id);
        if (check) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Something went wrong. Please try again later");
        }
    }

    public static void display() {
        System.out.println("Details of student");
        boolean check = Query.displayQuery();
        if (check) {
            System.out.println("Details : ");
        } else {
            System.out.println("Nothing to display.");
        }
    }

    public static void update() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.println("Which Student Detail you want to update ? Enter Id  ");
        int sId = Integer.parseInt(bufferedReader.readLine());
        System.out.println("What detail you want to update");
        System.out.println("Press\na for name\nb for city\nc for phone number");
        char Opt = sc.next().charAt(0);
        int intOpt = (int) Opt;

        switch (intOpt) {
            case 97:
                String sname = "sname";
                System.out.println("Enter new Name : ");
                String Namevalue = bufferedReader.readLine();
                boolean check1 = Query.updateQuery(sname, Namevalue, sId);
                if (check1) {
                    System.out.println("Successfully Updated");
                } else {
                    System.out.println("Something went wrong. Try again later");
                }
                break;
            case 98:
                String scity = "scity";
                System.out.println("Enter new City : ");
                String CityValue = bufferedReader.readLine();
                boolean check2 = Query.updateQuery(scity, CityValue, sId);
                if (check2) {
                    System.out.println("Successfully Updated");
                } else {
                    System.out.println("Something went wrong. Try again later");
                }
                break;
            case 99:
                String sphone = "sphone";
                System.out.println("Enter new Phone number : ");
                String PhoneNumberValue = bufferedReader.readLine();
                boolean check3 = Query.updateQuery(sphone, PhoneNumberValue, sId);
                if (check3) {
                    System.out.println("Successfully Updated");
                } else {
                    System.out.println("Something went wrong. Try again later");
                }
                break;
            default:
                System.out.println("Enter Valid Choice!!!");
        }


    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        System.out.println("*-*-*-*-Student Database-*-*-*-*");
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice, ch = 1;


        while (ch == 1) {
            System.out.println("Enter\n1 to ADD\n2 to DELETE\n3 to DISPLAY\n4 to UPDATE\n5 to EXIT");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    return;
                default:
                    System.out.println("Enter valid choice!!!");
            }
            System.out.println("Press 1 to continue");
            ch = sc.nextInt();
        }
    }
}
