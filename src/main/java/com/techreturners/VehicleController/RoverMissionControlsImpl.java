package com.techreturners.VehicleController;

import com.techreturners.Vehicles.DirectionFacing;
import com.techreturners.Vehicles.Rover;

public class RoverMissionControlsImpl implements RoverMissionControls {

    @Override
    public void rotateLeft(Rover rover) {
        if (rover.getDirectionFacing().equals(DirectionFacing.N)) {
            rover.setDirectionFacing(DirectionFacing.W);
        } else if (rover.getDirectionFacing().equals(DirectionFacing.W)) {
            rover.setDirectionFacing(DirectionFacing.S);
        } else if (rover.getDirectionFacing().equals(DirectionFacing.S)) {
            rover.setDirectionFacing(DirectionFacing.E);
        } else {
            rover.setDirectionFacing(DirectionFacing.N);
        }
    }

    @Override
    public void rotateRight(Rover rover) {
        if (rover.getDirectionFacing().equals(DirectionFacing.N)) {
            rover.setDirectionFacing(DirectionFacing.E);
        } else if (rover.getDirectionFacing().equals(DirectionFacing.W)) {
            rover.setDirectionFacing(DirectionFacing.N);
        } else if (rover.getDirectionFacing().equals(DirectionFacing.S)) {
            rover.setDirectionFacing(DirectionFacing.W);
        } else {
            rover.setDirectionFacing(DirectionFacing.S);
        }
    }

    @Override
    public void moveForward(Rover rover){
        if (rover.getDirectionFacing().equals(DirectionFacing.N)) {
            rover.setY_coordinate(rover.getY_coordinate() + 1);
        } else if (rover.getDirectionFacing().equals(DirectionFacing.W)) {
            rover.setX_coordinate(rover.getX_coordinate() - 1);
        } else if (rover.getDirectionFacing().equals(DirectionFacing.S)) {
            rover.setY_coordinate(rover.getY_coordinate() - 1);
        } else {
            rover.setX_coordinate(rover.getX_coordinate() + 1);
        }
    }
}
