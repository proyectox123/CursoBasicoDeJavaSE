package com.mho.amazonviewer;

public class Main {

    public static void main(String[] args){
        int exit = 0;
        do{
            System.out.println("Welcome to Amazon Viewer!!!");
            System.out.println();
            System.out.println("Select the option's number you want: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("0. Exit");
        }while(exit != 0);
    }
}
