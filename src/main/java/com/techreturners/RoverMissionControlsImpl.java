package com.techreturners;

public class RoverMissionControlsImpl implements RoverMissionControls{

    @Override
    public DirectionFacing rotateLeft(DirectionFacing directionFacing){
        if (directionFacing.equals(DirectionFacing.N)){
            directionFacing=DirectionFacing.W;
        } else if (directionFacing.equals(DirectionFacing.W)) {
            directionFacing=DirectionFacing.S;
        } else if (directionFacing.equals(DirectionFacing.S)) {
            directionFacing=DirectionFacing.E;
        } else {
            directionFacing=DirectionFacing.N;
        }
        return directionFacing;
    }


}
