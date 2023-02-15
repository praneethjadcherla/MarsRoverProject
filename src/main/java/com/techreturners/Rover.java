package com.techreturners;

public class Rover extends MarsVehicleImpl {

    RoverMissionControls roverService=new RoverMissionControlsImpl();
    public Rover(String roverInitialPosition){
        super(roverInitialPosition);
    }

    @Override
    public String instructionsToMoveRover(String instructions) {
        for(int letter=0;letter<instructions.length();letter++){
            if(instructions.charAt(letter) == 'L'){
                roverService.rotateLeft(directionFacing);
            } else if (instructions.charAt(letter) == 'R') {
                if(getDirectionFacing().equals(DirectionFacing.N)){
                    setDirectionFacing(DirectionFacing.E);
                } else if (getDirectionFacing().equals(DirectionFacing.W)) {
                    setDirectionFacing(DirectionFacing.N);
                } else if (getDirectionFacing().equals(DirectionFacing.S)) {
                    setDirectionFacing(DirectionFacing.W);
                } else {
                    setDirectionFacing(DirectionFacing.S);
                }
            } else if (instructions.charAt(letter) == 'M') {
                if(getDirectionFacing().equals(DirectionFacing.N)){
                    setY_coordinate(getY_coordinate()+1);
                } else if (getDirectionFacing().equals(DirectionFacing.W)) {
                    setX_coordinate(getX_coordinate()-1);
                } else if (getDirectionFacing().equals(DirectionFacing.S)) {
                    setY_coordinate(getY_coordinate()-1);
                } else {
                    setX_coordinate(getX_coordinate()+1);
                }
            }
        }
        return getX_coordinate()+" "+getY_coordinate()+" "+getDirectionFacing();
    }
}
