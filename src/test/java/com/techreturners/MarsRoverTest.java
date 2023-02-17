package com.techreturners;

import com.techreturners.Plateau.Plateau;
import com.techreturners.Plateau.SquarePlateau;
import com.techreturners.Vehicles.MarsVehicle;
import com.techreturners.Vehicles.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void checkRoverMoveLeftInstructions() throws Exception {
        Plateau square=new SquarePlateau("5 5");
        MarsVehicle rover = new Rover("1 2 N");

        assertEquals("1 3 N", rover.instructionsToMoveRover("LMLMLMLMM", (Rover) rover));
        //System.out.println(rover.instructionsToMoveRover("MMRMMRMRRM"));
    }

    @Test
    public void checkRoverMoveRightInstructions() throws Exception {
        Plateau square=new SquarePlateau("5 5");
        MarsVehicle rover = new Rover("3 3 E");

        assertEquals("5 1 E", rover.instructionsToMoveRover("MMRMMRMRRM", (Rover) rover));

    }

    @Test
    public void checkPlateauMaximumCoordinates(){
        Plateau square=new SquarePlateau("5 5");

        assertEquals(5,square.getMax_X_Coordinate());
        assertEquals(5,square.getMax_Y_Coordinate());
    }
}
