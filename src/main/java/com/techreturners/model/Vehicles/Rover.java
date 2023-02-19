package com.techreturners.model.Vehicles;

import com.techreturners.model.Plateau.SquarePlateau;
import com.techreturners.model.VehicleController.RoverMissionControls;
import com.techreturners.model.VehicleController.RoverMissionControlsImpl;
//import jdk.internal.icu.impl.BMPSet;

import java.util.ArrayList;
import java.util.List;

public class Rover extends MarsVehicleImpl {
    RoverMissionControls roverService = new RoverMissionControlsImpl();
    private String roverFinalPosition;
    private static List<String> listOfRovers = new ArrayList<>();

    public Rover(String roverInitialPosition) throws Exception {
        super(roverInitialPosition);
        if (!isValidPosition()) {
            throw new Exception("Invalid Rover initial Position ! Please enter valid rover position ");
        }
    }

    @Override
    public String instructionsToMoveRover(String instructions, Rover rover) throws Exception {
        //roverFinalPosition=getX_coordinate() + " " + getY_coordinate() + " " + getDirectionFacing();
        for (int letter = 0; letter < instructions.length(); letter++) {
            if (instructions.charAt(letter) == 'L') {
                roverService.rotateLeft(rover);
            } else if (instructions.charAt(letter) == 'R') {
                roverService.rotateRight(rover);
            } else if (instructions.charAt(letter) == 'M' && canRoverMoveForward()) {
                roverService.moveForward(rover);
            } else {
                throw new Exception("Invalid Instruction! Please provide valid instructions");
            }
            roverFinalPosition = getX_coordinate() + " " + getY_coordinate();
        }
        listOfRovers.add(roverFinalPosition);
        return roverFinalPosition + " " + getDirectionFacing();
    }

    @Override
    public boolean isValidPosition() {
        return (getX_coordinate() <= SquarePlateau.max_X_Coordinate && getY_coordinate() <= SquarePlateau.max_Y_Coordinate &&
                getX_coordinate() >= SquarePlateau.MIN_X_COORDINATE && getY_coordinate() >= SquarePlateau.MIN_Y_COORDINATE);
    }

    @Override
    public boolean canRoverMoveForward() throws Exception {
        if (getDirectionFacing().equals(DirectionFacing.E) && (getX_coordinate() == SquarePlateau.max_X_Coordinate || listOfRovers.contains(getX_coordinate() + 1 + " " + getY_coordinate()))) {
            throw new Exception("Obstacle! Rover cannot move forward");
        } else if (getDirectionFacing().equals(DirectionFacing.N) && (getY_coordinate() == SquarePlateau.max_Y_Coordinate || listOfRovers.contains(getX_coordinate() + " " + getY_coordinate() + 1))) {
            throw new Exception("Obstacle! Rover cannot move forward");
        } else if (getDirectionFacing().equals(DirectionFacing.W) && (getX_coordinate() == SquarePlateau.MIN_X_COORDINATE || listOfRovers.contains(getX_coordinate() - 1 + " " + getY_coordinate()))) {
            throw new Exception("Obstacle! Rover cannot move forward");
        } else if (getDirectionFacing().equals(DirectionFacing.S) && (getY_coordinate() == SquarePlateau.MIN_Y_COORDINATE || listOfRovers.contains(getX_coordinate() + " " + (getY_coordinate() - 1)))) {
            throw new Exception("Obstacle! Rover cannot move forward");
        } else {
            return true;
        }
    }
}
