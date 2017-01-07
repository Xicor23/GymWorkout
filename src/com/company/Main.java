package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int sale[][]=new int[4][3];
        sale[0][0]=65;sale[0][1]=0;sale[0][2]=1;
        sale[1][0]=10;sale[1][1]=8;sale[1][2]=3;
        sale[2][0]=0;sale[2][1]=10;sale[2][2]=7;
        sale[3][0]=25;sale[3][1]=20;sale[3][2]=15;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add any events as the manager?");
        String s = scan.next().toLowerCase();

        if(s.equals("yes")){
            int newclass[]= new int[100];
            System.out.println("What classes do you want to add? Type done to finish adding");
            String a = scan.next().toLowerCase();
            int count = 3;
            while(!a.equals("done")){
                count+=1;
                a=scan.next().toLowerCase();
            }
            
        }


        else if(s.equals("no")){
            System.out.println("Are you a member, regular customer, or employee");
            String b =scan.next().toLowerCase();
            if(b.equals("regular customer")){
                System.out.println("What do you want to buy? Type 0 for membership, 1 for classes, and 3 for personal trainer, type -1 when you're done");
               int a = scan.nextInt();
                int count = 0;
                if(a!=0&&a!=1&&a!=3&&a!=-1){
                    System.out.println("Stop trying, now you have to restart");
                }
                else {
                    while (a != -1) {

                        count += sale[a][0];
                        a=scan.nextInt();
                    }
                    System.out.println("This will cost " + count + " dollars");
                }
            }
            if(b.equals("member")){
                System.out.println("What do you want to buy? Type 1 for classes, 2 for aquatics, and 3 for personal trainer, type -1 when you're done");
                int a = scan.nextInt();
                int count = 0;
                if(a!=1&&a!=2&&a!=3&&a!=-1){
                    System.out.println("Stop trying, now you have to restart");
                }
                else {
                    while (a != -1) {

                        count += sale[a][1];
                        a=scan.nextInt();
                    }
                    System.out.println("This will cost " + count + " dollars");
                }
            }
            if(b.equals("employee")){
                System.out.println("What do you want to buy? Type 0 for membership, 1 for classes, 2 for aquatics, and 3 for personal trainer, type -1 when you're done");
                int a = scan.nextInt();
                int count = 0;
                if(a!=0&&a!=1&&a!=2&&a!=3&&a!=-1){
                    System.out.println("Stop trying, now you have to restart");
                }
                else {
                    while (a != -1) {

                        count += sale[a][2];
                        a=scan.nextInt();
                    }
                    System.out.println("This will cost " + count + " dollars");
                }
            }

        }
        else{
            System.out.println("That is not a valid answer");
        }

    }
}
