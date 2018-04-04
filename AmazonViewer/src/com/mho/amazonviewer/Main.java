package com.mho.amazonviewer;

import com.mho.amazonviewer.model.Movie;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Movie movie =
                new Movie("Coco", "Animation", "Lee Unkrich", 120, (short) 2017);
        Movie movie2 =
                new Movie("Coco", "Animation", "Lee Unkrich", 120, (short) 2017);

        System.out.println(movie == movie2);
        System.out.println(movie.equals(movie2));

        System.out.println(movie.toString());

        //showMenu();
    }

    private static void showMenu(){
        int exit = 0;
        do{
            System.out.println("Welcome to Amazon Viewer!!!");
            System.out.println();
            System.out.println("Select the option's number you want: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");

            int option = getUserOption();

            switch (option){
                case 0:
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                default:
                    break;
            }

        }while(exit != 0);
    }

    public static void showMovies(){
        int exit = 0;
        do{
            System.out.println();
            System.out.println(":: MOVIES ::");
            System.out.println();
        }while(exit != 0);
    }

    public static void showSeries(){
        int exit = 0;
        do{
            System.out.println();
            System.out.println(":: SERIES ::");
            System.out.println();
        }while(exit != 0);
    }

    public static void showChapters(){
        int exit = 0;
        do{
            System.out.println();
            System.out.println(":: CHAPTERS ::");
            System.out.println();
        }while(exit != 0);
    }

    public static void showBooks(){
        int exit = 0;
        do{
            System.out.println();
            System.out.println(":: BOOKS ::");
            System.out.println();
        }while(exit != 0);
    }

    public static void showMagazines(){
        int exit = 0;
        do{
            System.out.println();
            System.out.println(":: MAGAZINES ::");
            System.out.println();
        }while(exit != 0);
    }

    public static void makeReport(){

    }

    public static void makeReport(Date date){

    }

    private static int getUserOption(){
        try{
            Scanner sc = new Scanner(System.in);
            return Integer.parseInt(sc.nextLine());
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
