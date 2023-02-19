package com.techreturners;

import com.techreturners.model.Plateau.Plateau;
import com.techreturners.model.Plateau.SquarePlateau;
import com.techreturners.model.Vehicles.MarsVehicle;
import com.techreturners.model.Vehicles.Rover;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarsRoverTest {
    @Test
    public void checkRoverMoveLeftInstructions() throws Exception {
        Plateau square = new SquarePlateau("5 5");

        MarsVehicle rover = new Rover("1 2 N");

        assertEquals("1 3 N", rover.instructionsToMoveRover("LMLMLMLMM", (Rover) rover));
    }

    @Test
    public void checkRoverMoveRightInstructions() throws Exception {
        Plateau square = new SquarePlateau("5 5");

        MarsVehicle rover = new Rover("3 3 E");

        assertEquals("5 1 E", rover.instructionsToMoveRover("MMRMMRMRRM", (Rover) rover));
    }

    @Test
    public void checkPlateauMaximumCoordinates() {
        Plateau square = new SquarePlateau("5 5");

        assertEquals(5, square.getMax_X_Coordinate());
        assertEquals(5, square.getMax_Y_Coordinate());
    }

    @Test
    public void checkInvalidPlateauCoordinates() {

        assertThrows(NumberFormatException.class, () -> new SquarePlateau("-1 -1"));
    }

    @Test
    public void checkInvalidInitalRoverPosition() throws Exception {
        Plateau square = new SquarePlateau("5 5");

        assertThrows(Exception.class, () -> new Rover("6 6 N"));
    }

    @Test
    public void checkObstacleWhenReachedMaxCoordinates() throws Exception {
        Plateau square = new SquarePlateau("5 5");

        MarsVehicle rover = new Rover("5 4 E");

        assertThrows(Exception.class, () -> rover.instructionsToMoveRover("M", (Rover) rover));
    }

    @Test
    public void checkObstacleWhenAnotherRoverPresent() throws Exception {
        Plateau square = new SquarePlateau("5 5");

        MarsVehicle rover1 = new Rover("1 2 N");
        rover1.instructionsToMoveRover("LMLMLMLMM", (Rover) rover1);
        MarsVehicle rover2 = new Rover("0 3 E");

        assertThrows(Exception.class, () -> rover2.instructionsToMoveRover("M", (Rover) rover2));
    }

    @ParameterizedTest
    @CsvSource({"0 0 N,MRMLMRMLMR,2 3 E", "3 4 W,MMMLMMMMLL,0 0 N", "5 4 S,RRMLMMLMLMMR,5 4 S"})
    public void checkValidRoversFinalPosition(ArgumentsAccessor argumentsAccessor) throws Exception {
        Plateau square = new SquarePlateau("5 5");

        MarsVehicle rover1 = new Rover(argumentsAccessor.getString(0));
        String actualFinalPosition = rover1.instructionsToMoveRover(argumentsAccessor.getString(1), (Rover) rover1);
        String expectedFinalPosition = argumentsAccessor.getString(2);

        assertEquals(expectedFinalPosition, actualFinalPosition);
    }
}
