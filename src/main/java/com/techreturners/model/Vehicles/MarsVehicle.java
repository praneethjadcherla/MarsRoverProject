package com.techreturners.model.Vehicles;

public interface MarsVehicle {
    String instructionsToMoveRover(String instructions, Rover rover) throws Exception;

    boolean isValidPosition();

    boolean canRoverMoveForward() throws Exception;
}
