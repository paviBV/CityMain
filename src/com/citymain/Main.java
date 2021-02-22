package com.citymain;

import com.citymain.manager.CMManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CMManager cmManager = new CMManager();
//        cmManager.getCityMainList();
//        cmManager.SingleCityMain("C001");
//        cmManager.UpdateCityMain("C003");
//        cmManager.DeleteCityMain("C004");
        Scanner sc = new Scanner(System.in);
        int Choice = 0;

        do{
            System.out.println("Please enter the Option");
            System.out.println("Option 1: Add");
            System.out.println("Option 2: Display");
            System.out.println("Option 3: Update");
            System.out.println("Option 4: Search");
            System.out.println("Option 5: Delete");
            Choice = sc.nextInt();

            if(Choice==1){
                System.out.println("Please enter the Details of the record");
                System.out.println("Please enter the Id");
                int id = sc.nextInt();
                System.out.println("Please enter the Name");
                String name = sc.next();
                System.out.println("Please enter the Rank");
                int rank = sc.nextInt();
                cmManager.setCityMain(id, name, rank);

            }
            if(Choice==2){
                cmManager.getCityMainList();
            }
            if(Choice==3){
                System.out.println("Please enter the Details to update the record");
                System.out.println("Please enter the Id");
                int id = sc.nextInt();
                System.out.println("Please enter the Name");
                String name = sc.next();
                System.out.println("Please enter the pepl");
                int pepl = sc.nextInt();
                cmManager.UpdateCityMain(id,name,pepl);


            }
            if(Choice==4){
                System.out.println("Please enter the Details to Fetch the record");
                int id = sc.nextInt();
                cmManager.SingleCityMain(id);
            }
            if(Choice==5){
                System.out.println("Please enter the Details to Delete the record");
                int id = sc.nextInt();
                cmManager.DeleteCityMain(id);
                cmManager.getCityMainList();
            }


        }while (Choice !=6);

    }
}
