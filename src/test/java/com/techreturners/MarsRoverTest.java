package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void checkRoverMoveLeftInstructions() {
        MarsVehicle rover = new Rover("1 2 N");

        assertEquals("1 3 N", rover.instructionsToMoveRover("LMLMLMLMM"));
        //System.out.println(rover.instructionsToMoveRover("MMRMMRMRRM"));
    }

    @Test
    public void checkRoverMoveRightInstructions() {
        MarsVehicle rover = new Rover("3 3 E");

        assertEquals("5 1 E", rover.instructionsToMoveRover("MMRMMRMRRM"));

    }
}
