/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio5_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Lalik
 */
public class UserInput {
     public static int getInteger() {
        Scanner input = new Scanner(System.in);
        try {
            int x;
            x = input.nextInt();
            return x;
        } catch (Exception e) {
            System.out.println("Error");
            return -1;
        }
    }

    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        try {
            double x;
            x = input.nextDouble();
            return x;
        } catch (Exception e) {
            System.out.println("Error");
            return -1;
        }
    }

    public static char getChar() {
        Scanner input = new Scanner(System.in);
        try {
            char x;
            x = input.next().charAt(0);
            return x;
        } catch (Exception e) {
            System.out.println("Error");
            return 'L';
        }
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        String x;
        x = input.nextLine();
        return x;
    }


    static short getShort() { // Methodos gia eisagogi short
        String line;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        try {
            line = in.readLine();
            Short i = Short.parseShort(line);
            return i;
        } catch (Exception e) {
            return -1;
        }
    }

    //epiloges Menou
    static int getMenuChoice() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice < 1) {
            try {
                choice = Integer.parseInt(input.nextLine());
                if (choice <= 0) {
                    System.out.println("Den edwses egkuri epilogi");
                    System.out.println("Dwse Epilogh megaliterh tou 0 : " + "\n");
                    //  choice = Integer.parseInt(input.nextLine());
                }

            } catch (NumberFormatException e) {
                System.out.println("H Epilogh den einai Ari8mos	!");

            }
        }
        return choice;
    }

    //epiloges ypomenoy
    static int getSubMenuChoice() {
        int choice = 3;
        Scanner input = new Scanner(System.in);
        while (choice < 0 || choice > 1) {
            try {
                choice = Integer.parseInt(input.nextLine());
                if (choice <= -1 || choice >= 2) {
                    System.out.println("Den edwses egkuri epilogi");
                    System.out.println("Dwse Epilogh anamesa se 0-1 : " + "\n");
                    //  choice = Integer.parseInt(input.nextLine());
                }

            } catch (NumberFormatException e) {
                System.out.println("H Epilogh den einai Ari8mos	!");

            }
        }
        return choice;
    }

    //random dieu8inseis
    public static String rndAddress() {
        String rndString = "";
        int rndnumber = 0;
        rndnumber = 1 + (int) (Math.random() * 200);
        for (int i = 0; i < 7; i++) {
            char c = (char) (65 + (int) (Math.random() * 26));
            rndString = rndString + c;

        }
        return rndString + " " + rndnumber;
    }

    //random colors
    public static String rndColors() {
        int choice = 1 + (int) (Math.random() * 6);

        if (choice == 1) {
            return "Blue";
        } else if (choice == 2) {
            return "Black";
        } else if (choice == 3) {
            return "Red";
        } else if (choice == 4) {
            return "Yellow";
        } else if (choice == 5) {
            return "Purple";
        } else if (choice == 6) {
            return "White";
        } else
            return "Green";
    }
}
