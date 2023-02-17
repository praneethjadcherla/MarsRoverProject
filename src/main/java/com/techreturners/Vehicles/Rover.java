package com.techreturners.Vehicles;

import com.techreturners.Plateau.SquarePlateau;
import com.techreturners.VehicleController.RoverMissionControls;
import com.techreturners.VehicleController.RoverMissionControlsImpl;

public class Rover extends MarsVehicleImpl {
    RoverMissionControls roverService = new RoverMissionControlsImpl();
    public Rover(String roverInitialPosition) throws Exception {
        super(roverInitialPosition);
        if(!isValidPosition()){
            throw new Exception("Invalid Rover initial Position ! Please enter valid rover position ");
        }
    }

    @Override
    public String instructionsToMoveRover(String instructions, Rover rover) throws Exception {
        for (int letter = 0; letter < instructions.length(); letter++) {
            if (instructions.charAt(letter) == 'L') {
                roverService.rotateLeft(rover);
            } else if (instructions.charAt(letter) == 'R') {
                roverService.rotateRight(rover);
            } else if (instructions.charAt(letter) == 'M' && canRoverMoveForward()) {
                roverService.moveForward(rover);
            } else{
                throw new Exception("Invalid Instruction! Please provide valid instructions");
            }
        }
        return getX_coordinate() + " " + getY_coordinate() + " " + getDirectionFacing();
    }

    public boolean isValidPosition(){
        return (getX_coordinate()<= SquarePlateau.max_X_Coordinate && getY_coordinate()<=SquarePlateau.max_Y_Coordinate &&
           getX_coordinate()>=SquarePlateau.MIN_X_COORDINATE && getY_coordinate()>=SquarePlateau.MIN_Y_COORDINATE);
    }

    public boolean canRoverMoveForward() throws Exception {
        if(getX_coordinate() == SquarePlateau.max_X_Coordinate && getDirectionFacing().equals(DirectionFacing.E)){
            throw new Exception("Obstacle! Rover cannot move forward");
        } else if (getY_coordinate() == SquarePlateau.max_Y_Coordinate && getDirectionFacing().equals(DirectionFacing.N)) {
            throw new Exception("Obstacle! Rover cannot move forward");
        } else if (getX_coordinate() == SquarePlateau.MIN_X_COORDINATE && getDirectionFacing().equals(DirectionFacing.W)) {
            throw new Exception("Obstacle! Rover cannot move forward");
        } else if (getY_coordinate() == SquarePlateau.MIN_Y_COORDINATE && getDirectionFacing().equals(DirectionFacing.S)) {
            throw new Exception("Obstacle! Rover cannot move forward");
        } else{
            return true;
        }
    }
}
