package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void checkRoverMoveLeftInstructions() {
        MarsRover rover = new MarsRover(1, 2, DirectionFacing.N);

        assertEquals("1 3 N", rover.instructionsToMoveRover("LMLMLMLMM"));
        //System.out.println(rover.instructionsToMoveRover("MMRMMRMRRM"));
    }

    @Test
    public void checkRoverMoveRightInstructions() {
        MarsRover rover = new MarsRover(3, 3, DirectionFacing.E);

        assertEquals("5 1 E", rover.instructionsToMoveRover("MMRMMRMRRM"));

    }
}
