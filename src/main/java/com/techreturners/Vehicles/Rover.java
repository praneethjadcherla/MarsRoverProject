package com.techreturners.Vehicles;

import com.techreturners.VehicleController.RoverMissionControls;
import com.techreturners.VehicleController.RoverMissionControlsImpl;

public class Rover extends MarsVehicleImpl {
    RoverMissionControls roverService = new RoverMissionControlsImpl();
    public Rover(String roverInitialPosition){
        super(roverInitialPosition);
    }

    @Override
    public String instructionsToMoveRover(String instructions, Rover rover) {
        for (int letter = 0; letter < instructions.length(); letter++) {
            if (instructions.charAt(letter) == 'L') {
                roverService.rotateLeft(rover);
            } else if (instructions.charAt(letter) == 'R') {
                roverService.rotateRight(rover);
            } else if (instructions.charAt(letter) == 'M') {
                roverService.moveForward(rover);
            }
        }
        return getX_coordinate() + " " + getY_coordinate() + " " + getDirectionFacing();
    }
}
