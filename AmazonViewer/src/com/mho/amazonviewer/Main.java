package com.mho.amazonviewer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int exit;
        do{
            System.out.println("Welcome to Amazon Viewer!!!");
            System.out.println();
            System.out.println("Select the option's number you want: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("0. Exit");

            int option = getUserOption();

            switch (option){
                case 0:
                    exit = 0;
                    break;
                case 1:
                    exit = 1;
                    break;
                case 2:
                    exit = 1;
                    break;
                case 3:
                    exit = 1;
                    break;
                case 4:
                    exit = 1;
                    break;
                default:
                    exit = 1;
                    break;
            }

        }while(exit != 0);
    }

    private static int getUserOption(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
