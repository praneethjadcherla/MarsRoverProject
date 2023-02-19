package com.techreturners.app;

import com.techreturners.model.Plateau.Plateau;
import com.techreturners.model.Plateau.SquarePlateau;
import com.techreturners.model.Vehicles.MarsVehicle;
import com.techreturners.model.Vehicles.Rover;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Plateau Maximum Coordinates");
        Plateau square = new SquarePlateau(scanner.nextLine());

        System.out.println("Enter the intial position of Rover");

        while (scanner.hasNextLine()) {

            MarsVehicle rover1 = new Rover(scanner.nextLine());

            System.out.println("Enter instructions to move rover");

            String output = rover1.instructionsToMoveRover(scanner.nextLine(), (Rover) rover1);
            System.out.println("The Final position of rover : " + output);
            System.out.println("Enter the intial position of next Rover");
        }
    }
}
