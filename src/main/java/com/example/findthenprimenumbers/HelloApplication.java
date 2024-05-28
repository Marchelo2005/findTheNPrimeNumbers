package com.example.findthenprimenumbers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication  {


    public static void main(String[] args) {
        int iteration=0;
        Scanner numberN = new Scanner(System.in);
        System.out.println("Find the n prime numbers \n Assigns the value of N");
        int intNumberN= numberN.nextInt();
        System.out.println("The prime numbers up to " +intNumberN+ " are");
        for (iteration=1 ; iteration<=intNumberN;iteration++){
            if (iteration==2 || iteration==3 || iteration==5 ||iteration==7){
                System.out.println(iteration);
            }
            if (iteration==1||iteration%2==0 || iteration%3==0 || iteration%5==0 ||iteration%7==0){

            }else{
                System.out.println(iteration);
            }
        }
    }
}