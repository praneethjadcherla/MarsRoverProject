package com.techreturners.Vehicles;

public abstract class MarsVehicleImpl implements MarsVehicle {
    private int x_coordinate;
    private int y_coordinate;
    private DirectionFacing directionFacing;

    public MarsVehicleImpl(String roverInitialPosition) {
        this.x_coordinate = Integer.parseInt(String.valueOf(roverInitialPosition.charAt(0)));
        this.y_coordinate = Integer.parseInt(String.valueOf(roverInitialPosition.charAt(2)));
        this.directionFacing = DirectionFacing.valueOf(String.valueOf(roverInitialPosition.charAt(4)));
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public DirectionFacing getDirectionFacing() {
        return directionFacing;
    }

    public void setDirectionFacing(DirectionFacing directionFacing) {
        this.directionFacing = directionFacing;
    }

    public abstract String instructionsToMoveRover(String instructions, Rover rover) throws Exception;
}
